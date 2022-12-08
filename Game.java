public class Game {
    final static String[] moves = {"Rock ✊","Paper ✋","Scissors ✌️"};
    final static int Rock = 0;
    final static int Paper = 1;
    final static int Scissors = 2;

    public static void startPVP() {
        System.out.println("PVP GAME");
    }

    public static void start(Difficulties level) {
        if (level == Difficulties.EASY){
            System.out.println("EASY GAME");
            startEasy();
        } else if (level == Difficulties.IMPOSSIBLE) {
            System.out.println("IMPOSSIBLE GAME STARTING...");
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
                Main.Begin();
            }else{
                System.exit(0);
            }
        }else if (pMove.equalsIgnoreCase("Scissors")){
            System.out.println("AI Chose: "+ moves[Rock]);
            System.out.println("You Lose!");
            System.out.print("Would You Like To Play Again? (Y/n): ");
            String again = Main.UserTerminalInput.nextLine();
            if (again.equalsIgnoreCase("y") || again.equalsIgnoreCase("yes")) {
                Main.Begin();
            }else{
                System.exit(0);
            }
        }else {
            startAI();
        }
    }

    private static void startEasy() {

    }
}