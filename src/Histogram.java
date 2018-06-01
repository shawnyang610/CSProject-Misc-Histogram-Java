//  CS780-37 Proj1.1 Histogram
//  Shawn Yang
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Histogram {
    private int numRows;
    private int numCols;
    private int minVal;
    private int maxVal;
    private int[] hist;
    private Scanner infile;
    private PrintWriter outfile;

    Histogram(Scanner in_Infile, PrintWriter in_Outfile){
        infile = in_Infile;
        outfile= in_Outfile;
        //Step1
        try {
            numRows=infile.nextInt();
            numCols=infile.nextInt();
            minVal=infile.nextInt();
            maxVal= infile.nextInt();
        } catch (Exception e){
            System.out.println("Failed to read initialization data");
            System.exit(1);
        }
        hist = new int[maxVal-minVal+1];
        //End of step1
    }

    public void run(){
        //step2
        int valPixel;
        //step3
        while (infile.hasNext()){
            valPixel = infile.nextInt();
            hist[valPixel]++;
        }
        //end of step3
        //end of step2

        //step4 output hist
        outfile.println(numRows+" "+numCols+" "+minVal+" "+maxVal);
        for (int i=0; i<hist.length; i++){
            outfile.println(i+"  "+hist[i]);
        }
    }

}
