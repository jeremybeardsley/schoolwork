
public class Sort {

	//Counters that will be accessed by the TestSort Class to show us how
	//many exchanged and compares for any one particular instance of Sort
	private int exchanges = 0;
	private int compares = 0;

	//runs bubble sort on array of AnyType
	public void bubbleSort(AnyType[] array) {

		AnyType temp;
		int numberOfItems = array.length;

		for (int pass = 1; pass != numberOfItems; pass++) {
			for (int index = 0; index != numberOfItems - pass; index++) {
				compares++;
				if (array[index].isBetterThan(array[index + 1])) {
					temp = array[index];
					array[index] = array[index + 1];
					array[index + 1] = temp;
					exchanges++;
				}
			}
		}
	}
//Runs insertion sort on array of AnyType
	public void insertionSort(AnyType[] array) {
		    for (int i=0; i < array.length; i++) {
		        
		        AnyType v;
		        v=array[i];
		        int j;
		        for (j = i - 1; j >= 0; j--) {
		        	compares++;
		            if (v.isBetterThan(array[j])) break;
		            array[j + 1] = array[j];
		            exchanges++;
		        }
		        array[j + 1] = v;
		    }
		}
	
//Run selection Sort on array of AnyType
	public void selectionSort(AnyType[] array) {
		int numberOfItems = array.length;
		AnyType temp;
		for (int i = 0; i < numberOfItems - 1; i++) {

			for (int j = i + 1; j < numberOfItems; j++) {
				compares++;
				if (array[i].isBetterThan(array[j])) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					exchanges++;
				}
			}

		}

	}
	public void shellSort(AnyType[] array) {
		for (int gap = array.length / 2; gap > 0; gap = gap == 2 ? 1
				: (int) (gap / 2.2))
			for (int i = gap; i < array.length; i++) {
				AnyType tmp = array[i];
				int j = i;
				compares++;
				for (; j >= gap && array[j - gap].isBetterThan(tmp); j -= gap) {
					array[j] = array[j - gap];
					exchanges++;
				}
				array[j] = tmp;
			}
	}
	
	//Begin Code Block for Merge Sort
	 private AnyType[] numbers;
	  private AnyType[] helper;

	  private int number;

	  public void msort(AnyType [] array) {
		    this.numbers = array;
		    number = array.length;
		    this.helper = new AnyType[number];
		    mergesort(0, number - 1);
		  }

		  private void mergesort(int low, int high) {
		    // Check if low is smaller then high, if not then the array is sorted
		    if (low < high) {
		      // Get the index of the element which is in the middle
		      int middle = (low + high) / 2;
		      // Sort the left side of the array
		      mergesort(low, middle);
		      // Sort the right side of the array
		      mergesort(middle + 1, high);
		      // Combine them both
		      merge(low, middle, high);
		    }
		  }


		  private void merge(int low, int middle, int high) {

		    // Copy both parts into the helper array
		    for (int i = low; i <= high; i++) {
		      helper[i] = numbers[i];
		    }

		    int i = low;
		    int j = middle + 1;
		    int k = low;
		    // Copy the smallest values from either the left or the right side back
		    // to the original array
		    while (i <= middle && j <= high) {
		      compares++;
		    	if (helper[i].isBetterThan(helper[j])) {
		        numbers[k] = helper[i];
		        i++;
		        exchanges++;
		      } else {
		        numbers[k] = helper[j];
		        j++;
		      }
		      k++;
		    }
		    // Copy the rest of the left side of the array into the target array
		    while (i <= middle) {
		      numbers[k] = helper[i];
		      k++;
		      i++;
		    }

		  }
		  //End Code Block for Merge sort
	//Getter for exchanges
	public int getExchanges() {
		return exchanges;
	}
	//getter for compares
	public int getCompares() {
		return compares;
	}

}
