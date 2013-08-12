package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import file.io.*;

public class CopyFileDemo {
	public static void main(String[] args){
		try {
			FileProcess.copyFile(new FileInputStream("Chrysanthemum.jpg"), "out.jpg");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
