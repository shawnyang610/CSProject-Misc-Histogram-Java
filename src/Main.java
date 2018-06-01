//  CS780-37 Proj1.1 Histogram
//  Shawn Yang

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main (String argv[]){
        Scanner infile=null;
        PrintWriter outfile=null;
        Histogram histogram;

        if (argv.length<2) {
            System.out.println("Not Enough arguments");
            System.exit(1);
        }
        try {
            infile = new Scanner (new FileReader(argv[0]));
            outfile = new PrintWriter(argv[1]);
        } catch (IOException e){
            System.out.println("Unable to open input / output files");
            System.exit(1);
        }

        histogram = new Histogram(infile, outfile);
        histogram.run();

        infile.close();
        outfile.close();


    }
}
