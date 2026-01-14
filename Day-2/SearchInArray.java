public class SearchInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 2;
        // boolean found = false;
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] == target) {
        //         found = true;
        //         break;
        //     }
        // }
        // if (found) {
        //     System.out.println("Target found in array");
        // } else {
        //     System.out.println("Target not found in array");
        // }

        int found = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = i;
                break;
            }
        }
        if (found != -1) {
            System.out.println("Target found in array at index: " + found);
        } else {
            System.out.println("Target not found in array");
        }
    }
}
 