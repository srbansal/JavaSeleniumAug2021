package com.java.o.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {

	static void writeToFile()
	{
		FileWriter fw = null;
		try
		{
//			fw = new FileWriter("./files/xyz.txt"); // overwrite the file contents
			fw = new FileWriter("./files/xyz.txt", true);  // for appending 
			fw.write("\nHi Everyone, How are you?");
			System.out.println("file writing is done");
			fw.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally 
		{
			try {
				fw.close();
			}catch (IOException e)
			{
				e.printStackTrace();
			}
		}	
	}
	
	static void readFromFile() throws IOException
	{
		FileReader fr = null;
		fr = new FileReader("./files/xyz.txt");
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		fr.close();
	}
	
	
	public static void main(String[] args) {
		writeToFile();
	
		try {
			readFromFile();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Catch from main");
		}
		
		System.out.println("\nRest of the code...");
		
	}

}
