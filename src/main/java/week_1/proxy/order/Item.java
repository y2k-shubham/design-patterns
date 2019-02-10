package week_1.proxy.order;

public class Item {

    private Long id;
    private String name;
    private Float price;

    public Item(Long id, String name, Float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Float getPrice() {
        return price;
    }
}
