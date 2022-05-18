package ru.netology.sqr;

public class SQRService {

    public int sqrCount(int startValue, int endValue) {

        int count = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i > endValue) {
                return count;
            } else if (i * i >= startValue) {
                count++;
            }
        }
        return count;
    }
}
