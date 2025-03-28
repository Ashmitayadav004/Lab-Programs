// package CollegeLabPrograms;

// import java.util.Arrays;
// import java.util.Scanner;

// public class Arrayss {
//     int data[];
//     int size;

//     public Arrayss() {
//         Scanner sc = new Scanner(System.in);
//         data = new int[10];
//         for (int i = 0; i < data.length; i++) {
//             data[i] = sc.nextInt();
//         }
//     }

//     public Arrayss(int[] data) {
//         this.data = data;
//     }

//     public Arrayss(int size) {
//         data = new int[size];
//     }

//     public void reverse() {
//         for (int i = data.length - 1; i >= 0; i--) {
//             System.out.println(data[i]);
//         }
//     }

//     public int maximum() {
//         int max = data[0];
//         for (int i = 0; i < data.length; i++) {
//             if (data[i] > max) {
//                 max = data[i];
//             }
//         }
//         return max;
//     }

//     public int average() {
//         int sum = 0;
//         for (int i = 0; i < data.length; i++) {
//             sum += data[i];
//         }
//         int avg = sum / data.length;
//         return avg;
//     }

//     public void sorting() {
//         Arrays.sort(data);
//     }

//     public void display() {
//         System.out.println(Arrays.toString(data));
//     }

//     public int search(int no) {
//         for (int i = 0; i < data.length; i++) {
//             if (data[i] == no) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public int sizee() {
//         return data.length;
//     }

//     public static void main(String[] args) {

//         Arrayss arr = new Arrayss();
//         for (int i = 0; i < arr.data.length; i++) {
//             arr.data[i] = i * 2;
//         }
//         System.out.println("Array1:");
//         arr.display();
//         System.out.println("Reverse array is :");
//         arr.reverse();
//         System.out.println("Sorted array is : ");
//         arr.sorting();
//         System.out.printf("Array size is %d\n", arr.size);
//         System.out.printf("Maximum is %d\n", arr.maximum());
//         System.out.printf("Average is %d\n", arr.average());
//         System.out.printf("Search is %d\n", arr.search(2));

//         Arrayss arr1 = new Arrayss(5);
//         for (int i = 0; i < arr.data.length; i++) {
//             arr1.data[i] = i * 10;
//         }
//         System.out.println("Array2:");
//         arr1.display();
//         System.out.println("Reverse array is :");
//         arr1.reverse();
//         System.out.println("Sorted array is : ");
//         arr1.sorting();
//         System.out.printf("Array size is %d\n", arr1.size);
//         System.out.printf("Maximum is %d\n", arr1.maximum());
//         System.out.printf("Average is %d\n", arr1.average());
//         System.out.printf("Search is %d\n", arr1.search(2));

//         int[] inidata = { 1, 2, 3, 4, 5, 6 };
//         Arrayss arr2 = new Arrayss(inidata);
//         System.out.println("Array3:");
//         arr2.display();
//         System.out.println("Reverse array is :");
//         arr2.reverse();
//         System.out.println("Sorted array is : ");
//         arr2.sorting();
//         System.out.printf("Array size is %d\n", arr2.size);
//         System.out.printf("Maximum is %d\n", arr2.maximum());
//         System.out.printf("Average is %d\n", arr2.average());
//         System.out.printf("Search is %d\n", arr2.search(2));

//     }

// }

package CollegeLabPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayss {
    int data[];
    int size;

    public Arrayss() {
        Scanner sc = new Scanner(System.in);
        data = new int[10];
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < data.length; i++) {
            data[i] = sc.nextInt();
        }
        size = data.length; // Initialize size
    }

    public Arrayss(int[] data) {
        this.data = data;
        this.size = data.length; // Initialize size
    }

    public Arrayss(int size) {
        data = new int[size];
        this.size = size; // Initialize size
    }

    public void reverse() {
        for (int i = data.length - 1; i >= 0; i--) {
            System.out.println(data[i]);
        }
    }

    public int maximum() {
        int max = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }

    public int average() {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        int avg = sum / data.length;
        return avg;
    }

    public void sorting() {
        Arrays.sort(data);
    }

    public void display() {
        System.out.println(Arrays.toString(data));
    }

    public int search(int no) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == no) {
                return i;
            }
        }
        return -1;
    }

    public int sizee() {
        return data.length;
    }

    public static void main(String[] args) {
        Arrayss arr = new Arrayss();
        System.out.println("Array1:");
        arr.display();
        System.out.println("Reverse array is :");
        arr.reverse();
        System.out.println("Sorted array is : ");
        arr.sorting();
        arr.display();
        System.out.printf("Array size is %d\n", arr.size);
        System.out.printf("Maximum is %d\n", arr.maximum());
        System.out.printf("Average is %d\n", arr.average());
        System.out.printf("Search for 2 is at index: %d\n", arr.search(2));

        Arrayss arr1 = new Arrayss(5);
        for (int i = 0; i < arr1.data.length; i++) {
            arr1.data[i] = i * 10;
        }
        System.out.println("Array2:");
        arr1.display();
        System.out.println("Reverse array is :");
        arr1.reverse();
        System.out.println("Sorted array is : ");
        arr1.sorting();
        arr1.display();
        System.out.printf("Array size is %d\n", arr1.size);
        System.out.printf("Maximum is %d\n", arr1.maximum());
        System.out.printf("Average is %d\n", arr1.average());
        System.out.printf("Search for 2 is at index: %d\n", arr1.search(2));

        int[] inidata = { 1, 2, 3, 4, 5, 6 };
        Arrayss arr2 = new Arrayss(inidata);
        System.out.println("Array3:");
        arr2.display();
        System.out.println("Reverse array is :");
        arr2.reverse();
        System.out.println("Sorted array is : ");
        arr2.sorting();
        arr2.display();
        System.out.printf("Array size is %d\n", arr2.size);
        System.out.printf("Maximum is %d\n", arr2.maximum());
        System.out.printf("Average is %d\n", arr2.average());
    }
}