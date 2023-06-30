import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int key = 3;

        Scanner scan = new Scanner(System.in);
        System.out.println("Hello! What message do you wanna encrpypt:");
        String message = scan.nextLine();

        char [] chars = message.toCharArray();

        for (char c : chars){

            c += key;
            System.out.print(c );

        }
        decrypt();

    }
    public static void decrypt(){
        int key = 3;

        Scanner scan = new Scanner(System.in);
        System.out.println("\nHello! What message do you wanna decrpypt:");
        String message = scan.nextLine();

        char [] chars = message.toCharArray();

        for (char c : chars){

            c -= key;
            System.out.print(c);

        }

    }


}