package java_learnings;
import java.util.*;
public class Swap {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("a:");
	int a = sc.nextInt();
	System.out.println("b:");
	int b = sc.nextInt();
	
	a= a+b;
	b=a-b;
	a=a-b;
	System.out.println(a);
	System.out.println(b);
}
}
