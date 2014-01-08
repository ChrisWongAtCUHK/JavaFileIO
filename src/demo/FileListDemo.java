package demo;

import static java.lang.System.out;

import file.io.FileList;
import java.util.ArrayList;


public class FileListDemo {
	public static void main(String[] args){
		String path = "D:\\tmp";
		if(args.length > 0){
			path = args[0];
		}
		ArrayList<String> files = FileList.getFiles(path);
		for(String file: files){
			out.format("%s%n", file);
		}
	}
}
