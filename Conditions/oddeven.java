import java.util.*;
public class oddeven{
    public static void main(String[] args){
        System.out.print("Enter num:");
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        if(num%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
