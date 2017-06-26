import java.io.Console;

public class DrinkingAge {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("What is your age? ");
    String stringAge = myConsole.readLine();
    Integer age = Integer.parseInt(stringAge);

    if (age >= 21) {
      System.out.println("You can legally drink alcohol.");
    } else {
      System.out.println("You are less that 21, so you cannot legally drink alcohol.");
    }
  }
}
