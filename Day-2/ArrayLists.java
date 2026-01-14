import java.util.ArrayList;
public class ArrayLists{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        System.out.println(arr.get(2)); //arr[2];
        arr.set(2, 100); //arr[2] = 100;
        System.out.println(arr.get(2));

        System.out.println(arr);


        int n = arr.size();
        for(int i = 0; i < n; i++){
            System.out.print(arr.get(i) + " ");
        }

        for (int integer : arr) {
            System.out.print(integer + " ");
        }
    }
}