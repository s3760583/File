package io;
import java.io.*;

public class File {
	
	public void writeFile()
	{
		try
		(PrintWriter write = new PrintWriter(new BufferedWriter(new FileWriter("poem.txt"))))
		{
			write.println("Courage is doing what is right");
			write.println("without having to be told");
			write.println("Courage is owning up");
			write.println("When you know you've done something wrong");
			write.println("Courage is having fear");
			write.println("But still staying strong");
			
		}catch (IOException ex)
		{
			System.out.println("sorry cant creat file");
		}
	}
	
	
	
	public int searchFile(String filename, String search) throws IOException
	{
		int count = 0;
		String line = null;
		try(BufferedReader read= new BufferedReader(new FileReader(filename)))
		{
			while(read.ready())
			{
				line = read.readLine();
				String[]tokens =line.split(" ");
				if(contain(tokens,search))
				{
					count++;
				}
			}
			return count;
		}
	}
	
	private boolean contain(String[]tokens,String str)
	{
		for(int i=0; i<tokens.length;i++)
		{
			if(tokens[i].equalsIgnoreCase(str))
			{
				return true;
			}
		}
		
		return false;
	}
	
	
	
	

}
