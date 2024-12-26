package com.custom.tibame201020.mxic;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Stream;

@Slf4j
public class Exams {

    /**
     * 寫一個方法來反轉給定的字符串。例如，輸入 "hello"，應返回 "olleh"。
     * @param str target string
     */
    public String reverseString(String str) {
        return Optional.ofNullable(str)
                .map(s -> new StringBuilder(s).reverse().toString())
                .orElse(null);
    }

    /**
     * 寫一個方法來計算第 n 個費氏數。例如，fibonacci(5) 應返回 5，因為費氏數列的前幾個數是 0, 1, 1, 2, 3, 5
     * @param n n
     */
    public int findFibonacci(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return findFibonacci(n - 1) + findFibonacci(n - 2);
    }

    /**
     * 寫一個方法來計算一個文本文件中某個單詞出現的數量，Input 為某個單詞， Output 為出現數量。
     * @param filePath file path
     * @param word target word
     */
    public int countWord(String filePath, String word) {
        Path path = Optional.ofNullable(filePath)
                .map(Path::of)
                .filter(p  -> p.toFile().exists())
                .orElseThrow(() -> new RuntimeException("file path is null or not exist"));

        Pattern pattern = Pattern.compile(word);

        try (Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8)) {
            return lines
                    .map(s -> pattern.matcher(s).results().count())
                    .mapToInt(Long::intValue)
                    .sum();
        } catch (IOException e) {
            log.error("read file error {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    /**
     * 請實現一個簡單的多線程程序，其中一個線程印出偶數，另一個線程印出奇數
     */
    public void threadControl(int begin, int end) {
        Thread oddThread = Thread.ofVirtual().unstarted(() -> {
            for (int i = begin; i <= end; i++) {
                printer(i, PrinterType.PRINT_ODD);
            }
        });
        oddThread.setName("[odd thread]");

        Thread evenThread = Thread.ofVirtual().unstarted(() -> {
            for (int i = begin; i <= end; i++) {
                printer(i, PrinterType.PRINT_EVEN);
            }
        });
        evenThread.setName("[even thread]");

        try {
            oddThread.start();
            evenThread.start();

            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            log.error("thread join error {}", e.getMessage());
            throw new RuntimeException(e);
        }

    }


    enum PrinterType {
        PRINT_ODD,
        PRINT_EVEN
    }
    private void printer(int i, PrinterType printerType) {
        switch (printerType) {
            case PRINT_ODD -> {
                if (i % 2 == 1) {
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                    System.err.println(Thread.currentThread().getName() + ": " + i);
                }
            }
            case PRINT_EVEN -> {
                if (i % 2 == 0) {
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                    System.err.println(Thread.currentThread().getName() + ": " + i);
                }
            }
        }
    }

}
