package com.custom.tibame201020.mxic.refactor.useCase;

import org.junit.jupiter.api.BeforeEach;

import java.io.PrintStream;

public class OriginalTest extends _OrderProcessTest {

    @BeforeEach
    public void init() {
        processOrderUseCase = new ProcessOrderUseCaseImpl().original();
        System.setOut(new PrintStream(outputStreamCaptor));
    }
}
