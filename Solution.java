
import java.util.*;

public class Solution {

    // Complete the insertionSort2 function below.
    static void insertionSort2(int n, int[] arr) {
    	for(int i = 1; i<n; i++){
    		if(arr[i-1] > arr[i]){
    			swap(arr,i-1, i);
	 
				for(int j = i; j > 0; j--){
					if(arr[j] < arr[j-1]){
						swap(arr,j, j-1);
						
					}
				}
				printArr(arr);
    		}else{
    			printArr(arr);
    		}
    	}

    }
    static void printArr(int[] arr){
    	for(int i : arr){
    		System.out.print(i);
    		System.out.print(" ");
    	}
    	System.out.println("");
    }
    
    static void swap(int[] arr, int val1, int val2){
    	int temp = 0;
		temp = arr[val1];
		arr[val1] = arr[val2];
		arr[val2] = temp; 
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        insertionSort2(n, arr);

        scanner.close();
    }
}
