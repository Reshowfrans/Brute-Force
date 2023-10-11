public class firstUpper {
    
    public static char upper(String str){
        char firstChar = str.charAt(0);
        
        if(Character.isUpperCase(firstChar)){
            return str.charAt(0);
        }
        else{
            return upper(str.substring(1, str.length()));
        }
        
    }
    public static void main(String[] args){
        char result = upper("appmillerS");
        System.out.println(result);
    }
}
