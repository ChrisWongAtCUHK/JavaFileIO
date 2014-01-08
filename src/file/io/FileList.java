package file.io;

import java.io.File;
import java.util.ArrayList;

public class FileList {

	// list all files recursively
	public static ArrayList<String> getFiles(String path) {
		ArrayList<String> files = new ArrayList<String>();
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {

			if (listOfFiles[i].isFile()) {
				// list the files
				files.add(listOfFiles[i].getName());
			} else if(listOfFiles[i].isDirectory()){
				
				// recursive search
				files.addAll(getFiles(listOfFiles[i].getName()));
			}
		}
		
		return files;
	}
}
