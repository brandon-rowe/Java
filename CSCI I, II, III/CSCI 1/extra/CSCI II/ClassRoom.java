// Testing Classes

public class ClassRoom
{
   public static void main(String[] args)
   {
      Students test = new Students(47, "Brandon");
      System.out.println(test.retName());
      System.out.println(test.retStudentNum());
      
      Teachers teach = new Teachers(47, "Ashley", 4);
      System.out.println(teach.retName());
      System.out.println(teach.retAge());
      System.out.println(teach.retClassNum());
   }
}


