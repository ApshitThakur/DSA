import java.util.HashMap;
public class twosumoptimizedmethod {
    public static void main(String[] args){
        int[] arr = {2,4,6,7};
        int target = 9;

        HashMap<Integer,Integer>map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            int complement = target - arr[i];

            if(map.containsKey(complement)){
                System.out.println(map.get(complement)+ " "+ i);
                break;
            }
            map.put(arr[i],i);
        }
    }

}
