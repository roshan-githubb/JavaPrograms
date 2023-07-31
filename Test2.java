import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

class Test2{
	public static void main(String[] args) {
		// String str="hello";
		// String res=remdup(str);
		// System.out.println(res);
		int[] arr={1,2,2,3,4,5};
		int[] arr2=remDup(arr);
		System.out.println(Arrays.toString(arr2));


	}
	// static String remdup(String string){
	// 	Set<Character> set=new HashSet<>();
	// 	StringBuilder sb=new StringBuilder();
	// 	for(int i=0;i<string.length();i++){
	// 		Character c=string.charAt(i);
	// 		if(!set.contains(c)){
	// 			set.add(c);
	// 			sb.append(c);
	// 		}
	// 	}
	// 	return sb.toString();
	// }

	static int[] remDup(int[] arr){
		Set<Integer> set=new HashSet<>();
		List<Integer> al=new ArrayList<>();
		for(int i=0;i<arr.length;i++){
			if(!set.contains(arr[i])){
				set.add(arr[i]);
				al.add(arr[i]);
			}
		}
		return al.stream().mapToInt(Integer::intValue).toArray();

	}
}