
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

	//Getter for exchanges
	public int getExchanges() {
		return exchanges;
	}
	//getter for compares
	public int getCompares() {
		return compares;
	}

}
