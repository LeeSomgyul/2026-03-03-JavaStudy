package com.sist.files;

import java.nio.file.*;

public class Files_1 {

	public static void main(String[] args) {
		try {
			Path file = Paths.get("Files_1.java");
			System.out.println(file.toAbsolutePath());
			System.out.println(file.getFileName());
			System.out.println(file.getParent());
			
			long size = Files.size(file);
			System.out.println(size);
			
			Path dir = Paths.get("c:\\javaDev");
			Files.list(dir)
				.forEach(p->System.out.println(p.getName(0)));
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
