package com.custom.tibame201020.mxic.refactor.useCase;

import org.junit.jupiter.api.BeforeEach;

import java.io.PrintStream;

public class EarlyReturnTest extends _OrderProcessTest {

    @BeforeEach
    public void init() {
        processOrderUseCase = new ProcessOrderUseCaseImpl().earlyReturn();
        System.setOut(new PrintStream(outputStreamCaptor));
    }
}
