package c2.ch08;

public class array {
    
    public static void main(String[] args) {
        /* 배열 초기화
        int[] numbers = new int[] {10, 20, 30}
        int[] numbers = {10, 20, 30}
        int[] numbers;
        numbers = new int[] {10, 20, 30}
        */
        
        double[] arr = new double[5];

        arr[0] = 1.1;
        arr[1] = 2.2;
        arr[2] = 3.3;

        double mtotal = 1;
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        char[] alpha = new char[26];
        char ch = 'A';

        for(int i = 0; i < alpha.length; i++) {
            alpha[i] = ch++;
        }

        for(char al : alpha) {
            System.out.println(al + ", " + (int)al);
        }
    }
}
