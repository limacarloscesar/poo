package br.iftm.edu.prova2;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ClasseSwing implements Runnable{

	@Override
	public void run() {
		JFrame f = new JFrame("Interface gráfica do Usuário");
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setLayout(new FlowLayout());
		
		f.add(new JLabel("Hello, world!"));
		
		f.add(new JButton("Clique me!"));
		
		f.pack();
		
		f.setSize(300, 80);
		
		f.setVisible(true);
		
	}

}
