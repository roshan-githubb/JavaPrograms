import java.util.HashSet;
public class Test6 {
    
    public static String[] uniqueNames(String[] names1, String[] names2) {
       
      HashSet<String> set= new HashSet<>();
      for(int i=0;i<names1.length;i++){
        set.add(names1[i]);
      }
      for(int j=0;j<names2.length;j++){
        set.add(names2[j]);
      }
      return set.stream().toArray(String[]::new);
    }
    
    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", Test6.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}