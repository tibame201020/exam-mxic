package com.custom.tibame201020.mxic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExamsTest {
    private Exams exams;

    @BeforeEach
    public void init() {
        exams = new Exams();
    }

    /**
     * 寫一個方法來反轉給定的字符串。例如，輸入 "hello"，應返回 "olleh"。
     */
    @Test
    void reverseString() {
        String str = "hello";

        String result = exams.reverseString(str);

        assertEquals("olleh", result);
    }

    /**
     * 寫一個方法來計算第 n 個費氏數。例如，fibonacci(5) 應返回 5，因為費氏數列的前幾個數是 0, 1, 1, 2, 3, 5
     */
    @Test
    void findFibonacci() {
        int n = 5;

        int result = exams.findFibonacci(n);

        assertEquals(5, result);
    }

    /**
     * 寫一個方法來計算一個文本文件中某個單詞出現的數量，Input 為某個單詞， Output 為出現數量。
     */
    @Test
    void countWord() {
        String filePath = "hello.txt";

        String word = "hello";
        int result = exams.countWord(filePath, word);

        assertEquals(8, result);
    }

    /**
     * 請實現一個簡單的多線程程序，其中一個線程印出偶數，另一個線程印出奇數
     */
    @Test
    void threadControl() {
    }
}