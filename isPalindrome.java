public class isPalindrome {
   
    public static Boolean isPal(String str){
       if(str.length() == 1){
            return true;
       }
       else{
            if(str.charAt(0) == str.charAt(str.length()-1)){
                return isPal(str.substring(1, str.length()-1));
            }
       }

       return false;
    }
    public static void main(String[] args){
        Boolean result = isPal("mom");
        System.out.println(result);
    }
}
