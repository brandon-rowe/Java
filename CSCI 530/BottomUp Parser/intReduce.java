import java.io.*;
import java.lang.*;
import java.util.*;

public class intReduce{
      int state;
      Stack<String> Input;
      String[] gram;
      String[] output;

   public intReduce(int state, Stack<String> Input, String[] gram, String[] output){
      this.state = state;
      this.Input = Input;
      this.gram = gram;
      this.output = output;
      
   }

    public Integer reduce() {
        Integer prevState;
        try {
            switch (state) {
                case 0:
                    System.out.print("Error");
                    break;
                case 1:
                    try {
                        String tmp = "";
                        while (!Input.empty() && !tmp.equals(gram[state])) {
                            Input.pop();
                            tmp += Input.pop();
                        }
                        prevState = Character.getNumericValue(Input.peek().charAt(0));
                        Input.push(output[state]);
                        return prevState;
                    } catch (NullPointerException e) {
                        System.out.print("Error");
                    }
                    break;
                case 2:
                    try {
                        String tmp = "";
                        while (!Input.empty() && !tmp.equals(gram[state])) {
                            Input.pop();
                            tmp += Input.pop();
                        }
                        prevState = Character.getNumericValue(Input.peek().charAt(0));
                        Input.push(output[state]);
                        return prevState;
                    } catch (NullPointerException e) {
                        System.out.print("Error");
                    }
                    break;
                case 3:
                    try {
                        String tmp = "";
                        while (!Input.empty() && !tmp.equals(gram[state])) {
                            Input.pop();
                            tmp += Input.pop();
                        }
                        prevState = Character.getNumericValue(Input.peek().charAt(0));
                        Input.push(output[state]);
                        return prevState;
                    } catch (NullPointerException e) {
                        System.out.print("Error");
                    }
                    break;
                case 4:
                    try {
                        String tmp = "";
                        while (!Input.empty() && !tmp.equals(gram[state])) {
                            Input.pop();
                            tmp += Input.pop();
                        }
                        prevState = Character.getNumericValue(Input.peek().charAt(0));
                        Input.push(output[state]);
                        return prevState;
                    } catch (NullPointerException e) {
                        System.out.print("Error");
                    }
                    break;
                case 5:
                    try {
                        String tmp = "";
                        while (!Input.empty() && !tmp.equals(gram[state])) {
                            Input.pop();
                            tmp += Input.pop();
                        }
                        prevState = Character.getNumericValue(Input.peek().charAt(0));
                        Input.push(output[state]);
                        return prevState;
                    } catch (NullPointerException e) {
                        System.out.print("Error");
                    }
                    break;
                case 6:
                    try {
                        String tmp = "";
                        while (!Input.empty() && !tmp.equals(gram[state])) {
                            Input.pop();
                            tmp += Input.pop();
                        }
                        prevState = Character.getNumericValue(Input.peek().charAt(0));
                        Input.push(output[state]);
                        return prevState;
                    } catch (NullPointerException e) {
                        System.out.print("Error");
                    }
                    break;
            }
            return -1;
        }catch (Exception e){
            System.out.print("Error");
        }
        return -1;
    }
}