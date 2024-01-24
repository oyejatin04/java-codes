import java.util.Scanner;
public class counting {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int num = 0;
     while(n > 0){
         n= n/10 ;
         num++;
     }
        System.out.println("Number of digits in" + n + " = " + num );
    }
}
