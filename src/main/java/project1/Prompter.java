package project1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Objects;

class Prompter {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static String prompt(String arg) {
		System.out.println(arg);
        String input;
        try {
            input = br.readLine();
        }catch (IOException ioe) {
            throw new IllegalArgumentException("Hmm, That doesn't seem to fit", ioe);
        }
            return input;
	}

	static boolean promptForBoolean(String arg){
        boolean bool;
        String input;
        System.out.println(arg);
        try {
            input = br.readLine();
        }catch (IOException ioe) {
            throw new IllegalArgumentException("Hmm, That doesn't seem to fit", ioe);
        }
        bool = Objects.equals(input.toLowerCase(), "y");
        return bool;
	}
/*
	static int promptForInteger(String arg){
        System.out.println(arg);
        int input = 0;

        while(input <= 0) {
            try {
                input = Integer.parseInt(br.readLine());
            } catch (IOException ioe) {
                throw new IllegalArgumentException("Hmm, That doesn't seem to fit");
            } catch (NumberFormatException nfe) {
                throw new NumberFormatException("Hmm, That's not a valid input");
            }
        }
        return input;
    }
    */


}