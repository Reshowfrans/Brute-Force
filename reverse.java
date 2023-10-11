public class reverse {
 
    public static String reverse(String str){
        if(str.length() == 1){
            return str;
        }
        else{
            return str.charAt(str.length()-1) + reverse(str.substring(0,str.length()-1));
        }
    }
    public static void main(String[] args){
        String result = reverse("hello");
        System.out.println(result);
    }
}
