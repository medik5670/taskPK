package com.company;

public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int index;
        double weight = 98;
        double height = 1.87;
        index = (int) (weight / (height * height));
        System.out.println("Индекс массы тела:" + index);

    }
}
