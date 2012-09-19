import java.io.*;
import java.util.Scanner;

class TestSort {

	public static void main(String[] args) throws IOException {

		Scanner bestFileScan = new Scanner(new File("1to2000.txt"));
		Scanner worstFileScan = new Scanner(new File("2000to1.txt"));
		Scanner avgFileScan = new Scanner(new File("random.txt"));
		
		IntegerType[] bestCaseBubble = new IntegerType[2000];
		IntegerType[] worstCaseBubble = new IntegerType[2000];
		IntegerType[] avgCaseBubble = new IntegerType[2000];

		for (int i = 0; i < bestCaseBubble.length; i++) {
			bestCaseBubble[i] = new IntegerType(bestFileScan.nextInt());
		}
		for (int i = 0; i < worstCaseBubble.length; i++) {
			worstCaseBubble[i] = new IntegerType(worstFileScan.nextInt());
		}
		for (int i = 0; i < avgCaseBubble.length; i++) {
			avgCaseBubble[i] = new IntegerType(avgFileScan.nextInt());
		}
		IntegerType[]bestCaseInsertion = bestCaseBubble.clone();
		IntegerType[]bestCaseSelection = bestCaseBubble.clone();
		IntegerType[]avgCaseInsertion = avgCaseBubble.clone();
		IntegerType[]avgCaseSelection = avgCaseBubble.clone();
		IntegerType[]worstCaseInsertion = worstCaseBubble.clone();
		IntegerType[]worstCaseSelection = worstCaseBubble.clone();
		
		
		
		System.out.print("Results for Bubble Sort:");
		Sort bubbleSortBest = new Sort();
		bubbleSortBest.bubbleSort(bestCaseBubble);
		System.out.print("\nBest Case\tExchanges: "
				+ bubbleSortBest.getExchanges() + "\t\tCompares: "
				+ bubbleSortBest.getCompares());

		Sort bubbleSortAvg = new Sort();
		bubbleSortAvg.bubbleSort(avgCaseBubble);
		System.out.print("\nAvg Case\tExchanges: "
				+ bubbleSortAvg.getExchanges() + "\tCompares: "
				+ bubbleSortAvg.getCompares());

		Sort bubbleSortWorst = new Sort();
		bubbleSortWorst.bubbleSort(worstCaseBubble);
		System.out.print("\nWorst Case\tExchanges: "
				+ bubbleSortWorst.getExchanges() + "\tCompares: "
				+ bubbleSortWorst.getCompares());
		
		System.out.print("\nResults for Selection Sort:");
		Sort selectionSortBest = new Sort();
		selectionSortBest.selectionSort(bestCaseSelection);
		System.out.print("\nBest Case\tExchanges: "
				+ selectionSortBest.getExchanges() + "\t\tCompares: "
				+ selectionSortBest.getCompares());
		
		Sort selectionSortAvg = new Sort();
		selectionSortAvg.selectionSort(avgCaseSelection);
		System.out.print("\nAvg Case\tExchanges: "
				+ selectionSortAvg.getExchanges() + "\tCompares: "
				+ selectionSortAvg.getCompares());

		Sort selectionSortWorst = new Sort();
		selectionSortWorst.selectionSort(worstCaseSelection);
		System.out.print("\nWorst Case\tExchanges: "
				+ selectionSortWorst.getExchanges() + "\tCompares: "
				+ selectionSortWorst.getCompares());
		
		System.out.print("\nResults for Insertion Sort:");
		Sort insertionSortBest = new Sort();
		insertionSortBest.insertionSort(bestCaseInsertion);
		System.out.print("\nBest Case\tExchanges: "
				+ insertionSortBest.getExchanges() + "\t\tCompares: "
				+ insertionSortBest.getCompares());
		
		Sort insertionSortAvg = new Sort();
		insertionSortAvg.insertionSort(avgCaseInsertion);
		System.out.print("\nAvg Case\tExchanges: "
				+ insertionSortAvg.getExchanges() + "\tCompares: "
				+ insertionSortAvg.getCompares());

		Sort insertionSortWorst = new Sort();
		insertionSortWorst.insertionSort(worstCaseInsertion);
		System.out.print("\nWorst Case\tExchanges: "
				+ insertionSortWorst.getExchanges() + "\tCompares: "
				+ insertionSortWorst.getCompares());

	}
}