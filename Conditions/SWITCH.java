import java.util.*;
public class SWITCH{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        switch (a) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Hola");
                break;
            default:
                System.out.println("Nothing");
                break;
        }
    }
    
}
