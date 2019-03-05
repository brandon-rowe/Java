public class Teachers
{
   private int age;
   private String name;
   private int _class;
   
   public Teachers(int Tage, String Tname, int ClassNum)
   {
      age = Tage;
      name = Tname;
      _class = ClassNum;
   }
   
   public int retAge()
   {
      return age;
   }
   
   public String retName()
   {
      return name;
   }
   
   public int retClassNum()
   {
      return _class;
   }
}