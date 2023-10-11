public class factorial {
    public static int fact(int num){
        if(num<1){
            return 1;
        }
        else{
            return num*fact(num-1);
            
        }
    }

    public static void main(String[] args){
        int result = fact(4);
        System.out.println(result);
    }
}
