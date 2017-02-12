package turnstile;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Turnstile implements TurnstileActions {

    TurnstileFSM _fsm;
    TurnstileActions _actions;

    public Turnstile(TurnstileActions actions) {
        _fsm = new TurnstileFSM(this);
        _actions = actions;
    }

    public void coin() {
        _fsm.coin();
    }

    public void pass() {
        _fsm.pass();
    }

    public void alarm() {
        _actions.alarm();
    }

    public void lock() {
        _actions.lock();
    }

    public void thankyou() {
        _actions.thankyou();
    }

    public void unlock() {
        _actions.unlock();
    }
}

