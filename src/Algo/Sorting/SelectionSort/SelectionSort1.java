package Algo.Sorting.SelectionSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Random;

/**
 * Created by Henu on 14/08/16.
 */
public class SelectionSort1 {
    private static int N;
    private static int A[];

    private static void selectionSort(){

        int temp;
        int start =2;

        for(int j=1; j<N; j++){
            for(int i=start; i<=N; i++){
                if(A[start-1] < A[i]){
                    temp = A[start-1];
                    A[start-1] = A[i];
                    A[i] = temp;
                }
            }
            start++;
        }
    }

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter output = new PrintWriter(System.out);

        System.out.println("Enter the number of elements in the array");

        N = Integer.parseInt(br.readLine());
        A = new int[N+1];

        Random random = new Random();
        for(int i=1; i<=N; i++){
            A[i] = random.nextInt(1000-0);
        }

        selectionSort();

        for(int i=1; i<=N; i++){
            output.print(A[i] + " ");
        }
        output.flush();
    }
}
