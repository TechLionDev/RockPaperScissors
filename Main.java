import java.util.Scanner;

public class Main {
    public static Scanner UserTerminalInput = new Scanner(System.in);
    public static void main(String[] args) {
        Begin();
    }

    public static void Begin() {
        String choice = getGamemode();
        if (choice.equalsIgnoreCase("PVP")){
            Game.startPVP();
        }else if (choice.equalsIgnoreCase("Easy")){
            Game.start(Difficulties.EASY);
        } else if (choice.equalsIgnoreCase("Impossible")) {
            Game.start(Difficulties.IMPOSSIBLE);
        }
    }

    private static String getGamemode() {
        System.out.println("Please Chose One Of The Following Gamemodes:");
        System.out.println("- PVP");
        System.out.println("- Easy");
        System.out.println("- IMPOSSIBLE");
        String choice = UserTerminalInput.nextLine();
        return choice;
    }
}
