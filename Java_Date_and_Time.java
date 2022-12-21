import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Calendar;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        //Date date = new Date();
        //Time time = new Time();
        Calendar gc =  Calendar.getInstance();
        
        gc.set(year, month-1, day);
        System.out.println(gc);
        int dayInt = gc.get(Calendar.DAY_OF_WEEK);
        System.out.println(gc.get(Calendar.DAY_OF_WEEK));
        String s = new String();
        switch (dayInt){
            case 1:
                s="SUNDAY";
                break;
            case 2:
                s="MONDAY";
                break;
            case 3:
                s="TUESDAY";
                break;
            case 4:
                s="WEDNESDAY";
                break;
            case 5:
                s="THURSDAY";
                break;
            case 6:
                s="FRIDAY";
                break;
            case 7:
                s="SATURDAY";
                break;
        }
        
        
        return s;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
