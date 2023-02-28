import java.util.Scanner;
public class iff {
    public static void main(String a[]){
       
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int c=sc.nextInt();

        int sum=0;
        for(int i=0;i<c;i++){
            sum=sum+i;
        }
        System.out.println("the numbers are "+sum);
        
    }
    
}
