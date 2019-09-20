import java.io.*;

public class shell
{    

   public static void main(String[] args) throws java.io.IOException 
	{

        	String commandLine;
        	BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

         while (true) 
		   {
            		System.out.print("browe shell>");
            		commandLine = console.readLine();

            		if (commandLine.equals(""))
            		continue;

            		if (commandLine.equals("help"))
            		{
                		System.out.println();
                		System.out.println("Welcome to the shell");
                		System.out.println("Written by: B Rowe");
                		System.out.println("CSCI 511 - Dr. Majundur");
                		System.out.println();
                		System.out.println("Commands:");
                		System.out.println("1) clear");
                		System.out.println("2) exit");
                		System.out.println("3) help");
                		System.out.println();
            		}

            		if (commandLine.equals("clear"))
            		{
               			for (int c=0; c<50; c++)
               			{
                  			System.out.println();
               			}
            		}

            		if (commandLine.equals("exit"))
            		{
                		System.exit(0);
            		}
			
        	}
    	}
}


			