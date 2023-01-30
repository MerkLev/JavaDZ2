import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.Math;
import java.io.PrintWriter;

public class program {
    public static void main(String args[]) {
    int numbers [] =  new int [2];
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String line;
            while ((line = br.readLine()) != null) {
                if (line.contains("a")){
                    String Buff = line.substring(1);
                    numbers[0] =  Integer.parseInt(Buff);
                }
                if (line.contains("b")){
                    String Buff = line.substring(1);
                    numbers[1] =  Integer.parseInt(Buff);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: "+ e);
        }
        double result = Math.pow((double)numbers[0], (double)numbers[1]);
        Double res =  result;
        if (res == 0){
            System.out.println("Не определено");
        }
        try {
            File file = new File("output.txt");
            PrintWriter pw = new PrintWriter(file);
            pw.println(res);
            pw.close();
        } catch (Exception e) {
            System.out.println("Error: "+ e);
        }
        }
        }
    