import java.util.Scanner;
import java.util.Stack;

public class BottomUpParser {
    private static String[][] parsingTable = new String[12][9];
    private static String[] column = {"id","+","*","(",")","$","E","T","F"};
    private static String[] gram = {"","T+E","T","F*T","F",")E(","id"};
    private static String[] output ={"","E","E","T","T","F","F"};
    private static String input;
    private static Stack<String> InStack = new Stack<String>();
    

    public static void main(String[] args) {

        InStack.push("0");
        genPtable();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        input = scan.next();
        String action = "";
        int act;
        Integer state = 0;
        try {
            if (input.charAt(input.length()-1)!= '$') {
                System.out.println("Error");
                System.exit(0);
            }
            for (int i = 0; i < input.length(); i++) {
                String temp = "";
                temp += input.charAt(i);
                if (contains(temp)) {
                    act = action(temp);
                    action = parsingTable[state][act];
                    if (action.equals("acc")) {
                        System.out.print("Accepted");
                        break;
                    } else if (action.charAt(0) == 'r') {
                        System.out.println("Token: "+temp);
                        action = action.substring(1);
                        state = Integer.valueOf(action);
                        
                        intReduce ir = new intReduce(state, InStack, gram, output);
                        state = ir.reduce();
                        act = action(InStack.peek());
                        System.out.println("Action: r"+action);
                        state = Integer.valueOf(parsingTable[state][act]);
                        System.out.println("State: "+state);
                        InStack.push(state.toString());
                        i--;

                    } else if (action.charAt(0) == 's') {
                        
                        System.out.println("Token: "+ temp);
                        InStack.push(temp);
                        action = action.substring(1);
                        System.out.println("Action: r"+ action);
                        state = Integer.valueOf(action);
                        System.out.println("State: " + state);
                        InStack.push(state.toString());
                    }

                } else {
                    temp += input.charAt(++i);
                    if (contains(temp)) {
                        act = action(temp);
                        action = parsingTable[state][act];
                        if (action.equals("acc")) {
                            System.out.print("Accepted");
                            break;
                        } else if (action.charAt(0) == 'r') {
                           
                            System.out.println("Token: "+temp);
                            action = action.substring(1);
                            System.out.println("Action: r"+action);
                            state = Integer.valueOf(action);
                            intReduce ir = new intReduce(state, InStack, gram, output);
                            state = ir.reduce();
                            System.out.println("State: " +state);
                            act = action(InStack.peek());
                            state = Integer.valueOf(parsingTable[state][act]);
                            InStack.push(state.toString());
                            i--;

                        } else if (action.charAt(0) == 's') {
                            System.out.println("Token: "+temp);
                            InStack.push(temp);
                            action = action.substring(1);
                            System.out.println("Action: r"+action);
                            state = Integer.valueOf(action);
                            System.out.println("State: "+state);
                            InStack.push(state.toString());
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
        parsingTable[0][0] = "s5";
        parsingTable[4][0] = "s5";
        parsingTable[6][0] = "s5";
        parsingTable[7][0] = "s5";

        parsingTable[1][1] = "s6";
        parsingTable[2][1] = "r2";
        parsingTable[3][1] = "r4";
        parsingTable[5][1] = "r6";
        parsingTable[8][1] = "s6";
        parsingTable[9][1] = "r1";
        parsingTable[10][1] = "r3";
        parsingTable[11][1] = "r5";

        parsingTable[2][2] = "s7";
        parsingTable[3][2] = "r4";
        parsingTable[5][2] = "r6";
        parsingTable[9][2] = "s7";
        parsingTable[10][2] = "r3";
        parsingTable[11][2] = "r5";

        parsingTable[0][3] = "s4";
        parsingTable[4][3] = "s4";
        parsingTable[6][3] = "s4";
        parsingTable[7][3] = "s4";

        parsingTable[2][4] = "r2";
        parsingTable[3][4] = "r4";
        parsingTable[5][4] = "r6";
        parsingTable[8][4] = "s11";
        parsingTable[9][4] = "r1";
        parsingTable[10][4] = "r3";
        parsingTable[11][4] = "r3";

        parsingTable[1][5] = "acc";
        parsingTable[2][5] = "r2";
        parsingTable[3][5] = "r4";
        parsingTable[5][5] = "r6";
        parsingTable[9][5] = "r1";
        parsingTable[10][5] = "r3";
        parsingTable[11][5] = "r5";

        parsingTable[0][6] = "1";
        parsingTable[4][6] = "8";

        parsingTable[0][7] = "2";
        parsingTable[4][7] = "2";
        parsingTable[6][7] = "9";

        parsingTable[0][8] = "3";
        parsingTable[4][8] = "3";
        parsingTable[6][8] = "3";
        parsingTable[7][8] = "10";
    }
}
