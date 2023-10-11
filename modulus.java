import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class modulus{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input your N: ");
        int N = input.nextInt();
        
        System.out.print("Input your z: ");
        int z = input.nextInt();

        int result = mod(N, z);
        System.out.println(result);
        
    }

    public static int mod(int N, int z){

        int count =0;
        for(int x=0;x<N;x++){
            for(int y=0;y<N;y++){
                if(x*y%N == z){
                    count++;
                }
            }
        }
        return count;
    }
    
}
