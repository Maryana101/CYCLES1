package ru.netology.sqr;

public class SQRService {
    boolean isSqr(long value) {
        long sqrt = (long) Math.sqrt(value);
        return sqrt * sqrt == value;
    }

    public int SqrCount(int startValue, int endValue) {
        if (startValue < 0) {
            startValue = 0;
            if (endValue < 0) {
                return 0;
            }
        }

        if (endValue < 0) {
            endValue = 0;
            if (startValue < 0) {
                return 0;
            }
        }

        int count = 0;
        if (startValue <= endValue) {
            for (int i = startValue; i <= endValue; i++)
                if (isSqr(i)) {
                    count++;
                }
        } else {
            for (int i = endValue; i <= startValue; i++)
                if (isSqr(i)) {
                    count++;
                }
        }
        return count;
    }
}
