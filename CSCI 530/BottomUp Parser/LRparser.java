import java.util.Scanner;
import java.util.Stack;

public class LRparser {

    private static String[][] pTable = new String[12][9];
    private static String[] column = { "id", "+", "*", "(", ")", "$", "E", "T", "F"};
    private static String[] grammar = {"", "T+E", "T", "F*T", "F", ")E(", "id"};
    private static String[] output ={"", "E", "E", "T", "T", "F", "F"};
    private static String input;
    private static Stack<String> InStack = new Stack<String>();
    

    public static void main(String[] args) {

        InStack.push("0");
        genPtable();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence:");
        input = scan.next();
        String action = "";
        int act;
        Integer state = 0;
        System.out.println("\t\tToken\t\tInput\t\t\tAction\tState");
        try 
        {
            if (input.charAt(input.length()-1)!= '$') 
            {
                System.out.println("Error");
                System.exit(0);
            }
            
            for (int i = 0; i < input.length(); i++) 
            {
                String token = "";
                token += input.charAt(i);
                
                if (contains(token)) 
                {
                    act = action(token);
                    action = pTable[state][act];
                    
                    if (action.equals("acc")) 
                    {
                        System.out.print("\t\tAccepted");
                        break;
                    } 
                    else if (action.charAt(0) == 'r') 
                    {
                        System.out.print("\t\t" + token);
                        action = action.substring(1);
                        
                        state = Integer.valueOf(action);
                        intReduce ir = new intReduce(state, InStack, grammar, output);
                        state = ir.reduce();
                        System.out.print("\t\t\t"+input);
                        
                        act = action(InStack.peek());
                        System.out.print("\tr" + action);
                        
                        state = Integer.valueOf(pTable[state][act]);
                        System.out.print("\t\t\t" + state);
                        InStack.push(state.toString());
                        System.out.println();
                        
                        i--;

                    } 
                    else if (action.charAt(0) == 's') 
                    {
                        
                        System.out.print("\t\t"+ token);
                        InStack.push(token);
                        System.out.print("\t\t\t"+input);
                        
                        action = action.substring(1);
                        System.out.print("\tr"+ action);
                        
                        state = Integer.valueOf(action);
                        System.out.print("\t\t\t" + state);
                        InStack.push(state.toString());
                        System.out.println();
                    }

                } 
                else 
                {
                    token += input.charAt(++i);
                    
                    if (contains(token)) 
                    {
                        act = action(token);
                        action = pTable[state][act];
                        
                        if (action.equals("acc")) 
                        {
                            System.out.print("\t\tAccepted");
                            break;
                        } 
                        else if (action.charAt(0) == 'r') 
                        {
                           
                            System.out.print("\t\t" + token);
                            System.out.print("\t\t\t"+input);
                            
                            action = action.substring(1);
                            System.out.print("\tr" + action);
                            
                            state = Integer.valueOf(action);
                            intReduce ir = new intReduce(state, InStack, grammar, output);
                            state = ir.reduce();
                            System.out.print("\t\t\t" + state);
                            
                            act = action(InStack.peek());
                            state = Integer.valueOf(pTable[state][act]);
                            InStack.push(state.toString());
                            System.out.println();
                            
                            i--;

                        } else if (action.charAt(0) == 's') {
                            System.out.print("\t\t" + token);
                            InStack.push(token);
                           System.out.print("\t\t\t"+input);
                            action = action.substring(1);
                            System.out.print("\tr" + action);
                            state = Integer.valueOf(action);
                            System.out.print("\t\t\t"+state);
                            InStack.push(state.toString());
                            System.out.println();
                        }

                    } else {
                        System.out.println("Error");
                        break;
                    }
                }
            }
        }catch (Exception e){
            System.out.println("Error");
        }

    }

    static boolean contains(String str){
        for (String a : column){
            if (a.equals(str))
                return true;
        }
        return false;
    }

    static int action(String str){
        for (int i = 0; i < column.length; i++){
            if (column[i].equals(str))
                return i;
        }
        return -1;
    }



    static void genPtable(){
        pTable[0][0] = "s5";
        pTable[4][0] = "s5";
        pTable[6][0] = "s5";
        pTable[7][0] = "s5";

        pTable[1][1] = "s6";
        pTable[2][1] = "r2";
        pTable[3][1] = "r4";
        pTable[5][1] = "r6";
        pTable[8][1] = "s6";
        pTable[9][1] = "r1";
        pTable[10][1] = "r3";
        pTable[11][1] = "r5";

        pTable[2][2] = "s7";
        pTable[3][2] = "r4";
        pTable[5][2] = "r6";
        pTable[9][2] = "s7";
        pTable[10][2] = "r3";
        pTable[11][2] = "r5";

        pTable[0][3] = "s4";
        pTable[4][3] = "s4";
        pTable[6][3] = "s4";
        pTable[7][3] = "s4";

        pTable[2][4] = "r2";
        pTable[3][4] = "r4";
        pTable[5][4] = "r6";
        pTable[8][4] = "s11";
        pTable[9][4] = "r1";
        pTable[10][4] = "r3";
        pTable[11][4] = "r3";

        pTable[1][5] = "acc";
        pTable[2][5] = "r2";
        pTable[3][5] = "r4";
        pTable[5][5] = "r6";
        pTable[9][5] = "r1";
        pTable[10][5] = "r3";
        pTable[11][5] = "r5";

        pTable[0][6] = "1";
        pTable[4][6] = "8";

        pTable[0][7] = "2";
        pTable[4][7] = "2";
        pTable[6][7] = "9";

        pTable[0][8] = "3";
        pTable[4][8] = "3";
        pTable[6][8] = "3";
        pTable[7][8] = "10";
    }
}



/*

        String Out = "";
        for(Object o : InStack)
            Out += o.toString();
        System.out.println(Out);
*/