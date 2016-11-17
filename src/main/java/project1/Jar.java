package project1;

import java.util.concurrent.ThreadLocalRandom;

class Jar {

    private static String mContents;
	private static int mMaxSize;

    	static void chooseContents() {
            mContents = Prompter.prompt("What items are in the jar?");
        }

		static void chooseMaxSize() {
            mMaxSize = Integer.parseInt(Prompter.prompt("How many can you cram in the jar?"));
        }


        void play(){
            int jar;
            jar = ThreadLocalRandom.current().nextInt(1, mMaxSize + 1);
            int guess = 0;
            int guessCount = 0;
            String ask = String.format("How many %s are in the jar? The range is 1 - %s \n", mContents, mMaxSize);
            while(guess != jar){
                guess = Integer.parseInt(Prompter.prompt(ask));
                guessCount ++;
                if (guess < jar){
                    System.out.println("That guess is too low");
                }
                if (guess > jar){
                    System.out.println("That guess is too high");
                }
                if (guess == jar){
                    System.out.printf("You Got it right in %s guesses!!\n", guessCount);
                }

            }

        }


}