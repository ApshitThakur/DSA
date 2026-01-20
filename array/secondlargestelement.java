public class secondlargestelement {
    public static void main(String[] args){
        int[] arr={2, 3, 5 , 20, 13, 15};

        int largest= Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for(int num :arr){
            if(num > largest){
                secondlargest = largest;
                largest = num;
            }else if(num > secondlargest && num != largest){
                secondlargest = num;
            }
        }
        System.out.println(secondlargest);
    }
}
