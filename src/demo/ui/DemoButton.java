package demo.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import demo.*;

public class DemoButton extends JButton{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DemoButton(String title){
		super(title);
		this.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileDemo.writeLargeFile();
			}
		});
	}

	
}
