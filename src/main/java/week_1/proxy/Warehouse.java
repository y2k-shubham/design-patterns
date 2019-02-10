package week_1.proxy;

import week_1.proxy.order.Item;
import week_1.proxy.order.Order;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Warehouse implements IOrder {

    private Long id;
    private String address;
    private Hashtable<Item, Integer> stock;

    public Warehouse(Long id, String address) {
        this.id = id;
        this.address = address;
        this.stock = new Hashtable<>();
    }

    public Long getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public void addItems(Map<Item, Integer> items) {
        // adds items to inventory
        for (Map.Entry<Item, Integer> itemEntry : items.entrySet()) {
            this.stock.put(itemEntry.getKey(), this.stock.getOrDefault(itemEntry.getKey(), 0) + itemEntry.getValue());
        }
    }

    public Integer currentInventory(Item item) {
        return this.stock.getOrDefault(item, 0);
    }

    @Override
    public void fullfillOrder(Order order) {
        Map<Item, Integer> items = order.getItems();
        Map<Item, Integer> itemsToSubtract = new HashMap<>();
        for (Map.Entry<Item, Integer> itemEntry : items.entrySet()) {
            itemsToSubtract.put(itemEntry.getKey(), (-1) * itemEntry.getValue());
        }

        // subtract items being sent from inventory
        this.addItems(itemsToSubtract);
        // send items via courier
        System.out.println("Sending items of order id " + order.getId());
    }
}
