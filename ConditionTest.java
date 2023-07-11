import java.util.Scanner;

public class ConditionTest {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the first number: ");
	int a = scan.nextInt();
	System.out.println("Enter the second number: ");
	int b = scan.nextInt();
	int res;
	scan.close();
	if(a>b) {
		res = b-a;
		System.out.println("The difference of "+b+" and "+a+" is "+res);
	}
	else {
		res = a-b;
		System.out.println("The difference of "+a+" and "+b+" is "+res);
	}
}
}
