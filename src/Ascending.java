public class Ascending {
    public static void main(String[] args) {
        int arr[]=new int[]{5,7,12,6,9};
        int temp=0;
        System.out.println("Element original: ");

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] +" ");
        }
        for(int i=0; i< arr.length;i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println("Elements of array sorted: ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] +" ");
        }
    }
}
