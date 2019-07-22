import java.util.*;
import java.lang.*;
import java.io.*;

public class genericGeomProgression extends genericProgression<k>{
   protected k r;
   genericGeomProgression(){
      this(1,1);
   }
   genericGeomProgression(k a, k base){
      first = a;
      r = base;
   }
   protected k nextValue(){
      cur *= r;
      if(cur<0)
         throw new IllegalArgumentException("Negative Value!");
      return cur;
   }
}
