
public class NightState implements State {
    private static NightState instance = new NightState();
    private NightState() {}
    public static NightState getInstance() {
        return NightState.instance;
    }
    public void doClock(Context context, int hour) {
        if (9 <= hour && hour < 17) {
            context.changeState(DayState.getInstance());
        }
    }
    public void doUse(Context context) {
        context.callSecurityCenter("Use in night (emergency)");
    }
    public void doAlarm(Context context) {
        context.callSecurityCenter("Ringing alarm (nighttime)");
    }
    public void doPhone(Context context) {
        context.recordLog("Phone (nighttime)");
    }
    public String toString() {
        return "NIGHTTIME";
    }
}