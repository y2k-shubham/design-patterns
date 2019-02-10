package week_1.proxy;

import week_1.proxy.order.Order;

public interface IOrder {

    public abstract void fullfillOrder(Order order);
}
