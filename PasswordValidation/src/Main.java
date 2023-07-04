import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     

        Scanner scan = new Scanner(System.in);
        System.out.print("Hello! Enter your username: ");
        String userName = scan.nextLine();

        if (userName.equals("@johnny.com")){

            System.out.println("Enter your password: ");
            String password = scan.next();
            password(password);

            System.out.println("What message would you like to encrypt: ");
            String message = scan.nextLine();
            encrypt(message, 3);


        }else {
            System.out.println("Invalid username!");

        }

    }

    public static void password(String password){

    if (password.equals("1451")){

        System.out.println("Welcome! ");
    }else {
        System.out.println("Invalid password!");
    }
}
    public static void encrypt (String message, int keys){



        char[] chars = message.toCharArray();

        for (char c : chars){


            c += keys;

            System.out.print(c);
        }
    }
}