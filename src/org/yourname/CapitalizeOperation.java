package org.yourname;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CapitalizeOperation {

	public static void main(String[] args) throws IOException {
        File file1 = new File("Input.txt");
        FileReader input = new FileReader(file1);
        File file2 = new File("Output.txt"); 
        //char CharCounter = 0;       
        BufferedReader in = new BufferedReader(input);
        PrintWriter out = (new PrintWriter(new FileWriter(file2)));
        int ch;
        while ((ch = in.read()) != -1){
            if (Character.isUpperCase(ch)){
                Character.toLowerCase(ch);

            }
            out.write(ch);
        }
        in.close();
        out.close();
    }       
}
