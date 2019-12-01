package cs146F19.Swanson.project1;

public class CircularLinkedGame {

	//creating node class for linked list to store data
	static class Node{

		public int data;
		public Node next;
		public Node (int data){
			this.data = data;
		}
		
	}
	
	
	//method to find the one person surviving
	//n represents number of people, k represents steps
	static int findSurvivingPosition(int n, int k){

		//creating circular linked list of size n
		
		Node head = new Node(1);
		Node prev = head;
		for(int i = 2; i<=n; i++) {
			prev.next = new Node(i);
			prev = prev.next;
		}
		//updating the last node as head
		prev.next = head;
		

		//looping through the linked list until 1 prisoner is left
		Node prsnr = head;
		Node temp = head;
		
		//until there's only 1 node left
		while(prsnr.next != prsnr) {
			
			int count = 1;
			while(count <= k) {
				temp = prsnr;
				prsnr = prsnr.next;
				count++;
			}
			
			//remove the node after k steps
			temp.next = prsnr.next;
			prsnr = temp.next;
			
		}
		
		return prsnr.data;
	}	

}
