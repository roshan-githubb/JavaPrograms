import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test4{
    public static void main(String[] args) {
       int[] arr={4,3,6,1,1,2,9,9,9};
       int res[] =dup(arr);
       System.out.println(Arrays.toString(res));
    }

    static int[] dup(int[] num){
        Set<Integer> set=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for(int i=0;i<num.length;i++){
            if(set.contains(num[i])){
                set2.add(num[i]);
            }else{
                set.add(num[i]);
            }
        }
        return set2.stream().mapToInt(Integer::intValue).toArray();
        
        }
    
}