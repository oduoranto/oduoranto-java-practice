import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(in);

        while(true){
            System.out.print("Enter (A for Adventure, C for comedy, S for sciencefiction or Q to quite): ");
            String type = sc.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.print("Enter the movie name: ");
            String title = sc.nextLine();

            Movie movie = Movie.getMovie(type,title);
            movie.watchMovie();
        }
    }
}