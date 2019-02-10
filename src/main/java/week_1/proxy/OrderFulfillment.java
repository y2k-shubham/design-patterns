package week_1.proxy;

import week_1.proxy.order.Item;
import week_1.proxy.order.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OrderFulfillment implements IOrder {

    private List<Warehouse> warehouses;

    public OrderFulfillment() {
        this.warehouses = new ArrayList<>();
    }

    public void addWarehouse(Warehouse warehouse) {
        this.warehouses.add(warehouse);
    }

    @Override
    public void fullfillOrder(Order order) {
        Long subOrderNo = 1L;
        while (!order.getItems().isEmpty()) {
            Order subOrder = new Order(order.getId() + subOrderNo);
            subOrderNo++;

            for (Warehouse warehouse : this.warehouses) {
                for (Map.Entry<Item, Integer> itemEntry : order.getItems().entrySet()) {
                    if (warehouse.currentInventory(itemEntry.getKey()) >= itemEntry.getValue()) {
                        subOrder.addItem(itemEntry.getKey(), itemEntry.getValue());
                    }
                }

                if (!subOrder.getItems().isEmpty()) {
                    warehouse.fullfillOrder(subOrder);
                }
            }
        }
    }
}
