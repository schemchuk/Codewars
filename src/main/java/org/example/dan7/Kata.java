package org.example.dan7;

import java.util.List;

public class Kata {
   public static String greet(String name) {
       return "Hello, " + name + " how are you doing today?";


   }


    public static boolean validatePin(String pin) {
        return pin.length() == 4 || pin.length() == 6 && pin.chars().allMatch(Character::isDigit);
    }

    //--------------------------------------------------------
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {

       int result = 0;
       for (int bit : binary) {
           result = result * 2 + bit;
       }

        return result;
    }
    //----------------------------------------------------------

    public static int nbYear(int p0, double percent, int aug, int p) {
        int count = 0;

        while (p0 < p) {
            p0 = (int)(p0 * (1 + percent / 100) + aug);
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(greet("Vasja"));
        //--------------------------------------

        List<Integer> binaryList = List.of(1, 1, 1, 1); // Пример списка битов
        int decimalResult = ConvertBinaryArrayToInt(binaryList);
        System.out.println("Binary to Decimal: " + decimalResult);

        //------------------------------------------------------
        System.out.println(nbYear(1000,0.02,50,1200));
        System.out.println();
    }
}
