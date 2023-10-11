public class capitalizeWord{

    public static String word(String str){
        String[] myString = str.split(" ");
        if(myString.length == 1){
            return myString[0].substring(0, 1).toUpperCase() + myString[0].substring(1, myString[0].length());
        }
        else{
            return word(myString[myString.length-1].substring(0, 1).toUpperCase() + myString[myString.length-1].substring(1, myString[myString.length-1].length()));
        }
    }
    public static void main(String[] args){
        String result = word("i love java");
        System.out.println(result);
    }
    
}
