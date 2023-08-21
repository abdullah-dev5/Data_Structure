// Java program to implement recursive
// randomized algorithm.
public class RandomizedBinarySearch
{

	// To generate random number
	// between x and y ie.. [x, y]
	public static int getRandom(int x, int y)
	{
		return (x + (int)(Math.random() % (y-x+1)));
	}

	// A recursive randomized binary search function.
	// It returns location of x in
	// given array arr[l..r] is present, otherwise -1
	public static int randomizedBinarySearch(int arr[],
							int low, int high, int key)
	{
		if (high >= low)
		{
			// Here we have defined middle as
			// random index between l and r ie.. [l, r]
			int mid = getRandom(low, high);

			// If the element is present at the
			// middle itself
			if (arr[mid] == key)
				return mid;

			// If element is smaller than mid, then
			// it can only be present in left subarray
			if (arr[mid] > key)
				return randomizedBinarySearch(arr, low, mid-1, key);

			// Else the element can only be present
			// in right subarray
			return randomizedBinarySearch(arr, mid+1, high, key);
		}

		// We reach here when element is not present
		// in array
		return -1;
	}

	// Driver code
	public static void main(String[] args)
	{
		int arr[] = {2, 3, 4, 10, 40,50,78,90 };
		int n = arr.length;
		int key = 50;
		int result = randomizedBinarySearch(arr, 0, n-1, key);
		System.out.println((result == -1)?"Element is not present in array":
				"Element is present at index " + result);
	}
}

