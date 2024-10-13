package btth1_java;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class bt3_1 {
    public static String getString(String s){
        return s.substring(0, s.indexOf("@"));
    }
    public static int countCharUpperCase(String s){
        int cnt = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                cnt++;
        return cnt;
    }
    public static void ioFile(){
        File f = new File("btth1_java\\data_in.txt");
        try {
            Scanner sc = new Scanner(f);
            PrintWriter pw = new PrintWriter("btth1_java\\data_out.txt");
            while (sc.hasNextLine()){
                String s = sc.nextLine();
                s = s.replace("{file}", "tập tin");
                pw.println(s);
            }
            pw.close();
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Tep tin khong mo duoc");
        }
    }
}
