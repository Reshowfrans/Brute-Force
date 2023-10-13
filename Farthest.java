import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Farthest {


    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        List<Integer> xValues = new ArrayList<>();
        List<Integer> yValues = new ArrayList<>();

        int N = key.nextInt();
        for(int i=0; i<N;i++){
            int cordinate = key.nextInt();
            xValues.add(cordinate);
            int cordinat = key.nextInt();
            yValues.add(cordinat);

        }
        System.out.println();
        int[] xCords = new int[N];
        int[] yCords = new int[N];

         for(int j=0;j<N;j++){
              xCords[j] = xValues.get(j);
              yCords[j] = yValues.get(j);
        }

        int[][] xy = new int[N][2];
        for(int z=0;z<N;z++){            
                xy[z][0] = xCords[z];

                xy[z][1] = yCords[z];
        }
        System.out.println();
        
        int maxX =0, indOne =0, indTwo = 0;
        for(int u=0;u<N;u++){
            for(int v=0;v<N;v++){
                int dif = (xCords[u] - xCords[v]) + (yCords[u] - yCords[v]);

                if(dif<0){
                    dif = dif * -1;
                }

                if(dif > maxX){
                    maxX = dif;
                     indOne = u;
                     indTwo = v;


                } 
                
            }
        }
        System.out.println(xCords[indOne] + " "+ yCords[indOne]);
        System.out.println(xCords[indTwo] + " "+ yCords[indTwo]);
    }


}
