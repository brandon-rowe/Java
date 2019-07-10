//********************************************************************
//  Author:Brandon Rowe
//  SumOfSin.java
//  Calculates the Sum of Sin
//********************************************************************

import java.io.*;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class SumOfSin{

    // Methods
    public static void main (String[] args)
    {
       double f = 1.00;
       double t = 0;
       
       double[] tarray = new double[201];
       double[] y1array = new double[201];
       double[] y2array = new double[201];
       double[] y3array = new double[201];
       double[] s1array = new double[201];
       double[] s2array = new double[201];
       double[] sqwarray = new double[201];
       
    
        for (int i=0; i < 201; i++)
        {
            
            y1array[i] = (4/Math.PI) * (Math.sin(2 * Math.PI *1*f*t));

            y2array[i] = (4/3 * Math.PI) * (Math.sin(2 * Math.PI *3*f*t));

            y3array[i] = (4/5 * Math.PI) * (Math.sin(2 * Math.PI *5*f*t));

            s1array[i] = y2array[i] + y1array[i];

            s2array[i] = s1array[i] + y3array[i];

            sqwarray[i] = Math.signum(Math.sin(2 * Math.PI *f*t));

            tarray[i] = t;
            
            t += 0.01;
            
        }
        
        
        //Print Each Array to List
        //Print Y1 vals
        System.out.println("\n");
        System.out.println("Y1");
        
        for (int i=0; i < 201; i++)
        {
          System.out.println(y1array[i]);
        }
        
        //Print Y2 vals
        System.out.println("\n");        
        System.out.println("Y2");
        
        for (int i=0; i < 201; i++)
        {
          System.out.println(y2array[i]);
        }
        
        //Print Y3 vals
        System.out.println("\n");
        System.out.println("Y3");
        
        for (int i=0; i < 201; i++)
        {
          System.out.println(y3array[i]);
        }
        
        //Print S1 vals
        System.out.println("\n");
        System.out.println("S1");
        
        for (int i=0; i < 201; i++)
        {
          System.out.println(s1array[i]);
        }
        
        //Print s2 vals
        System.out.println("\n");
        System.out.println("s2");
        
        for (int i=0; i < 201; i++)
        {
          System.out.println(s2array[i]);
        }
        
        //Print SqWave Vals
        System.out.println("\n");
        System.out.println("SqWave");
        
        for (int i=0; i < 201; i++)
        {
          System.out.println(sqwarray[i]);
        }
        
        //Print T for Time
        System.out.println("\n");
        System.out.println("T");
        
        for (int i=0; i < 201; i++)
        {
          System.out.println(tarray[i]);
        }
        
   }
}


           /* System.out.println(t);
            System.out.println(", ");
            System.out.println(y1);
            System.out.println(y2);
            System.out.println(y3);
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(sqwave);
            System.out.println("\n");*/
            