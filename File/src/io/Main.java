package io;

import java.io.IOException;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		File f1 = new File();
		f1.writeFile();
		System.out.println("Enter file name");
		String name = input.next();
		System.out.println("Enter String to search");
		String s = input.next();
		try
		{
			int a = f1.searchFile(name, s);
			System.out.println("number of line is "+a);
		}catch (IOException ex)
		{
			System.out.println("Sorry we can not find the file");
		}
		

	}

}
