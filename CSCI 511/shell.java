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
            		System.out.print("shell>");
            		commandLine = console.readLine();

            		//no input
            		if (commandLine.equals(""))
            		continue;

            		//history
            		if(commandLine.equals('*'))
            		{
              			//new class HistoryStringArray();
             			// {
               			//  history[4] = history[3]
                		//  history[3] = history[2]
                		//  history[2] = history[1]
                		//  history[1] = history[0]
                		//  history[0] = commandLine
                		}

            		//help
            		if (commandLine.equals("help"))
            		{
               			System.out.println();
                		System.out.println();
                		System.out.println("Welcome to the shell");
                		System.out.println("Written by: Lucky Rowe");
                		System.out.println("CSCI 511   -  Dr. Majundur");
                		System.out.println("--------------------");
                		System.out.println();
                		System.out.println("Commands to use:");
                		System.out.println("1) cat prog.java");
                		System.out.println("2) exit");
                		System.out.println("3) clear");
                		System.out.println();
                		System.out.println();
                		System.out.println("---------------------");
                		System.out.println();
            		}

            		if (commandLine.equals("clear"))
            		{

               			for (int ctr = 0; ctr < 10; ctr++)
               			{
                  			System.out.println();
               			}
            		}

            		if (commandLine.endsWith(".java"))
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

            		if (commandLine.equals("exit"))
            		{
                		System.out.println("...Terminating the Virtual Machine");
                		System.out.println("...Done");
                		System.out.println("Please Close manually with Options > Close");
                		System.exit(0);
            		}
        	}
    	}
}