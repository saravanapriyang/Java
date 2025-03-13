package java_learnings;

import java.util.*;
public class LargestAmongThree {
public static void main( String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("enter num1");
	int a = sc.nextInt();
	System.out.print("enter num2");
	int b = sc.nextInt();
	System.out.print("enter num3");
	int c = sc.nextInt();
	int d = (a>b) ? ((a>c) ? a:c) : ((b>c)?b:c);
	System.out.println(d+"is largest");
}
}
