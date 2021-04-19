package Arrayz;
import java.util.Arrays;

public class CountRepeatedChar {
    public static void main(String[] args) {
        int maxCounter = 0;
        char element = 0;
        String word = "TEEEEHHHNLOOOOOOOGIKAAAAAAAAAA";
        char[] arr = word.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int counter = 1;
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    counter++;
                }
                if (maxCounter < counter) {
                    maxCounter = counter;
                    element = arr[i];
                }
            }

        }
        System.out.println("element: "+element+" times: "+maxCounter);
    }
}
