package ru.epam.java_collection;

import java.util.ArrayList;

public class IteratorMain {
    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<Order>() {
            {
                add(new Order(231, 12.));
                add(new Order(319, 2.9));
                add(new Order(831, 32.));
                add(new Order(531, 17.));
                add(new Order(431, 1.));
            }
        };
        System.out.println(orders);

        float bigAmount = 10;
        int percent = 5;

        OrderAction orderAction = new OrderAction();//1
        orderAction.discountAction(10, orders, percent);
        System.out.println(orders);

        orders.removeIf(o -> o.getAmount() <= bigAmount);//2
        orders.forEach(o -> o.setAmount(o.getAmount() * (100 - percent) / 100.0));
        System.out.println(orders);
    }
}
