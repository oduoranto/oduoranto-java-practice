import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your gander Male or Female or None: ");
        String gander = sc.next();

        ganderCategory(gander);

        System.out.print("select the number of choice\n 1. yes\n 2. No\n");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("How many stars would you like: ");
            int number = sc.nextInt();

            for (int i = 0; i <= number; i++) {
                for (int j = 0; j < i; j++) {

                    System.out.print("*");
                }
                System.out.println();
            }

            for (int i = number - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {

                    System.out.print("*");
                }
                System.out.println();
            }


        } else {
            System.out.println("Opps! Sorry!");

        }
    }
        public static void ganderCategory(String gander){

            if (gander.equals("male") || gander.equals("m")) {
                System.out.println("Hello Sir! Wanna play?");
            }
            else if (gander.equals("female") || gander.equals("f")){
                System.out.println(("Hello Madam! Wanna play?"));

            }else {
                System.out.println("Hello You! Wanna play?");

        }

    }


}