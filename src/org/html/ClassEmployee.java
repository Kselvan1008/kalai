package org.html;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class ClassEmployee {
	public static void main(String[] args) throws IOException {
		File f = new File ("G:\\SELVA\\Java\\Selenium\\single.txt");
		FileUtils.write(f, "Welcome Java Class");
		System.out.println("Complie");
		List<String> readLines = FileUtils.readLines(f);
		System.out.println(readLines);
		for (String String:readLines)
		{
			System.out.println(String);
		}
	}
	
}
