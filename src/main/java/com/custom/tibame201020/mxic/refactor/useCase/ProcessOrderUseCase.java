package com.custom.tibame201020.mxic.refactor.useCase;

import com.custom.tibame201020.mxic.domain.Order;

@FunctionalInterface
public interface ProcessOrderUseCase {
    void processOrder(Order order);
}
