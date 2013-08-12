package demo.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class DemoFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DemoFrame(){
		super();
		this.setLayout(new BorderLayout());
		DemoButton db = new DemoButton("Write something to file...");
		db.setPreferredSize(new Dimension(100, 50));
		this.add(db, BorderLayout.CENTER);
		setSize(new Dimension(600, 400));
		setVisible(true);
	}

}
