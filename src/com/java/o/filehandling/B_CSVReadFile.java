package com.java.o.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import au.com.bytecode.opencsv.CSVReader;

public class B_CSVReadFile {

	public static void main(String[] args) throws IOException {
		CSVReader readCSV = new CSVReader(new FileReader("files/users.csv"));
	
		String[] nextLine;
		while((nextLine = readCSV.readNext())!=null)
		{
			System.out.println(nextLine[0]);
		}
		readCSV.close();
	}

}
