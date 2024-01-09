package com.company;

public class BmiService {
    static int index;

    public static Object calculate() {
        int weight = 98;
        int height = (int) 1.87;
        index = weight / (height * height);
        return index;
    }
}
