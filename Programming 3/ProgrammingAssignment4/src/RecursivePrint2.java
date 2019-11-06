import java.io.*;
import java.util.*;

public class RecursivePrint2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        int[] lineEnds = new int[lines];  
        for(int i = 0; i < lines; i++)
        	lineEnds[i] = sc.nextInt();
        line(lines-1, lineEnds);
    }   
    public static void line(int lines, int[] lineEnds){
        if(lines > 0)
            line(lines-1, lineEnds);
        num(lineEnds[lines]);
        System.out.println();
    }
    public static void num(int n){
        if(n > 0) {
        	System.out.print(n + " ");
            num(n-1);
        }
    }        
}
