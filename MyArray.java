package sk.itsovy.podhajecka.ProjectArray;
import java.util.Random;

public class MyArray {
    public static void test1() {
        int[] arr = new int[7];
        /*arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;*/
        for (int i = 6; i >= 0; i--) {
            arr[i] = i + 1;
        }
        for (int i = 6; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");

    }

    //10cisiel od zadu dopredu dvojciferne random
    public static void test2() {
        int[] arr2 = new int[10];
        int i;
        Random rnd = new Random();
        for (i = 0; i < 10; i++) {
            int r = (rnd.nextInt(81) + 10);
            arr2[i] = r;
            System.out.print(arr2[i] + " ");
        }
        System.out.println(" ");

        for (i = 9; i >= 0; i--) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println(" ");
        System.out.println(" ");

        for (i = 0; i < 10; i++)
            if (arr2[i] % 2 == 0) {
                System.out.print(arr2[i] + " ");
            }

    }
}
