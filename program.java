import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.Math;
import java.io.PrintWriter;

public class program {
    public static void main(String args[]) {
    int numbers [] =  new int [2];
        String a = "a";
        String b = "b";
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String line;
            while ((line = br.readLine()) != null) {
                if (line.contains("a")){
                    char Buff = line.charAt(1);
                    numbers[0] =  Character.digit(Buff, 10);
                }
                if (line.contains(b)){
                    char Buff = line.charAt(1);
                    numbers[1] =  Character.digit(Buff, 10);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: "+ e);
        }
        double result = Math.pow((double)numbers[0], (double)numbers[1]);
        int res = (int) result;
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
    