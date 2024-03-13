import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int last_digit,x;
        x=n;
        last_digit=n%10;
        if((last_digit==7)||(x%7==0))
        System.out.println("buzz no");
        else System.out.println("Not a buzz no");
    }
}
