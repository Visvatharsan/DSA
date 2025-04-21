
public class Insertionsort{
    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int key = arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1]= key;
        }
    }

    public static void printArray(int arr[]){
        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int array[]= {7,8,3,1,2};
        System.out.println("Before sorting ");
        printArray(array);
        System.out.println("After sorting ");
        insertionSort(array);
        printArray(array);
    }
}