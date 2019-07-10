//New List Test

public class ListTester
{
   public static void main(String[] args)
   {
      IntList2 myList = new IntList2(10);
      myList.add(22);
      myList.add(47);
      myList.add(13);
      myList.add(145);
      System.out.println(myList);
      
      SortedList mySList = new SortedList(10);
      mySList.add(100);
      mySList.add(50);
      mySList.add(200);
      mySList.add(25);
      System.out.println(mySList);
   }
   
}