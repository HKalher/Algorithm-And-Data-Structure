package Algo.Sorting.BubbleSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Random;

/**
 * Created by Henu on 14/08/16.
 */
public class BubbleSort1 {
    private static int N;
    private static int A[];

    private static void bubbleSort(){
        int temp;
        int end = N;
        for(int j=1;j<N;j++){
            for(int i=1;i<end;i++){
                if(A[i+1] > A[i]){
                    temp = A[i];
                    A[i] = A[i+1];
                    A[i+1] = temp;
                }
            }
            end--;
        }
    }

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter output = new PrintWriter(System.out);
        System.out.println("Enter the number of elements in the array");

        N = Integer.parseInt(br.readLine());
        A = new  int[N+1];

        Random random = new Random();
        for(int i=1; i<=N; i++){
            A[i] = random.nextInt(1000-0);
            System.out.print(A[i] + " ");
        }

        bubbleSort();

        System.out.println("\nSorted Array:-");
        for(int i=1;i<=N;i++){
            output.print(A[i] + " ");
        }
        output.flush();
    }
}
