import java.util.*;
public class CONDITIONS{
    public static void main(String[] args){
        System.out.print("Enter age:");
        Scanner obj = new Scanner(System.in);
        int age = obj.nextInt();
        if(age<=18){
            System.out.println("Child");
        }
        else{
            System.out.println("Adult");
        }
    }
}
