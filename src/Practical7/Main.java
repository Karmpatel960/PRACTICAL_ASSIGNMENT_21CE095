package Practical7;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static int readInFile(String line, File file) throws Exception{
        FileReader fr = new FileReader(file);
        Scanner br = new Scanner(fr);
        String s = null;
        int countLine = 0;
        while(br.hasNextLine()){
            s = br.nextLine();
            countLine++;
            if(line.compareToIgnoreCase(s)==0)
                return countLine;
        }
        return -1;

    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        File file = new File("src/Practical7/Nameofpeople.txt");
        String line = in.nextLine();
        System.out.println(readInFile(line, file));
    }

}
