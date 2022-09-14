public class Minimum {
    public static void main(String[] args) {
        int arr[]=new int[]{11,25,78,33,54};
        int min=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println("The Minimum no is: " +min);
    }
}
