package homeautomation;
import java.time.Duration;
import java.time.Instant;

public abstract class Device {
    private String name;
    private DeviceState state;
    private Instant lastToggleTime;
    private Duration onDuration;

    public Device(String name) {
        this.name = name;
        this.state = DeviceState.OFF;
        this.lastToggleTime = Instant.now();
        this.onDuration = Duration.ZERO;
    }

    public String getName() { return name; }
    public DeviceState getState() { return state; }

    public void toggle() {
        Instant now = Instant.now();
        if (state == DeviceState.ON) {
            onDuration = onDuration.plus(Duration.between(lastToggleTime, now));
            state = DeviceState.OFF;
        } else {
            lastToggleTime = now;
            state = DeviceState.ON;
        }
    }

    public Duration getOnDuration() {
        if (state == DeviceState.ON) {
            return onDuration.plus(Duration.between(lastToggleTime, Instant.now()));
        }
        return onDuration;
    }

    @Override
    public String toString() {
        long seconds = getOnDuration().getSeconds();
        return name + " [" + state + "] ON for " + seconds + "s";
    }
}