public class LightController implements DeviceAction {
    private Light light;
    private String roomName;
    private boolean lightStatus = false;
    private final String type = "light";

    public LightController(String roomName) {
        this.roomName = roomName;
        this.light = new Light(this.roomName);
    }

    @Override
    public void execute() {
        turnOn();
        turnOff();
    }

    @Override
    public void turnOn() {
        light.on();
        lightStatus = true;
    }

    @Override
    public void turnOff() {
        light.off();
        lightStatus = false;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String getPosition() {
        return this.roomName;
    }
}
