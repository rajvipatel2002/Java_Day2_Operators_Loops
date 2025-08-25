package day2;

import java.util.Scanner;

public class EvenOddCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Input from user
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		//if-else condition
		if (num % 2 == 0) {
			System.out.println(num + "is EVEN");
		}else {
			System.out.println(num + "is ODD");
		}
		sc.close();
	}

}
