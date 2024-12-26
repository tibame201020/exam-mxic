package com.custom.tibame201020.mxic.refactor;

import com.custom.tibame201020.mxic.domain.Order;
import com.custom.tibame201020.mxic.domain.OrderItem;

public class OrderProcessor {

    // original
    public void processOrder(Order order) {
        if (order != null) {
            if (order.getItems() != null && !order.getItems().isEmpty()) {
                double total = 0;
                for (OrderItem item : order.getItems()) {
                    if (item != null && item.getPrice() > 0) {
                        total += item.getPrice();
                    }
                }
                if (total > 0) {
                    // some processing
                    System.out.println("Order processed with total: " + total);
                } else {
                    System.out.println("Order total is zero or negative");
                }
            } else {
                System.out.println("Order has no items");
            }
        } else {
            System.out.println("Order is null");
        }
    }

    // early return

    // stream with optional?

}
