import java.io.*;
import java.lang.*;
import java.util.*;

public class cshell
{
   public static void main(String[] args)
   {
      boolean isWindows = System.getProperty("os.name").toLowerCase().startsWith("windows");
      String homeDirectory = System.getProperty("user.home");
      Process process;
      if (isWindows) 
      {
          process = Runtime.getRuntime().exec(String.format("cmd.exe /c dir %s", homeDirectory));
      } 
      else 
      {
          process = Runtime.getRuntime().exec(String.format("sh -c ls %s", homeDirectory));
      }
      StreamGobbler streamGobbler = new StreamGobbler(process.getInputStream(), System.out::println);
      Executors.newSingleThreadExecutor().submit(streamGobbler);
      int exitCode = process.waitFor();
      assert exitCode == 0;
      
      ProcessBuilder builder = new ProcessBuilder();
      if (isWindows) 
      {
          builder.command("cmd.exe", "/c", "dir");
      } 
      else 
      {
          builder.command("sh", "-c", "ls");
      }
      builder.directory(new File(System.getProperty("user.home")));
      Process process = builder.start();
      StreamGobbler streamGobbler = new StreamGobbler(process.getInputStream(), System.out::println);
      Executors.newSingleThreadExecutor().submit(streamGobbler);
      int exitCode = process.waitFor();
      assert exitCode == 0;
   }
}
      
      
private static class StreamGobbler implements Runnable 
{
    private InputStream inputStream;
    private Consumer<String> consumer;
 
    public StreamGobbler(InputStream inputStream, Consumer<String> consumer) {
        this.inputStream = inputStream;
        this.consumer = consumer;
    }
 
    @Override
    public void run() {
        new BufferedReader(new InputStreamReader(inputStream)).lines()
          .forEach(consumer);
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