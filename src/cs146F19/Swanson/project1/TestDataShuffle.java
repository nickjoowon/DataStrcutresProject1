package cs146F19.Swanson.project1;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class TestDataShuffle {

	String expectedLine;

//	public void test()  {
//		fail("Not yet implemented");
//	}
	
	
	@Test
	public void compareText() throws IOException {
		BufferedReader Out = new BufferedReader (new FileReader ("SwansonNicolasShuffled.txt"));
		
		BufferedReader In = new BufferedReader (new FileReader ("Target1.txt"));
		
		while ((expectedLine = In.readLine()) != null) {
			String actualLine = Out.readLine();
			assertEquals (expectedLine, actualLine);
		}
	}






}
