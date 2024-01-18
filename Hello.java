import java.util.Scanner;
public class Hello {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the name");
        String sc;
        sc=s.nextLine();
        System.out.print("Hello " +sc);
    }
}
