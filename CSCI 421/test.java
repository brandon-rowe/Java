import java.io.*;
import java.util.*;
import java.lang.*;

public class test{
    List<Integer> ls = new ArrayList<Integer>();
    public static void main(final String[] args) throws IOException
    {
        try{
            
            test t1 = new test();
            t1.ls.add(32);
            t1.ls.add(64);
            t1.ls.add(96);
            for(Integer l: t1.ls) {
                System.out.println(l);
            }
            test2 test = new test2();
            test.answer();
        }
        catch (IOException e){
            System.out.println("Please use an integer and try again.");
         }      
    }

}



