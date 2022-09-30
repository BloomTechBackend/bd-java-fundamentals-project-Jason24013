package main.com.adventure;

import main.com.adventure.settings.Command;
import main.com.adventure.settings.CommandConstants;
import main.com.adventure.settings.CommandVerb;

import java.util.Locale;
import java.util.Scanner;

public class GameInputProcessor {

    /**
     * Asks the user for their next command.
     *
     * @return the response from the user.
     */
    public String prompt() {
        String prompt;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your next command:");
        prompt = scanner.nextLine();
        return prompt;
    }

    /**
     * Inputs that come into this method represent single action with no object. When building the command, you'll want
     * to supply the first word as the verb and leave the objectName blank.
     * Example input:
     * "help"
     * "look"
     * <p>
     * Note: this command must stay private when running the tests
     *
     * @param input - the input from the user
     * @return - the Command object with the proper verb and blank object
     */
    private Command buildSimpleCommand(String input) {
        String verb = input.split(" ")[0];
        verb = verb.toUpperCase();


        return new Command(CommandVerb.valueOf(verb));

    }

    /**
     * Inputs that come into this method will have an object or objects that the action is acting on. You'll need to
     * include the object parameter as part of the Command object.
     * Example input:
     * "use key"
     * "examine door"
     * "move west"
     * <p>
     * You should also account for incomplete actions (i.e. the object is missing). In that case, you should return an
     * empty string for the object parameter.
     * Example bad input:
     * "move"
     * " use "
     * <p>
     * Note: this command must stay private when running the tests
     *
     * @param input - the input from the user
     * @return - the Command object with the proper verb and object
     */
    private Command buildCommandWithObject(String input) {
        String[] words = input.split(" ");
        if (words.length == 1) {
            String verb = words[0];
            return new Command(CommandVerb.valueOf(verb.toUpperCase()));
        } else if (words.length == 2) {
            String verb = words[0];
            String object = words[1];
            return new Command(CommandVerb.valueOf(verb.toUpperCase()), object);
        } else {
            return new Command(CommandVerb.valueOf(""));
        }
    }


    /** DO NOT CHANGE ANYTHING BELOW THIS LINE. **/

    /**
     * Gets the next command from the user.
     *
     * @return a command object
     */
    public Command getNextCommand() {
        String input = prompt();
        return processCommand(input);
    }

    private Command processCommand(String input) {
        String normalizedInput = input.toLowerCase(Locale.ROOT);
        if (normalizedInput.contains(CommandConstants.MOVE) ||
                normalizedInput.contains(CommandConstants.USE) ||
                normalizedInput.contains(CommandConstants.TAKE) ||
                normalizedInput.contains(CommandConstants.EXAMINE)
        ) {
            return buildCommandWithObject(normalizedInput);
        } else {
            return buildSimpleCommand(normalizedInput);
        }
    }
}

