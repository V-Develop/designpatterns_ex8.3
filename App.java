public class App {
    public static void main(String[] args) {
        IOTInvoker iotInvoker = new IOTInvoker();
        LightController lightBedroom = new LightController("Bed Room");
        LightController lightKitchen = new LightController("Kitchen");
        AirConditionerController airBedroom = new AirConditionerController("Bedroom");

        LightController testOverOrder = new LightController("Study room");

        iotInvoker.takeOrder(lightBedroom);
        iotInvoker.takeOrder(lightKitchen);
        iotInvoker.takeOrder(airBedroom);

        // test over oder
        iotInvoker.takeOrder(testOverOrder);
        iotInvoker.execute();
    }
}
