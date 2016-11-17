package project1;

public class Game {


    public static void main(String[] args) {
        boolean play = true;
        while (play) {
            /* ADMIN Menu */
            Jar.chooseContents();
            Jar.chooseMaxSize();

            /* GAME Menu */
            Jar jar = new Jar();
            jar.play();

            play = Prompter.promptForBoolean("Would you like to play again? Y/N ");

        }

    }
}