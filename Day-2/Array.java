// import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Array size : ");
        // int n = sc.nextInt();

        // int[] arr = {1,2,3,4,5,6};
        // System.out.println(arr[2]);

        // int[] arr = { 1, 34, 56, 78, 94, 67 };
        // for (int i = 0; i <= 5; i++) {
        // System.out.print(arr[i]+" ");
        // }

        // input or ouput

        // int[] abhi = new int[7];
        // for(int i=0; i<7; i++){
        // int x = sc.nextInt();
        // abhi[i] = x;
        // System.out.print(abhi[i]+ " ");
        // }

        // Input k double...
        // int [] anu = new int[6];
        // for(int i=0; i<6; i++){
        // int x = (sc.nextInt())*2;
        // anu[i] =x;
        // System.out.print(anu[i]+" ");
        // }

        // negative value..
        // int[] arr = new int[n];
        // System.out.print("Enter Array Elements :");
        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();
        // if (arr[i] < 0) {
        // System.out.print(arr[i] + " ");
        // }

        // }

        // print sum of elements of the array..

        int[] arr = { 10, 20, 30, -40 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

        // sc.close();
    }
}