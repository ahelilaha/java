public class Main {
    public static void main(String[] args) {
        Main.displayHighScorePosition("Tim",2);
        int val = Main.calculateHighScorePosition(-1);
        System.out.println("You're score is "+ val);
    }

    public static void displayHighScorePosition(String name, int playerPosition) {
        System.out.println(name +" managed to get into position "+ playerPosition +" on the high score list");
    }

    public static int calculateHighScorePosition(int score) {
        if(score < 0){
            System.out.println("Invalid Input");
            return -1;
        }

        if(score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if(score >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
