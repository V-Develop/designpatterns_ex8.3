public class AirConditionerController implements DeviceAction {
    private Airconditioner airconditioner;
    private String roomName;
    private boolean airconditionerStatus = false;
    private final String type = "AC";

    public AirConditionerController(String roomName) {
        this.roomName = roomName;
        this.airconditioner = new Airconditioner(this.roomName);
    }

    @Override
    public void execute() {
        turnOn();
        turnOff();
    }

    @Override
    public void turnOn() {
        this.airconditioner.on();
        this.airconditioner.setTemp(25);
        this.airconditionerStatus = true;
    }

    @Override
    public void turnOff() {
        this.airconditioner.off();
        this.airconditionerStatus = false;
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
