package demo;

import demo.ui.*;
import file.io.*;

public class FileDemo{
	public FileDemo(){

	}

	public static void main(String[] args){
		DemoFrame df = new DemoFrame();
		DemoWindowAdapter dwa = new DemoWindowAdapter(df);
		df.addWindowListener(dwa);
	
	}
	
	// Write files with a little bit time, just for test, note that there needs another thread
	public static void writeLargeFile(){
		(new Thread() {
			public void run() {
				for (int i = 1; i <= 10; i++) {
					StringBuffer sb = new StringBuffer();
					for (int j = 0; j < 100000; j++) {
						sb.append("chris");
					}
					FileProcess.write("demo" + i + ".txt", sb.toString());
				}
			}
		}).start();
	}
	
	// Delete all files, just for demo
	public static void deleteLargeFile(){
		for(int i = 1; i <= 10; i++){
			//FileProcess.delete("demo" + i + ".txt");				// may leave some files undeleted
			FileProcess.forceDelete("demo" + i + ".txt", 1);		// delete all files with proper time for release file lock
		}
	}
}
