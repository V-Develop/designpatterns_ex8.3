import java.util.ArrayList;
import java.util.List;

public class IOTInvoker {
    private List<DeviceAction> orderList = new ArrayList<>();

    public void takeOrder(DeviceAction order) {
        orderList.add(order);
    }

    public void removeOrder(DeviceAction order) {
        if (orderList.size() != 0) {
            orderList.remove(orderList.indexOf(order));
        }
    }

    public void execute() {
        int index = 0;
        for (DeviceAction order : orderList) {
            if (index <= 2) {
                System.out.println("slot " + index + ", " + order.getType() + " " + order.getPosition());
                order.execute();
                index += 1;
                System.out.println("--------------------------");
            } else {
                System.out.println("test one unavailable slot, slot 3");
                System.out.println("On button No command is assigned to this slot");
                System.out.println("Off button No command is assigned to this slot");
                break;
            }
        }
    }
}
