package codecool;

import java.security.Timestamp;
import java.util.LinkedList;
import java.util.List;

public class Order {

    private List<OrderItem> singleOrder = new LinkedList<>();
    private String orderTimeStamp;
    private EmploymentType permissionLevel;
    private Timestamp orderTime;
    private Object customer;

    public void addItemToOrder(EmploymentType permissionLevel, Employee modifier)
    {

    }

}
