
public class DayState implements State {
    private static DayState instance = new DayState();
    private DayState() {}
    public static DayState getInstance() {
        return DayState.instance;
    }
    public void doClock(Context context, int hour) {
        if (hour < 9 || 17 <= hour) {
            context.changeState(NightState.getInstance());
        }
    }
    public void doUse(Context context) {
        context.recordLog("Use (daytime)");
    }
    public void doAlarm(Context context) {
        context.callSecurityCenter("Alerm (daytime)");
    }
    public void doPhone(Context context) {
        context.callSecurityCenter("Phone (daytime)");
    }
    public String toString() {
        return "DAYTIME";
    }
}