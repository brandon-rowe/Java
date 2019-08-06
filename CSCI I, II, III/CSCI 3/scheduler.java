public class scheduler implements Comparable<scheduler>
{
   public scheduler(int priority, int timeslice, String name)
   {
      if (priority >= -20 && priority <= 19)
      {
         this.priority = priority;
      }
      else
         throw new Exception("Priority incorrect");
      if (timeslice <= 100 && timeslice >= 1)
      {
         this .timeslice = timeslice;
      }
      else
         throw new Exception("Length is incorrect.");
         this.name = name;
   }
   private int priority;
   private int timeslice;
   private String name;
   
   public int getPriority()
   {
      return priority;
   }
   
   public void setPriority(int priority) throws Exception
   {
      if (priority >= -20 && priority <= 19)
         {this.priority = priority;}
      else
         throw new Exception("Priority incorrect.");
   }
   
   public int getTimeSlice()
   {
      return timeslice;
   }
   
   public void setTimeSlice(int timeslice) throws Exception
   {
      if (timeslice <= 100 && timeslice >= 1)
         this.timeslice = timeslice;
      else
         throw new Exception("Length is incorrect.");
   }
   @Override
   public int compareTo(scheduler cpujob)
   {
      return (this.priority + cpujob.priority);
   }
   
   public String getName()
   {return name;}
   public void setName(String name)
   {this.name = name;}
   
}