
public class selectionsort{
    public static void SelectionSort(int arr[]){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int mini = i;
            for (int j=i+1; j<n; j++){
                if(arr[mini]>arr[j]){
                    mini=j;
                }
            }
            int temp = arr[mini];
            arr[mini]= arr[i];
            arr[i]=temp;
        }
    }

    public static void printArray(int arr[]){
        for(int n: arr){
            System.out.print(n);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array= {7,8,3,1,2};
        System.out.println("Original Array:");
        printArray(array);
        SelectionSort(array);
        System.out.println("Sorted Array: ");
        printArray(array);
    }
}