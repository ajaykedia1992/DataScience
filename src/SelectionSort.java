// Java program for implementation of Selection Sort
class SelectionSort
{
	void sort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int max_ind = 0;
			for (int j = 0; j < n - i; j++) {
				if (arr[j] > arr[max_ind]) {
					max_ind = j;
				}
			}
			int temp = arr[n - i - 1];
			arr[n - i - 1] = arr[max_ind];
			arr[max_ind] = temp;
			System.out.println("Itereation = " + (i+1));
			printArray(arr);
		}

	}
 
    // Prints the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
 
    // Driver code to test above
    public static void main(String args[])
    {
        SelectionSort ob = new SelectionSort();
        int arr[] = {5,1,3,4,6,2};
        System.out.println("Original Array");
        ob.printArray(arr);
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
/* This code is contributed by Rajat Mishra*/