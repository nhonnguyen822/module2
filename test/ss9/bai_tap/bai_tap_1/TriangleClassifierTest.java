package ss9.bai_tap.bai_tap_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void testTriangleClassifier() {
        int number1 = 2;
        int number2 = 2;
        int number3 = 2;
        String expected = "Tam giác đều";
        String result = TriangleClassifier.triangleClassifier(number1, number2, number3);
        Assertions.assertEquals(expected,result);
    }
    @Test
    void testTriangleClassifier1() {
        int number1 = 2;
        int number2 = 2;
        int number3 = 2;
        String expected = "Tam giác đều";
        String result = TriangleClassifier.triangleClassifier(number1, number2, number3);
        Assertions.assertEquals(expected,result);
    }
    @Test
    void testTriangleClassifier2() {
        int number1 = 2;
        int number2 = 2;
        int number3 = 3;
        String expected = "Tam giác cân";
        String result = TriangleClassifier.triangleClassifier(number1, number2, number3);
        Assertions.assertEquals(expected,result);
    }
    @Test
    void testTriangleClassifier3() {
        int number1 = 3;
        int number2 = 4;
        int number3 = 5;
        String expected = "Tam giác thường";
        String result = TriangleClassifier.triangleClassifier(number1, number2, number3);
        Assertions.assertEquals(expected,result);
    }
    @Test
    void testTriangleClassifier6() {
        int number1 = 0;
        int number2 = 1;
        int number3 = 1;
        String expected = "không phải là tam giác";
        String result = TriangleClassifier.triangleClassifier(number1, number2, number3);
        Assertions.assertEquals(expected,result);
    }
    @Test
    void testTriangleClassifier4() {
        int number1 = 8;
        int number2 = 3;
        int number3 = 2;
        String expected = "không phải là tam giác";
        String result = TriangleClassifier.triangleClassifier(number1, number2, number3);
        Assertions.assertEquals(expected,result);
    }
    @Test
    void testTriangleClassifier5() {
        int number1 = -1;
        int number2 = 2;
        int number3 = 1;
        String expected = "không phải là tam giác";
        String result = TriangleClassifier.triangleClassifier(number1, number2, number3);
        Assertions.assertEquals(expected,result);
    }
}
