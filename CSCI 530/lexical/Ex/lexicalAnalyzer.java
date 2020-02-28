package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class lexicalAnalyzer {

    private static char[] ops = {'=', '(', ')', '+', '-', '*', '/', ',' ,';'};
    private static String letters = "abcdefghijklmnopqrstuvwxyz";
    private static String digits = "1234567890";
    private static String[] keyword = { "int", "double", "String"};

    public static void main(String[] args) {


        boolean found = false;
        String[] inputstr = new String[1000];
        int count = 0;
        String line = "Line ";
        Scanner scan = new Scanner(System.in);
        String file;


        //three attempts to input correct file name
        while(!found || count == 3) {
            System.out.println("Please input file name: ");
            file = scan.next();
            try (Scanner infile = new Scanner(new FileReader(file))) {
                found = true;
                for (int a = 0; infile.hasNextLine(); a++) {
                    inputstr[a] = infile.nextLine();
                }
            } catch (IOException e) {
                System.out.println("File not found");
                count++;
            }
            if (found) {

                //each string is read in by line and then seperated by whitespace
                for (int i = 0; inputstr[i] != null; i++) {
                    ArrayList<String> lineArray = new ArrayList<>();
                    String temp = "";
                    for (int j = 0; j < inputstr[i].length(); j++) {
                        if (inputstr[i].charAt(j) != ' ' && inputstr[i].charAt(j) != '\t' && inputstr[i].charAt(j) != '\n') {
                            temp += inputstr[i].charAt(j);
                        } else {
                            lineArray.add(temp);
                            temp = "";
                        }
                    }
                    if (!temp.equals(""))
                        lineArray.add(temp);

                    //After separating by white space each string is analyzed one character at a time
                    for (int s = 0, offset = 1; s < lineArray.size(); s++,offset++) {
                        String str = lineArray.get(s);

                        for (int st = 0; st < str.length(); ) {

                            //check if the str is a keyword
                            if (StringContains(keyword, str)) {
                                System.out.println("Line" + (i+1) + ": " + offset + " Keyword: " + str);
                                offset += str.length();
                                st += str.length();

                            }

                            //check if first char is a letter
                            else if (CharaterContains((letters.toCharArray()), str.charAt(st))) {
                                String sub = "";

                                while(CharaterContains(letters.toCharArray(), str.charAt(st)) ||
                                        CharaterContains(digits.toCharArray(), str.charAt(st))){
                                    sub += str.charAt(st);
                                    st++;
                                    if (!(st<str.length()))
                                        break;
                                }System.out.println("Line" + (i+1) + ": " + (offset) + " identifier: " + sub);
                                offset += sub.length();

                            }else
                                //check if it a operator
                                if (CharaterContains(ops, str.charAt(st))){
                                System.out.println("Line" + (i+1) + ": " + (offset) + " operator: " + str.charAt(st));
                                st++;
                                offset++;
                            }else
                                //if first char is a digit
                                if (CharaterContains(digits.toCharArray(),str.charAt(st))){
                                String sub = "";
                                boolean isDouble = false;
                                while(CharaterContains(digits.toCharArray(),str.charAt(st))){
                                    sub+=str.charAt(st);
                                    st++;
                                    if (str.charAt(st) == '.'){
                                        sub+=str.charAt(st);
                                        st++;
                                        isDouble = true;
                                    }
                                }if (isDouble){
                                    System.out.println("Line" + (i+1) + ": " + (offset) + " double constant: " + sub);
                                    offset += sub.length();
                                }else {
                                    System.out.println("Line" + (i + 1) + ": " + (offset) + " int constant: " + sub);
                                    offset += sub.length();
                                }
                            }else
                                //check for String constant
                                if(str.charAt(st) == '"'){
                                String sub = "";
                                sub+= str.charAt(st);
                                st++;
                                while(CharaterContains(letters.toCharArray(),str.charAt(st))){
                                    sub+=str.charAt(st);
                                    st++;
                                }if (str.charAt(st) == '"'){
                                    sub+=str.charAt(st);
                                    st++;
                                    System.out.println("Line" + (i+1) + ": " + (offset) + " String constant: " + sub);
                                    offset += sub.length();
                                }
                            }
                            //if none of the above then it's an error
                            else{
                                System.out.println("Line" + (i+1) + ": " + (offset) + " Error: " + str.charAt(st) +" Not recognized");
                                st++;
                                offset++;
                            }
                        }
                    }
                }
            }
        }
    }

    static boolean StringContains(String[] A, String str ){
        for (String st : A) {
            if (st.equals(str))
                return true;
        }
        return false;
    }

    static boolean CharaterContains(char[] C, char ch){
        for (char c : C) {
            if (c == ch)
                return true;
        }
        return false;
    }

    static int findSplit(String str, int start){
        for (int beginning = start; beginning < str.length(); start++){
            if (str.charAt(beginning) == ' ' || CharaterContains(ops,str.charAt(beginning))){
                return beginning;
            }
        }
        return str.length();
    }

    static int identifier(String str, int offset){
        for (int c = 0; c < str.length(); c++){
            if (CharaterContains(letters.toCharArray(),str.charAt(c)) ||
                    CharaterContains(digits.toCharArray(), str.charAt(c))){

            }else{
                System.out.println("Line" +offset+ ": " + (offset)+ " identifier: " + str);
                if (c != str.length()-1){
                    offset = identifier(str.substring(c,str.length()),offset);
                }
            }
        }
        return offset;
    }

    static void output(ArrayList<String> lineArray, int Offset, int S, int i){

    }
}
