package com.bl.generics;

public class Refactor1 {
	public static <T extends Comparable<T>> T getMax(T num1, T num2, T num3) { // Refactor all 3 in one Generic Method
        T max = num1;
        if (num2.compareTo(max) > 0)
            max = num2;
        if (num3.compareTo(max) > 0)
            max = num3;
        showMaxValue(num1, num2, num3, max);
        return max;
    }

    private static <T extends Comparable<T>> void showMaxValue(T num1, T num2, T num3, T max) {
        System.out.println("the input1 is " + num1 + "\ninput2 is " + num2 + "\ninput3 is " + num3);
        System.out.println("Maximum : " + max + "\n");
    }

    public static void main(String[] args) {
        Integer intValue1 = 75, intValue2 = 32, intValue3 = 68;
        Float floatValue1 = 4.6f, floatValue2 = 9.86f, floatValue3 = 2.007f;
        String stringValue1 = "Suma", stringValue2 = "Suresh", stringValue3 = "Saroja";

        Refactor1 maximum = new Refactor1();
        maximum.getMax(intValue1, intValue2, intValue3);
        maximum.getMax(floatValue1, floatValue2, floatValue3);
        maximum.getMax(stringValue1, stringValue2, stringValue3);

    }
	

}
