package dev.truaro.blog.springcore.datamanagement.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String id;
    private List<Item> items;

    public Order(String id) {
        this.id = id;
        items = new ArrayList<>();
    }

    public void add(Item item) {
        items.add(item);
    }
}
