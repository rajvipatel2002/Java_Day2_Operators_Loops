package day2;

public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Numbers from 1 to 10 (skipping 5):");

	        for (int i = 1; i <= 10; i++) {
	            if (i == 5) {
	                continue; // skip this iteration when i = 5
	            }
	            System.out.println(i);
	        }
	}

}
