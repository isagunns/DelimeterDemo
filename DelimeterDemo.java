import java.util.Scanner;

public class DelimeterDemo {

    public static void main(String[] args) {
        Scanner keyboard1 = new Scanner(System.in);
        Scanner keyboard2 = new Scanner(System.in);
        keyboard2.useDelimiter("##");
        String word1, word2;
        System.out.println("Enter a text line:");
        word1 = keyboard1.next();
        word2 = keyboard1.next();
        System.out.println("For keyboard1 the words read are:");
        System.out.println(word1);
        System.out.println(word2);

        String junk = keyboard1.nextLine();
        System.out.println("Reenter the same text line:");
        word1 = keyboard2.next();
        word2 = keyboard2.next();
        System.out.println("For keyboard2 the words read are:");
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(junk);
        keyboard1.close();
        keyboard2.close();

    }
}