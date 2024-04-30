import java.util.*;
public class compare{
    public static void main(String[] args){
        System.out.println("Enter numbers:");
        Scanner obj = new Scanner(System.in);
        System.out.print("First:");
        int num1 = obj.nextInt();
        Scanner obj2 = new Scanner(System.in);
        System.out.print("Second:");
        int num2 = obj.nextInt();
        if(num1==num2){
            System.out.println("equal");
        }
        else{
            if(num1>num2){
            System.out.println("1 Greater than 2");
            }
            else{
                System.out.println("1 Lesser than 2");
            }
        }
    }
}
