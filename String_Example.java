import java.sql.SQLOutput;
import java.util.Scanner;
public class String_Example {
    public static void main(String[] args) {
        char operator;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Paragraph");
        String words = sc.nextLine();
        System.out.println("Choose an operation:");
        System.out.println("1: Character Count");
        System.out.println("2: Vowel and Consonent Count");
        System.out.println("3: Count the No. of words");
        operator = sc.next().charAt(0);
        switch (operator) {
            case '1':
                int []arr =new int[256];
                for (int i=0;i<words.length();i++)
                {
                    /*important line*/    arr[(int)words.charAt(i)]++;
                }
                for (int i=0;i<256;i++) {
                    if (arr[i] > 0) {
                        System.out.println("The character " + (char) i + " is occured " + arr[i] + " times");
                    }
                }
                break;
            case '2':
                int len = words.length();
                int vowel =0;
                int cons=0;
                for (int i=0;i<len;i++)
                {
                    if (words.charAt(i)=='a' || words.charAt(i)=='e' || words.charAt(i)=='i' || words.charAt(i)=='o' || words.charAt(i)=='u' ||words.charAt(i)=='A' || words.charAt(i)=='E' || words.charAt(i)=='I' || words.charAt(i)=='O' || words.charAt(i)=='U')
                    {
                        vowel++;
                    }
                    else
                    {
                        cons++;
                    }
                }
                System.out.println("number of vowel is "+vowel);
                System.out.println("number of consonent is "+cons);
                break;
            case '3':
                int countWords = words.split("\\s").length;
                System.out.println(countWords);
                break;
            default:
                System.out.println("Invalid operation!");
                break;
        }
        sc.close();
    }
}
