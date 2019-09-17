import java.io.*;

public class shell
{

    public class JavaStringHistory
    {
            private String[] history = new String[4];
    }

    	public static void main(String[] args) throws java.io.IOException 
	{

        	String commandLine;
        	BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

            	while (true) 
		{
            		//read the command
            		System.out.print("browe shell>");
            		commandLine = console.readLine();

            		//no input
            		if (commandLine.equals(""))
            		continue;

            		//help
            		if (commandLine.equals("help"))
            		{
               			System.out.println();
                		System.out.println();
                		System.out.println("Welcome to the shell");
                		System.out.println("Written by: Lucky Rowe");
                		System.out.println("CSCI 511 - Dr. Majundur");
                		System.out.println();
                		System.out.println("Commands to use:");
                		System.out.println("1) cat prog.java");
                		System.out.println("2) exit");
                		System.out.println("3) clear");
                		System.out.println();
                		System.out.println();
            		}

            		if (commandLine.equals("clear"))
            		{
               			for (int c=0; c<100; c++)
               			{
                  			System.out.println();
               			}
            		}

            		if (commandLine.equals("exit"))
            		{
                		System.exit(0);
            		}
			else
			{
				System.out.println("Incorrect Command");
			}
        	}
    	}
}


			/*if (commandLine.endsWith(".java"))
            		{
              			if(commandLine.startsWith("cat"))
              			{
                			System.out.println("test");
                			ProcessBuilder pb = new ProcessBuilder();
                			//pb = new ProcessBuilder(commandLine);
              			}
              			else
              			{
                  			System.out.println("Incorrect Command");
              			}
            		}
			//history
            		//if(commandLine.equals('*'))
            		//{
              			//new class HistoryStringArray();
             			// {
               			//  history[4] = history[3]
                		//  history[3] = history[2]
                		//  history[2] = history[1]
                		//  history[1] = history[0]
                		//  history[0] = commandLine
                		//}*/