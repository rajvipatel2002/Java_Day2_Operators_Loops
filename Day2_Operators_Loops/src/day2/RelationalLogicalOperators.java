package day2;

public class RelationalLogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10,y=20;
		
		//Relational Operators(compare values)
		System.out.println("x > y:"+ (x > y));
		System.out.println("x < y:"+ (x < y));
		System.out.println("x == y:"+ (x == y));
		System.out.println("x != Y"+ (x != y));
		
		//Logical Operators(combine boolean expressions(true or false))
		
		//&& (Logical AND)
		//Returns true only if both expressions are true.Otherwise, it returns false.
		boolean result1 = (x < y) && (x != 0);
		System.out.println("Logical AND (x<y && x!=0):" + result1);
		
		//|| (Logical OR)
		//Returns true if at least one expression is true.turns false only if both expressions are false.
		boolean result2 = (x > y) || (y != 0);
		System.out.println("Logiacal OR (x>y || (y!=0)):" + result2);
		
		//! (Logical NOT)
		//Reverses the value of a boolean expression.True becomes false, false becomes true.
		System.out.println("Logical NOT !(x==y):" + !(x == y));
	}

}
