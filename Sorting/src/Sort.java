
public class Sort {

	private int exchanges = 0;
	private int compares = 0;

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

	public void insertionSort(AnyType[] array) {
		    for (int i=0; i < array.length; i++) {
		        /* Insert a[i] into the sorted sublist */
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

	public int getExchanges() {
		return exchanges;
	}

	public int getCompares() {
		return compares;
	}

}
