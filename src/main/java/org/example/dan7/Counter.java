package org.example.dan7;

public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int counter = 0;
        for (Boolean el : arrayOfSheeps){
            if (el == true && el != null){
                counter++;
            }
        }
        return counter;
    }

    public static boolean isLove(final int flower1, final int flower2){
        if (flower1 % 2 == 0 && flower2 % 2 != 0 || flower1 % 2 != 0 && flower2 % 2 == 0){
            return true;
        }else
            return false;
    }

    public static int findSmallestInt(int[] args) {
        int min = args[0];
        for (int i = 0; i < args.length; i++) {
            if (args[i] < min) {
                min = args[i];
            }
        }
            return min;
    }

    public static void main(String[] args) {

        int[] arr = {34, -345, -1, 100};
        System.out.println(findSmallestInt(arr));

    }
}
