package turnstile;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by tecram9 on 12.02.2017.
 */
public class MyTurnstile implements TurnstileActions {    private final static Logger LOGGER = Logger.getLogger(Turnstile.class.getName());

    public void alarm() {
        LOGGER.log(Level.INFO, "alarm");

    }

    public void lock() {
        LOGGER.log(Level.INFO, "lock");

    }

    public void thankyou() {
        LOGGER.log(Level.INFO, "thankyou");

    }

    public void unlock() {
        LOGGER.log(Level.INFO, "unlock");

    }
}
