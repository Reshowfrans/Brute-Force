public class power {

    public static int power(int base, int pow){
        if(pow<1){
            return 1;
        }
        else{
            return base*power(base, pow-1);
            
        }
    }

    public static void main(String[] args){
        int result = power(2,3);
        System.out.println(result);
    }

    
}
