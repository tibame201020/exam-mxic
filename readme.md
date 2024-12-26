### 1、 寫一個方法來反轉給定的字符串。例如，輸入 "hello"，應返回 "olleh";。
- [code](https://github.com/tibame201020/exam-mxic/blob/main/src/main/java/com/custom/tibame201020/mxic/Exams.java#L20)
- [test](https://github.com/tibame201020/exam-mxic/blob/main/src/test/java/com/custom/tibame201020/mxic/ExamsTest.java#L25)

### 2、 寫一個方法來計算第 n 個費氏數。例如，fibonacci(5) 應返回 5，因為費氏數列的前幾個數是 0, 1, 1, 2, 3, 5。
- [code](https://github.com/tibame201020/exam-mxic/blob/main/src/main/java/com/custom/tibame201020/mxic/Exams.java#L30)
- [test](https://github.com/tibame201020/exam-mxic/blob/main/src/test/java/com/custom/tibame201020/mxic/ExamsTest.java#L37)

### 3、 寫一個方法來計算一個文本文件中某個單詞出現的數量，Input 為某個單詞， Output 為出現數量。
- [code](https://github.com/tibame201020/exam-mxic/blob/main/src/main/java/com/custom/tibame201020/mxic/Exams.java#L48)
- [test](https://github.com/tibame201020/exam-mxic/blob/main/src/test/java/com/custom/tibame201020/mxic/ExamsTest.java#L49)

### 4、 請實現一個簡單的多線程程序，其中一個線程印出偶數，另一個線程印出奇數。
- [code](https://github.com/tibame201020/exam-mxic/blob/main/src/main/java/com/custom/tibame201020/mxic/Exams.java#L70)
- [test](https://github.com/tibame201020/exam-mxic/blob/main/src/test/java/com/custom/tibame201020/mxic/ExamsTest.java#L62)

### 5、 請重構或優化以下程式
```
original code 包含refactor method,
為了方便測試, 實作使用function interface搭配 abstract test 抽換實作方式
```
- [original code](https://github.com/tibame201020/exam-mxic/blob/main/src/main/java/com/custom/tibame201020/mxic/refactor/OrderProcessor.java)
- [original test](https://github.com/tibame201020/exam-mxic/blob/main/src/test/java/com/custom/tibame201020/mxic/refactor/OrderProcessorTest.java)

- [early return code](https://github.com/tibame201020/exam-mxic/blob/main/src/main/java/com/custom/tibame201020/mxic/refactor/useCase/ProcessOrderUseCaseImpl.java#L32)
- [early return test](https://github.com/tibame201020/exam-mxic/blob/main/src/test/java/com/custom/tibame201020/mxic/refactor/useCase/EarlyReturnTest.java)

- [stream code](https://github.com/tibame201020/exam-mxic/blob/main/src/main/java/com/custom/tibame201020/mxic/refactor/useCase/ProcessOrderUseCaseImpl.java#L59)
- [stream test](https://github.com/tibame201020/exam-mxic/blob/main/src/test/java/com/custom/tibame201020/mxic/refactor/useCase/StreamTest.java)

- [function interface](https://github.com/tibame201020/exam-mxic/blob/main/src/main/java/com/custom/tibame201020/mxic/refactor/useCase/ProcessOrderUseCase.java)
- [abstract test](https://github.com/tibame201020/exam-mxic/blob/main/src/test/java/com/custom/tibame201020/mxic/refactor/useCase/_OrderProcessTest.java)