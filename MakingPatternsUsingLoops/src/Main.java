import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Hello! How many stars would you like: ");
        int stars = scan.nextInt();

        for (int i = 1; i < stars; i++){
            for (int j = 1; j < i; j++){
                System.out.print("*");
            }
           System.out.println("*");
        }

        for (int i = stars; i > 0; i-- ){
            for (int j = 1; j < i; j++){
                System.out.print("*");
            }
System.out.println("*");
        }



    }
}