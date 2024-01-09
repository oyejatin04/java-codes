import java.util.Scanner;

public class simple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principle amount");
        float p = sc.nextFloat();
        System.out.println("Enter the Rate of intrest ");
        float r = sc.nextFloat();
        System.out.println("Enter the Time Period ");
        float t = sc.nextFloat();
        float si = (p * r * t)/100;
        System.out.println("the simple intrest is :"+ si);


    }
}
