import java.util.*;
import java.lang.*;
import java.io.*;

public class GeomDoubleProgression extends DoubleProgression{
   protected double r;
   GeomDoubleProgression(double a, double base){
      first = a;
      r = base;
   }
   protected double nextValue(){
      cur *= r;
      if(cur<0)
         throw new Exception("Negative Value!");
      return cur;
   }

}