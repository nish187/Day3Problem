public class Largest {
    public static void main(String[] args) {
        int arr[]=new int[]{11,25,78,33,54};
        int max=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("The largest no is: " +max);
    }
}
