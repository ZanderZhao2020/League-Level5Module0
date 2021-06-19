package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	Random RandGen = new Random();
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		addNumbers.addActionListener(S -> {
			JOptionPane.showMessageDialog(null, Integer.parseInt(JOptionPane.showInputDialog("Enter number 1:")) + Integer.parseInt(JOptionPane.showInputDialog("Enter number 2:")));
		});
		randNumber.addActionListener(S -> {
			int Min = Integer.parseInt(JOptionPane.showInputDialog("Enter minimum:"));
			JOptionPane.showMessageDialog(null, Min + RandGen.nextInt(Integer.parseInt(JOptionPane.showInputDialog("Enter maximum:")) - Min + 1));
		});
		tellAJoke.addActionListener(S -> {
			JOptionPane.showMessageDialog(null, "Why was 10 afraid of 7? because 7 8 9");
		});
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
