package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"/testdata.csv"})

    public void Test(String test, int startValue, int endValue, int expected) {
        SQRService sqrService = new SQRService();
        int actual = sqrService.sqrCount(startValue, endValue);

        Assertions.assertEquals(expected, actual);

    }

}
