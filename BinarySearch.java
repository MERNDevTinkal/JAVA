package searchingAndSorting;

public class BinarySearch {
	public static  int binarySearch(int [] input , int ele) {
		int start = 0;
		int end = input.length-1;
		while(start<=end) {
			int mid = (start+end)/2;
			if(ele== input [mid]) {
				return mid;
				
			}
			else if (ele>input[mid]) {
				start = mid +1;
			}
			else {
				end = mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] input = {2,4,5,8,9,15,21,28};
		int index= binarySearch(input,15);
		System.out.println(index);

	}

}
