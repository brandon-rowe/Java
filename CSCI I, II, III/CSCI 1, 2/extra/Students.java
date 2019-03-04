public class Students
{
   protected int numStudents;
   protected String name; 
  
   public Students(int numS, String nameS)
   {
      numStudents = numS;
      name = nameS;
   }
   public String retName()
   {
      return name;
   }
   
   public int retStudentNum()
   {
      return numStudents;
   }
}