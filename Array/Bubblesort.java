
public class Bubblesort{
   public static void bubblesort(int arr[]){
    for (int i=0; i<arr.length-1; i++){
        for(int j=0; j<arr.length-i-1; j++){
            if(arr[j] > arr[j+1]){
                //swap
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
   }

   public static void printArray(int arr[]){
    for(int num:arr){
        System.out.print(num+" ");
    }
    System.out.println();
   }
   
   public static void main(String[] args) {
       int array[] = {7,8,3,1,2};

       System.out.println("Before sorting\n");
       printArray(array);

       bubblesort(array);
       System.out.println("After sorting");
       printArray(array);
   }
}