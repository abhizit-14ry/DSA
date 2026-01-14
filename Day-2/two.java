public class two {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int[]arr = {23,47,4,3,10};
        for(int i =0; i<arr.length;i++){
           if (min>arr[i]) {
            min=arr[i];
           };  
        }
        
System.out.println(min);
    }
}
