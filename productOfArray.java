public class productOfArray {
    
    public static int product(int[] arr, int len){
        if(len==0){
            int result = arr[0];
            return 1;
        }
        else{
            return arr[len-1]*product(arr, len-1);
        }
    
    }
    public static void main(String[] args){
        int [] arr = {1,2,3};
        int result = product(arr,3);
        System.out.println(result);
    }
}
