package day2;

public class UnaryTernaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		
		//UnaryOperator
		System.out.println("Original num:" + (num));
		System.out.println("num++:" + (num++));//post- increment
		System.out.println("++num:" + (++num));//pre- inrement
		
		
		
		//TernaryOperator
		int a=10,b=20;
		int max = (a>b) ? a : b;//
		
		System.out.println("maximum num is:" +max);

	}

}
