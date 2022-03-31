import java.util.Scanner;

class ConditionalLoops {
  public static void main(String[] args) {
    for (int i = 0; true; i++) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Your Name: ");
      String name = sc.nextLine();
      System.out.println("Hi " + name + "!");
      System.out.println("Would you Like to try again? [Y/N]");
      String answer = sc.nextLine();
      if (answer.equals("y")) {
        continue;
      } else if (answer.equals("n")) {
        System.out.println("Goodbye!");
        break;
      } else {
        do {
          System.out.println("Invalid Input" + "\n" + "Would you Like to try again? [Y/N]");
          answer = sc.nextLine();
          continue;
        } while (true);
      }
    }
  }
}