package demo.ui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import demo.FileDemo;


public class DemoWindowAdapter extends WindowAdapter{
	JFrame frame;
	
	public DemoWindowAdapter(JFrame frame){
		this.frame = frame;
	}
	
    public void windowClosing(WindowEvent e) {
        System.out.println("windowClosing");
        
        this.frame.dispose();
        FileDemo.deleteLargeFile();
        
        System.out.println("windowClosed");
        System.exit(0);
    }
}
