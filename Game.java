@SuppressWarnings("CaughtExceptionImmediatelyRethrown")
public class Game {
    private final static String[] moves = {"Rock ✊","Paper ✋","Scissors ✌️"};
    private final static int Rock = 0;
    private final static int Paper = 1;
    private final static int Scissors = 2;

    public static void start(Difficulties level) {
        if (level == Difficulties.EASY){
            System.out.println("EASY GAME");
            startEasy();
        } else if (level == Difficulties.IMPOSSIBLE) {
            System.out.println("IMPOSSIBLE GAME STARTING...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("TRAINING AI OPPONENT...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("AI OPPONENT PRACTICING MOVES...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            startAI();
        }else{
            try{
                start(level);
            }catch (Exception e){
                throw e;
            }
        }
    }

    private static void startAI() {
        System.out.println("Please enter Rock, Paper, or Scissors");
        String pMove = Main.UserTerminalInput.nextLine();
        if (pMove.equalsIgnoreCase("Rock")) {
            System.out.println("AI Chose: "+ moves[Paper]);
            System.out.println("You Lose!");
            System.out.print("Would You Like To Play Again? (Y/n): ");
            String again = Main.UserTerminalInput.nextLine();
            if (again.equalsIgnoreCase("y") || again.equalsIgnoreCase("yes")) {
                startAI();
            }else{
                System.exit(0);
            }
        }else if (pMove.equalsIgnoreCase("Paper")){
            System.out.println("AI Chose: "+ moves[Scissors]);
            System.out.println("You Lose!");
            System.out.print("Would You Like To Play Again? (Y/n): ");
            String again = Main.UserTerminalInput.nextLine();
            if (again.equalsIgnoreCase("y") || again.equalsIgnoreCase("yes")) {
                startAI();
            }else{
                System.exit(0);
            }
        }else if (pMove.equalsIgnoreCase("Scissors")){
            System.out.println("AI Chose: "+ moves[Rock]);
            System.out.println("You Lose!");
            System.out.print("Would You Like To Play Again? (Y/n): ");
            String again = Main.UserTerminalInput.nextLine();
            if (again.equalsIgnoreCase("y") || again.equalsIgnoreCase("yes")) {
                startAI();
            }else{
                System.exit(0);
            }
        }else {
            startAI();
        }
    }

    private static void startEasy() {
        int rand = (int) (Math.random() * ((2) + 1));
        String CPChoice;
        switch (rand) {
            case 0 -> CPChoice = moves[Rock];
            case 1 -> CPChoice = moves[Paper];
            case 2 -> CPChoice = moves[Scissors];
            default -> CPChoice = null;
        }
        System.out.println("Please enter Rock, Paper, or Scissors");
        String pMove = Main.UserTerminalInput.nextLine();
        if (pMove.equalsIgnoreCase("Rock")) {
            if (CPChoice != null && CPChoice.equalsIgnoreCase(moves[Rock])) {
                System.out.println("You and CP are tied!\n It Chose: " + moves[Rock]);
            }
        } else if (pMove.equalsIgnoreCase("Paper")) {
            if (CPChoice != null && CPChoice.equalsIgnoreCase(moves[Paper])) {
                System.out.println("You and CP are tied!\n It Chose: " + moves[Rock]);
            }
        } else if (pMove.equalsIgnoreCase("Scissors")) {
            if (CPChoice != null && CPChoice.equalsIgnoreCase(moves[Scissors])) {
                System.out.println("You and CP are tied!\n It Chose: " + moves[Scissors]);
            }
        }
        System.out.print("Would You Like To Play Again? (Y/n): ");
        String again = Main.UserTerminalInput.nextLine();
        if (again.equalsIgnoreCase("y") || again.equalsIgnoreCase("yes")) {
            startEasy();
        }else{
            System.exit(0);
        }
    }
}