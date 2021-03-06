import java.io.*;
import java.lang.*;
import java.util.*;

public class lexical2 
{

   
   public String Type = "";
   StringBuilder Token = new StringBuilder();

   public static void main(String[] args) throws IOException 
   {
      //Start a new scanner to accept input file name
      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter file name with extension: ");
      String file = scan.nextLine();
      scan.close();
      //Start new scan to read in input.file
      try
      {
            Scanner sc = new Scanner(new File(file));
            lexical lex = new lexical();
            lex.Processor(sc);     
      }
      catch (FileNotFoundException e)
      { 
         throw new FileNotFoundException(("File not found"));  
      }
   }
   
   
   public void Processor(Scanner scan)
   {
       int lineNum = 0;
       Scanner sc = scan;
       if (sc.hasNextLine())
       {
            lineNum++;
            String line = sc.nextLine();
            // loop through line
            
            for (int i = 0; i < line.length(); i++) 
            {
                // check if character is a digit
                boolean isNum = Character.isDigit(line.charAt(i));
                boolean isLet = Character.isAlphabetic(line.charAt(i));
                if (line.charAt(i) == ' ') 
                {
                    continue;
                } 
                else if (isNum) 
                {
                  checkNum(isNum)
                }                   } 
                else if (isLet) 
                {
                    boolean keyword = false;
                    //check first if the following characters spell a keyword
                    Token.delete(0, Token.length());
                    
                    if (i + 4 < line.length()) 
                    {
                        if (line.substring(i, i + 4).equals("int ")) 
                        {
                            Type = "keyword";
                            Token.append("int");
                            printToken(lineNum, i, Type, Token);
                            i = i + 3;
                            keyword = true;
                                                    }
                    }
                    
                    if (i + 7 < line.length()) 
                    {
                        if (line.substring(i, i + 7).equals("double ")) 
                        {
                            Type = "keyword";
                            Token.append("double");
                            printToken(lineNum, i, Type, Token);
                            i = i + 6;
                            keyword = true;
                        } 
                        else if (line.substring(i, i + 7).equals("String ")) 
                        {
                            Type = "keyword";
                            Token.append("string");
                            printToken(lineNum, i, Type, Token);
                            i = i + 6;
                            keyword = true;
                        }
                    }
                    
                    if (!keyword) 
                    {
                        for (int j = i; j < line.length(); j++) 
                        {
                            boolean isLetter = Character.isAlphabetic(line.charAt(j));
                            if (isLetter) {
                                Token.append(line.charAt(j));
                            } 
                            else 
                            {
                                Type = "identifier";
                                printToken(lineNum, i, Type, Token);
                                i = j-1;
                                break;
                            }
                        }
                    }
                } 
                else if (line.charAt(i) == '=' || line.charAt(i) == '(' || line.charAt(i) == ')' || line.charAt(i) == '+' || line.charAt(i) == '-' || line.charAt(i) == '*' || line.charAt(i) == '/' || line.charAt(i) == ',' || line.charAt(i) == ';') 
                {
                    Type = "operator";
                    Token.delete(0, Token.length());
                    Token.append(line.charAt(i));
                    printToken(lineNum, i, Type, Token);
                } 
                else if (line.charAt(i) == '\"')
                {
                    Token.delete(0, Token.length());
                    Type = "string constant";
                    Token.append(line.charAt(i));
                    for (int j = i+1; j < line.length(); j++){
                        if (line.charAt(j) != '\"')
                        {
                            Token.append(line.charAt(j));
                        } 
                        else 
                        {
                            Token.append(line.charAt(j));
                            printToken(lineNum, i, Type, Token);
                            i = j;
                            break;
                        }
                    }
                } 
                else 
                {
                    Token.delete(0, Token.length());
                    Token.append(line.charAt(i)).append(" not recognized");
                    Type = "error";
                    printToken(lineNum, i, Type, Token);
                }
            }
       }
   }

   public void checkNum()
   {
       // begin parsing digits in sequence
       Token.delete(0, Token.length());
       for (int j = i; j < line.length(); j++) 
       {
            // check for decimal; if decimal present, type is double.
                        // add first digit of number to a string
                        boolean isAnum = Character.isDigit(line.charAt(j));
                        if (line.charAt(j) == '.') 
                        {
                            Token.append(line.charAt(j));
                            Type = "double constant";
                        }
                        // decimal not present, see if constant continues
                        else if (isAnum && Type.equals("double constant")) 
                        {
                            Token.append(line.charAt(j));
                        } 
                        else if (isAnum) 
                        {
                            Token.append(line.charAt(j));
                            Type = "int constant";
                        } 
                        else 
                        {
                           // constant has ended
                            printToken(lineNum, i, Type, Token);
                            i = j - 1; // move index i to index j to continue parsing line without retreading ground
                           break;
              }
           }


   }
   // l = line; i = index, s = string, t = type
   public static void printToken(int l, int i, String s, StringBuilder t) 
   {
        i = i + 1;
        System.out.println("Line " + l + ": " + i + " " + " " + s + ": " + t.toString());
   }
}





//Ignore everything below. Early attempt. Didn't want to delete the code.

         
   //Process each line into characters
/*   public static String ProcessStr(String str) {
      String line = str;
      String read = "";
      boolean operator = false;
      for (int i = 0; i<line.length(); i++){
         char tmp = line.charAt(i);
         operator = isOperator(tmp);
         if (operator = true)
            processInput(read);
         else
            read += tmp;
      }   
      return line;
   }
   
   //Determine if the character is an operator
   public static boolean isOperator(char c) {
      char in = c;
   //   String str = "()+-*///,;=";
   /* boolean out = false;
      for (int i=0; i<str.length(); i++)
         {
            if (in == str.charAt(i))
               {
                  System.out.println(in);
                  out = true;
               } 
          }      
      return out;
   }
   
   public static String processInput(String s) {
      String input = s;
      String str = "";
      System.out.println("Processing String");
      System.out.println(input);
      //boolean out = false;
      /*for (int i=0; i<str.length(); i++)
         {
            if (in == str.charAt(i))
               {
                  System.out.println(in);
                  out = true;
               } 
          }  */    
   //   return input;
   //}