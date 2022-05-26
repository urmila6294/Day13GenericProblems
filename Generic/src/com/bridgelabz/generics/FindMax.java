package com.bridgelabz.generics;

public class FindMax {
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
            Integer intValue1 = 65, intValue2 = 17, intValue3 = 8954;
            Float floatValue1 = 00.2f, floatValue2 = 23.56f, floatValue3 = 0.00157f;
            String stringValue1 = "Urmila", stringValue2 = "RakeshKumar", stringValue3 = "Sheral";

            FindMax maximum = new FindMax();
            maximum.getMax(intValue1, intValue2, intValue3);
            maximum.getMax(floatValue1, floatValue2, floatValue3);
            maximum.getMax(stringValue1, stringValue2, stringValue3);

        }
}

