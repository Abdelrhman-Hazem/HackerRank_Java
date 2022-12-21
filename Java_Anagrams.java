import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a=a.toLowerCase();
        b=b.toLowerCase();
        char[] aChar= a.toCharArray();
        char[] bChar= b.toCharArray();
        java.util.Arrays.sort(aChar);
        java.util.Arrays.sort(bChar);
        String aSorted = new String(aChar);
        String bSorted = new String(bChar);
        return aSorted.compareTo(bSorted)==0;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
