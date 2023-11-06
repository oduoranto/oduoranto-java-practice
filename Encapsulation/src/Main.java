import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your game name: ");
        String name = sc.nextLine();

        Player player = new Player(name);
        
        System.out.println(player.healthReamaining());
        player.restoreHealth(90);
        player.loseHealth(90);
    }
}