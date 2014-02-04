package io.robusta.fora.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;

public class SwingApp {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingApp window = new SwingApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SwingApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 847, 285);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		CommentView commentView = new CommentView();
		GridBagLayout gridBagLayout = (GridBagLayout) commentView.getLayout();
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0};
		gridBagLayout.rowHeights = new int[]{28, 183, 17};
		frame.getContentPane().add(commentView, BorderLayout.CENTER);
		
		System.out.println("chg master");
	}

}
