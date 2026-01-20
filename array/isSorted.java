public class isSorted {
    public static void main(String[] args){
        int[] arr = {1,2,3,5,4};

        boolean isShorted = true;

        for(int i=1; 1<arr.length; i++){
            if(arr[i] < arr[i - 1]){
                isShorted = false;
                break;
            }
        }
        System.out.println(isShorted);
    }
}
