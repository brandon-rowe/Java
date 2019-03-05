public class SortedList extends IntList2
{
   public SortedList(int size)
   {
      super(size);
   }
   
   public void add(int value)
   {
      if (numElements == list.length)
   	    System.out.println("Can't add, list is full");
   	else
   	    {
            int loc = 0;
            while(loc < numElements && list[loc] < value)
               loc++;
               
            for (int i = numElements; i > loc; i--)
               list[i] = list[i-1];
               
            list[loc] = value;
            
            numElements++;
          }
   }  
   
}