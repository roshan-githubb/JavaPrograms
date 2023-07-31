import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

public class Test5 {
	public static void main(String[] args) {
		int arr[] = {3,6,4,1,2};
		Arrays.sort(arr);
		int target=6;
		binarysearch(arr,target);
	}
	
	static void binarysearch(int[] arr, int target) {
		int ans=-1;
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
		int mid=start+(end-start)/2;
		if(arr[mid]==target) {
			ans=mid;
			break;
		}
		if(arr[mid]<target) {
			start=mid+1;
		}else {
			end=mid-1;
		}
		
	}
		if(ans==-1) {
			System.out.println("Not Found");
		}else {
			System.out.println("Found at index "+ ans);
		}
	}
}

    

