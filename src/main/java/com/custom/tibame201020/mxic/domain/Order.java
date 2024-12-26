package com.custom.tibame201020.mxic.domain;


import lombok.Data;

import java.util.List;

@Data
public class Order {
    private List<OrderItem> items;
}
