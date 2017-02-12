package turnstile;

/**
 * Created by tecram9 on 12.02.2017.
 */
public class TurnstileTest {
    @org.junit.Test
    public void coin() throws Exception {
        Turnstile turnstile=new Turnstile(new MyTurnstile());
        turnstile._fsm.enterStartState();
        turnstile.pass();
        turnstile.coin();
        turnstile.coin();
        turnstile.pass();
    }

}