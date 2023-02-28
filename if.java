import java.util.Scanner;
public class if {
    public static void main(string a[]){
       
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int a= sc.nextInt();

        if(a<0){
            System.out.println("The number is negative");
        }
        else{
            System.out.println("the number is positive");
        }
    }
    
}
