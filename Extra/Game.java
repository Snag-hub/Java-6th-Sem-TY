import java.util.*;

public class Game {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("\n ======= Let's play a Rock Paper Scissor =======\n");
    System.out.println(" ======= For Rock: 1 , Paper: 2 , Scissor: 3 =======\n");

    for (int i = 0; i >= 0; i++) {
      Random rand = new Random();
      int ComputerNumber = rand.nextInt(3);
      System.out.print("\nEnter Your guess: ");
      int userInput = sc.nextInt();

      if (userInput < 4 && userInput > 0) {
        if (userInput == ComputerNumber) {
          System.out.println("\n=============================");
          System.out.println("Draw");
          System.out.println("=============================\n");
        } else if (userInput == 0 && ComputerNumber == 2 ||
            userInput == 2 && ComputerNumber == 1 ||
            userInput == 1 && ComputerNumber == 0

        ) {

          System.out.println("\n=============================");
          System.out.println("Hurryyy You Win!");
          System.out.println("=============================\n");

        } else {
          System.out.println("\n=============================");
          System.out.println("Computer Win Don't upset just try again");
          System.out.println("=============================\n");
        }

        String game = "";

        switch (ComputerNumber) {
          case 0:
            game = "Rock";
            break;

          case 1:
            game = "Papper";
            break;

          case 2:
            game = "Scissor";
            break;
          default:
            break;
        }

        System.out.println("=============================");
        System.out.printf("Computer Choose: %d: %s ", ComputerNumber, game);
        System.out.println("\n=============================\n");

        System.out.print("Wanted To try again(y/n): ");
        char tryagain = sc.next().charAt(0);
        if (tryagain == 'n') {
          break;
        } else if (tryagain == 'N') {
          break;
        } else if (tryagain == 'y') {
        } else if (tryagain == 'Y') {
        } else {
          do {
            System.out.println(
                " \n *************** Please enter ***************\n *************** Y/y : ForYes *************** \n *************** N/n: For No *************** \n");

            System.out.print("Wanted To try again(y/n): ");
            tryagain = sc.next().charAt(0);

            if (tryagain == 'n') { // if(tryagain == 'N' || tryagain == 'n')
              break;
            } else if (tryagain == 'N') {
              break;
            } else if (tryagain == 'y') {
            } else if (tryagain == 'Y') {
            } else {
              System.out.println(
                  " \n *************** Please enter ***************\n *************** Y/y : For Yes *************** \n *************** N/n: For No *************** \n");
            }
          } while (true);
          break;

        }

      } else {
        System.out.println(" \n *************** Wrong Input You Have To Choose 1 / 2 3/ 3 *************** \n ");
      }

    }

  }
}
