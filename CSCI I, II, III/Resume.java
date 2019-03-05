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
       return "Hello:" + name;
   }
}