import java.util.Arrays;

public class Sorting_Assignment {
	
	void bubbleSort(int arr[]) {
		
		int n = arr.length;
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-i-1; j++) {
				if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                    
                }	
			}
		}
	}
	
	void insertionSort(int arr[]) {
		
		int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {  // Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position
                 arr[j + 1] = arr[j];       
                 j = j - 1;
                 }
            
            arr[j + 1] = key;
        }
		
	}
	
	void printArray(int arr[]) {
		
		int n = arr.length;
		for(int i=0; i<n-1; i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		
		int[] productPrices = {1200, 4500, 3200, 4300, 1500};
		int[] covidCases = {512433, 734667, 346762, 989823, 877873, 97632, 142331};
		int[] scores = {70, 88, 12, 34, 56, 80, 90, 95, 34, 35, 16};
		
		Sorting_Assignment sort = new Sorting_Assignment();
		
		System.out.println("Original Array : \n"+Arrays.toString(productPrices));
		
		sort.bubbleSort(productPrices);
		System.out.println("Bubble Sort : ");
		sort.printArray(productPrices);
		
		sort.insertionSort(productPrices);
		System.out.println("Insertion Sort : ");
		sort.printArray(productPrices);
		
		System.out.println();
		
		System.out.println("Original Array : \n"+Arrays.toString(covidCases));
		
		sort.bubbleSort(covidCases);
		System.out.println("Bubble Sort : ");
		sort.printArray(covidCases);
		
		sort.insertionSort(covidCases);
		System.out.println("Insertion Sort : ");
		sort.printArray(covidCases);
		
		System.out.println();
		
		System.out.println("Original Array : \n"+Arrays.toString(scores));
		
		sort.bubbleSort(scores);
		System.out.println("Bubble Sort : ");
		sort.printArray(scores);
		
		sort.insertionSort(scores);
		System.out.println("Insertion Sort : ");
		sort.printArray(scores);
		
		System.out.println();
		
		
		
		

	}

}
