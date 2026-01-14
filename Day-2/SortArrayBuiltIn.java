import java.util.Arrays;

public class SortArrayBuiltIn {
    public static void main(String[] args) {
    //     int []x={20,30,40,50};
    //     System.out.println(x[2]);
    //     change(x);
    //     System.out.println(x[2]);


    // Shallow copy and deep copy..

    // int[] arr ={10,20,30,40,50};
    // int[]x =arr; // x is a shallow copy of arr.
    // x[0]=100;
    // System.out.println(arr[0]);

    // int[]y=Arrays.copyOf(arr,arr.length);
    // y[0]=300;  // deep copy of arr
    // System.out.println(y[0]);
    // System.out.println(arr[0]);

   
        // sort Array builtin methods....

        int[] arr = {4,1,7,5,-3,10,2};
        // print(arr);
        Arrays.sort(arr);
        print(arr);

    }

    // public static void change(int[] y) {
    //     y[2]=90;
    // }


    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
