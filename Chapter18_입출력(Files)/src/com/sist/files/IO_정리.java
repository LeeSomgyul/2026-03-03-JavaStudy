package com.sist.files;

import java.io.*;
import java.util.*;
import java.nio.file.*;

public class IO_정리 {

	public static void main(String[] args) {
		
		Path filePath = Paths.get("c:\\javaDev\\고객.txt");
		Path dirPath = Paths.get("c:\\javaDev2");
		
		try {
			File custFile = Paths.get("c:\\javaDev\\고객.txt");
			List<String> data = Files.readAllLines(dirPath);
			data.stream().forEach(s->System.out.println(s));
			
			Path copyPath = Paths.get("c:\\javaDev\\고객2.txt");
			Files.copy(custFile, copyPath, StandardCopyOption.REPLACE_EXISTING);
			
			
				
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
