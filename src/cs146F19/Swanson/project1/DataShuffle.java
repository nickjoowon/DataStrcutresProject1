package cs146F19.Swanson.project1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class DataShuffle {


	public static void main(String[] args) throws IOException{
		
		
		//using bufferedreader to read lines of the text file
		BufferedReader inputFile = new BufferedReader(new FileReader("C:\\Users\\nickj\\CS146Project1\\ErdosCA.txt"));

		//reading each line and putting them in the arraylist
		String line;
		List<String> dataList = new ArrayList<String>();
		
		//Disregarding the first line of ErdosCa.txt
		inputFile.readLine();
		
		while((line = inputFile.readLine()) != null){
			dataList.add(line);
		}
		inputFile.close();
		

		
		Random r = new Random();
		r.setSeed(20);
		
		//shuffling data starting from last element
		for(int i = dataList.size()-1; i>=0; i--) {
			
			//generates a random number for the array to be swapped with
			double d =  r.nextDouble();
			int j = (int)(d*i);
			
			//swapping the places of the lines
			Collections.swap(dataList, i, j);
		}
		
		
		//creating output file
		FileWriter writer = new FileWriter("SwansonNicolasShuffled.txt");
		for(String s: dataList) {
			writer.write(s + System.lineSeparator());
		}
		writer.close();
		
	}


}
