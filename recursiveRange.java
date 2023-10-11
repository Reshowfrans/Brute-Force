public class recursiveRange {
    
    public static int  range(int num){

        if(num == 0){
            return 0;
        }
        else{
            return num+range(num-1);
        }
    }
    public static void main(String[] args){
        int result = range(6);
        System.out.println(result);
    }
}
