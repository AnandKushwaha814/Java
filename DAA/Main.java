import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int[] arr = new int[100];
        int i;
        int op, cont;
        do {
            System.out.print("Enter size of array: ");
            n = scanner.nextInt();
            System.out.println("Enter values of array:");
            for (i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.println("Enter sorting algorithm to use:");
            System.out.println("1: Bubble");
            System.out.println("2: Insertion");
            System.out.println("3: Quick sort");
            System.out.println("4: Merge sort");
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    bubbleSort(arr, n);
                    break;
                case 2:
                    insertionSort(arr, n);
                    break;
                case 3:
                    quickSort(arr, 0, n - 1);
                    break;
                case 4:
                    mergeSort(arr, 0, n - 1);
                    break;
                default:
                    System.out.println("Invalid option!");
            }
            for (i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("\nContinue? 1/0:\t");
            cont = scanner.nextInt();
        } while (cont == 1);
    }

    public static void bubbleSort(int[] arr, int size) {
        int i, j, temp;
        for (i = 0; i < size - 1; i++) {
            for (j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] arr, int size) {
        int i, j, key;
        for (i = 1; i < size; i++) {
            key = arr[i];
            for (j = i; j > 0 && arr[j - 1] > key; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = key;
        }
    }

    public static int partition(int[] arr, int offset, int size) {
        int x = arr[size];
        int i = offset - 1;
        int j;
        int temp;
        for (j = offset; j < size; j++) {
            if (arr[j] <= x) {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[i + 1];
        arr[i + 1] = arr[size];
        arr[size] = temp;
        return i + 1;
    }

    public static void quickSort(int[] arr, int offset, int size) {
        if (offset < size) {
            int pivot = partition(arr, offset, size);
            quickSort(arr, offset, pivot - 1);
            quickSort(arr, pivot + 1, size);
        }
    }

    public static void merge(int[] arr, int offset, int mid, int size) {
        int n1 = mid - offset + 1;
        int n2 = size - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        int i, j, k;
        for (i = 0; i < n1; i++) {
            L[i] = arr[offset + i];
        }
        for (j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }
        i = 0;
        j = 0;
        k = offset;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] arr, int offset, int size) {
        if (offset < size) {
            int mid = (offset + size) / 2;
            mergeSort(arr, offset, mid);
            mergeSort(arr, mid + 1, size);
            merge(arr, offset, mid, size);
        }
    }
}
