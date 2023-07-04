import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Hello! How many rows would you like: ");
        int rows = scan.nextInt();

        upperPyramid(rows);
        lowerPyramid(rows);

    }
    public  static  void upperPyramid(int rows){

        int i, j;

        for(i = 0; i <= rows; i++){

            for(j = 1; j <= rows -i; j++){

                System.out.print(" ");

            }
            for (j  =1; j <= 2 * i - 1; j++){

                System.out.print("*");

            }

            System.out.print("\n");
        }
    }
    public static void lowerPyramid(int rows){

        int i, j;

        for (i = rows -1; i >= 1; i--){

            for (j = 1; j <= rows - i; j++){

                System.out.print(" ");
            }
            for (j = 1; j <= 2 *i -1; j++){

                System.out.print("*");
            }

            System.out.print("\n");
        }
    }
}