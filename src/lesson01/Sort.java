package lesson01;

import java.util.Arrays;

/**
 * Created by Admin on 18.09.2016.
 */
public class Sort {
    public static int iterations = 0;

    public static void main(String[] args) {
        int[] list = randomArray(15);
        int[] arr = clone(list);

        System.out.println(Arrays.toString(list));
        stupidSort(arr);
        System.out.println(Arrays.toString(arr) + " Кол-во : " + iterations);
        arr = clone(list);
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr) + " Кол-во : " + iterations);
        arr = clone(list);
        shakeSort(arr);
        System.out.println(Arrays.toString(arr) + " Кол-во : " + iterations);
        arr = clone(list);
        selectionSort(arr);
        System.out.println(Arrays.toString(arr) + " Кол-во : " + iterations);
    }

    public static void stupidSort(int[] arr) {
        iterations = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int tmp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = tmp;
                i = -1;
            }
            iterations++;
        }
    }

    public static void bubbleSort(int[] arr) {
        iterations = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
                iterations++;
            }
            iterations++;
        }
    }

    public static void shakeSort(int[] arr) {
        int left = 0, right = arr.length - 1;
        int tmp = 0; iterations = 0;
        do {
            iterations++;
            for (int i = left; i < right; i++) {
                if (arr[i] > arr[i + 1]) {
                    tmp        = arr[i];
                    arr[i]     = arr[i + 1];
                    arr[i + 1] = tmp;
                }
                iterations++;
            }
            right--;

            for (int j = right; j > left; j--) {
                if (arr[j] < arr[j - 1]) {
                    tmp        = arr[j];
                    arr[j]     = arr[j - 1];
                    arr[j - 1] = tmp;
                }
                iterations++;
            }
            left++;
        } while (left <= right);
    }

    public static void selectionSort(int[] arr) {
        iterations = 0;
        int minI = 0, minJ = 0;
        for (int i = 0; i < arr.length; i++) {
            minI = minJ = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (/*arr[j] < arr[minI] &*/ arr[j] < arr[minJ]) {
                    minJ = j;
                }
                iterations++;
            }
            int tmp = arr[i];
            arr[i] = arr[minJ];
            arr[minJ] = tmp;
            iterations++;
        }
    }

    public static int[] randomArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 30);
        }
        return array;
    }

    public static int[] clone(int[] clone) {
        int[] array = new int[clone.length];
        System.arraycopy(clone, 0, array, 0, clone.length);
        return array;
    }
}


