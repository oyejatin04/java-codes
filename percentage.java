import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Percentage of 5 marks ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your TOtal marks  ");
	    int t = sc.nextInt();
	    System.out.println("Enter your marks in english ");
	    int a = sc.nextInt();
	    System.out.println("enter your marls in hindi ");
	    int b = sc.nextInt();
	    System.out.println("Enter your marks in maths  ");
	    int c = sc.nextInt();
	    System.out.println("Enter your marks in science  ");
	    int d = sc.nextInt();
	    System.out.println("Enter your marks in sst  ");
	    int e = sc.nextInt();
	    
	    int sum = a+b+c+d+e;
	    float per = (sum*100)/t;
	    System.out.println( " The Percentage is  ");
	    System.out.println(per);
	}
}
