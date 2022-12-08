import java.util.Scanner;

public class Main {
    public static Scanner UserTerminalInput = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
        Begin();
    }

    public static void Begin() {
        String choice = getGamemode();
        if (choice.equalsIgnoreCase("Easy")){
            Game.start(Difficulties.EASY);
        } else if (choice.equalsIgnoreCase("Impossible")) {
            Game.start(Difficulties.IMPOSSIBLE);
        }else{
            Begin();
        }
    }

    private static String getGamemode() {
        System.out.println("Please Chose One Of The Following Gamemodes:");
        System.out.println("- Easy");
        System.out.println("- IMPOSSIBLE");
        String choice = UserTerminalInput.nextLine();
        return choice;
    }
}
