import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println(" Задача 1 ");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        double[] time = {1.57, 7.654, 9.986};

        int[] amount = {2, 7, 12, 23};
        // Задача 2
        System.out.println(" Задача 2 ");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        for (int j = 0; j < time.length; j++) {
            if (j == time.length - 1) {
                System.out.print(time[j]);
                break;
            }
            System.out.print(time[j] + ", ");
        }
        System.out.println();
        for (int k = 0; k < amount.length; k++) {
            if (k == amount.length - 1) {
                System.out.print(amount[k]);
                break;
            }
            System.out.print(amount[k] + ", ");
        }
        System.out.println();
        // Задача 3
        System.out.println(" Задача 3 ");
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        for (int j = time.length - 1; j >= 0; j--) {
            if (j == 0) {
                System.out.print(time[j]);
                break;
            }
            System.out.print(time[j] + ", ");
        }
        System.out.println();
        for (int k = amount.length - 1; k >= 0; k--) {
            if (k == 0) {
                System.out.print(amount[k]);
                break;
            }
            System.out.print(amount[k] + ", ");
        }
        System.out.println();
        // Задача 4
        System.out.println(" Задача 4 ");
        for (int i = 0; i < arr.length; i++)
            if (arr[i] % 2 != 0) {
                arr[i] += 1;
            }
        System.out.print(Arrays.toString(arr));
    }
}
