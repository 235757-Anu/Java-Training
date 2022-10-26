package Oct21;
import java.util.Arrays;

public class SelectionSort {
	public static int[] selectionSort(int[] arr){

		for (int i = 0; i < arr.length - 1; i++)
		{
		int index = i;
		for (int j = i + 1; j < arr.length; j++)
		if (arr[j] < arr[index])
		index = j;

		int smallerNumber = arr[index];
		arr[index] = arr[i];
		arr[i] = smallerNumber;
		}
		return arr;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {94,58,12,72,43,27,64,9,85};
		System.out.println("Before Sorting : ");
		System.out.println(Arrays.toString(arr));
		arr = selectionSort(arr);
		System.out.println("After Sorting : ");
		System.out.println(Arrays.toString(arr));

	}

}
