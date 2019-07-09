import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Progression {

   protected long first;
   protected long cur;
   Progression(){
      first = cur = 1; //Constructor
   }
   protected long firstValue(){
      cur = first;
      return cur;
      //reset cur
   }
   protected long nextValue(){
      //cur = cur + 1 // return cur
      return ++cur;
   }
   
   protected long void printProgression(int n)
   {
      //
   }

    
}