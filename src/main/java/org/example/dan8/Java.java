package org.example.dan8;

public class Java {



    public static int doubleInteger(int i){
        return i * 2;
    }
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = 0;
        for (int i = 0; i < classPoints.length; i++) {
           sum += classPoints[i];
           if (sum / classPoints.length < yourPoints){
               return true;
           }else {
               return false;
           }
        }
        return true;

    }

    public static String findNeedle(Object[] haystack) {
        for (int i =0; i < haystack.length; i++){
            if ( "needle".equals(haystack[i]))
                System.out.println(i);
                return "find position " + 1;
        }

        return "not find";


    }

    public static void main(String[] args) {
        

    }
}
