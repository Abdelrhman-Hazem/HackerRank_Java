import java.io.*;
import java.util.*;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        String[] strArr = s.split("[!,?._'@ ]");
        
        int size = strArr.length;
        for(int i=0;i<strArr.length;i++){
            if(strArr[i].compareTo("")==0)size--; 
        }
        
        System.out.println(size);
        for(int i=0;i<strArr.length;i++){
            if(strArr[i].compareTo("")!=0) System.out.println(strArr[i]); 
        }     
        
       
    }
}

