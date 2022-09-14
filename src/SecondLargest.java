public class SecondLargest {
    public static void main(String[] args) {
        int arr[]=new int[]{5,6,9,10,30};
        int temp=0;
        System.out.println("Original element: ");
        for(int i=0;i<arr.length;i++){
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
        System.out.println("Second Largest No is: "+ arr[arr.length-2]);
    }
}
