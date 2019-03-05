import java.util.*;
import java.lang.*;

public class Resume
{
   private String name;
   
   public Resume(String owner)
   {
      name = owner;
   }
   public final String toString() 
   {
      String info = "Hello: " + name;
       return info;
   }
   public final String header()
   {
      String header = name + "\n" + 
   }
}