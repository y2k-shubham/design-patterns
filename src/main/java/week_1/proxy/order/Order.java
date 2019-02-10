package week_1.proxy.order;

import java.util.Map;

public class Order {

    private Long id;
    private Map<Item, Integer> items;

    public Order(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Map<Item, Integer> getItems() {
        return items;
    }

    public void addItem(Item item, Integer quantity) {
        this.items.put(item, this.items.getOrDefault(item, 0) + quantity);
    }

    public Float getAmount() {
        Float amount = 0.0f;

        for (Map.Entry<Item, Integer> itemEntry : this.items.entrySet()) {
            amount += itemEntry.getKey().getPrice() * itemEntry.getValue();
        }

        return amount;
    }
}
