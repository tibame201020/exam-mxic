package com.custom.tibame201020.mxic.refactor;

import com.custom.tibame201020.mxic.domain.Order;
import com.custom.tibame201020.mxic.domain.OrderItem;
import com.custom.tibame201020.mxic.refactor.useCase.ProcessOrderUseCase;
import com.custom.tibame201020.mxic.refactor.useCase.ProcessOrderUseCaseImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderProcessorTest {
    private ProcessOrderUseCase processOrderUseCase;
    private Order order;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void init() {
        processOrderUseCase = new ProcessOrderUseCaseImpl().original();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void when_order_is_null() {
        processOrderUseCase.processOrder(order);
        assertEquals("Order is null", outputStreamCaptor.toString().trim());
    }

    @Test
    void when_order_items_is_null() {
        order = new Order();
        processOrderUseCase.processOrder(order);
        assertEquals("Order has no items", outputStreamCaptor.toString().trim());
    }

    @Test
    void when_order_has_empty_items() {
        order = new Order();
        order.setItems(List.of());
        processOrderUseCase.processOrder(order);
        assertEquals("Order has no items", outputStreamCaptor.toString().trim());
    }

    @Test
    void when_order_has_items_and_item_price_is_zero() {
        order = new Order();

        OrderItem item = new OrderItem();
        item.setPrice(0.0);
        order.setItems(List.of(item));

        processOrderUseCase.processOrder(order);

        assertEquals("Order total is zero or negative", outputStreamCaptor.toString().trim());
    }

    @Test
    void when_order_has_items_and_item_price_is_not_zero() {
        order = new Order();

        OrderItem itemA = new OrderItem();
        itemA.setPrice(100.0);
        OrderItem itemB = new OrderItem();
        itemB.setPrice(70.0);

        order.setItems(List.of(itemA, itemB));

        processOrderUseCase.processOrder(order);

        assertEquals("Order processed with total: 170.0", outputStreamCaptor.toString().trim());
    }

}