import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        String str="hello";
        String res=printDupString(str);
        System.out.println(res);

        int[] arr={1,2,3,3,3,4,4,5};
        int[] res1=printDupArray(arr);
        System.out.println(Arrays.toString(res1));

    }
    static String printDupString(String string){
        Set<Character> set=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<string.length();i++){
            if(set.contains(string.charAt(i))){
                sb.append(string.charAt(i));
            }else{
                set.add(string.charAt(i));
            }

        }
        return sb.toString();
        
    }

    static int[] printDupArray(int[] arr){
        Set<Integer> set=new HashSet<>();
        Set<Integer> set2=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                set2.add(arr[i]);
            }else{
            set.add(arr[i]);
            }
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}
