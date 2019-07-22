import java.util.*;
import java.lang.*;
import java.io.*;

public class genericGeomProgression extends genericProgression<K>{
   protected K r;
   genericGeomProgression(){
      this(1,1);
   }
   genericGeomProgression(K a, K base){
      first = a;
      r = base;
   }
   protected K nextValue(){
      cur *= r;
      if(cur<0)
         throw new IllegalArgumentException("Negative Value!");
      return cur;
   }
}
