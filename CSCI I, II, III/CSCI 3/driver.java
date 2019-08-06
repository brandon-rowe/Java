import java.util.PriorityQueue;

public class driver
{
   private PriorityQueue<schedule> pq = new PriorityQueue<>();
   private scheduler current = null;
   
   public void addJobs(scheduler cpujob)
   {
      this.pq.add(cpujob);
   }
   
   public void startCPU()
   {
      while (!pq.isEmpty())
      {
         presentJob = pq.remove();
         System.out.println("add " + presentJob.getName() + "with time slice "
          + presentJob.getTimeSlice() + " and priority " presentJob.getPriority());
          for (int i = 1; i < presentJob.getTimeSlice() ; i++)
            System.out.println("No no job");
      }
   }
   
   public static void main(String[] args) throw Exception
   {
      driver pqs = new driver();
      
   }

}