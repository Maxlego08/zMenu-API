package fr.maxlego08.menu.zcore.utils;

/**
 * Allows you to manage messages sent to players and the console
 *
 * @author Maxence
 */
public abstract class MessageUtils {

    protected String getMessage(String message, Object... args) {

        if (args.length % 2 != 0)
            throw new IllegalArgumentException("Number of invalid arguments. Arguments must be in pairs.");

        for (int i = 0; i < args.length; i += 2) {
            if (args[i] == null || args[i + 1] == null)
                throw new IllegalArgumentException("Keys and replacement values must not be null.");
            message = message.replace(args[i].toString(), args[i + 1].toString());
        }
        return message;
    }

}
