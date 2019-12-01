package cs146F19.Swanson.project1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCircleGame {


	//	public void test() {
	//		fail("Not yet implemented");
	//	}

	@Test
	public void test() {
		
		CircularLinkedGame prisoners =  new CircularLinkedGame();
		int output1 = prisoners.findSurvivingPosition(6, 2);
		int output2 = prisoners.findSurvivingPosition(1, 9);
		int output3 = prisoners.findSurvivingPosition(7, 7);
		int output4 = prisoners.findSurvivingPosition(12, 8);
		int output5 = prisoners.findSurvivingPosition(5, 1);
		
		assertEquals(output1, 1);
		assertEquals(output2, 1);
		assertEquals(output3, 4);
		assertEquals(output4, 2);
		assertEquals(output5, 3);
		

	}


}
