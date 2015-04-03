package nyc.c4q.charlyn23;

//THIS IS STILL A WORK IN PROGRESS


/**
 * Created by charlynbuchanan on 4/2/15.
 * Create a class to calculate the distribution of characters in the contents of a
 * text file. Your class called DistributionCalculator should implement a method
 * calculate(File textFile) which accepts as input a Text file. It reads the contents
 * of the file and returns an ArrayList which contains the distribution/percentage of
 * characters (a-z) in the text file. You should lowercase lines before you do the
 * calculation. Call the calculate method from main and print the distribution.
 * You can ignore characters which do not belong in the range(a-z) for doing your
 * calculation. Your program's output should look something like:

 a = 14.44 %
 b = 6.02 %
 ...
 ...
 z = 0.05 %
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class DistributionCalculator {
    public static void main (String [] args){

        //File filePath = new File("/Users/charlynbuchanan/Desktop/accesscode/HW_04-01/src/nyc/c4q/charlyn23/MobyDick.txt");

        File filePath = new File ("/Users/charlynbuchanan/Desktop/accesscode/HW_04-01/src/nyc/c4q/charlyn23/MobyDick.txt");
        File file = new File(filePath, "MobyDick.txt");
        System.out.print(file);

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;
        int h = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int m = 0;
        int n = 0;
        int o = 0;
        int p = 0;
        int q = 0;
        int r = 0;
        int s = 0;
        int t = 0;
        int u = 0;
        int v = 0;
        int w = 0;
        int x = 0;
        int y = 0;
        int z = 0;


    }

    public static ArrayList calculate(File textfile) throws FileNotFoundException
    {
        Scanner scanner = new Scanner (textfile);
        String tempString = "" ;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().toLowerCase();
            for (int i = 0; i < textfile.length(); i++){
                for (line: textfile;) {

                }
            }

        }

    }



}
