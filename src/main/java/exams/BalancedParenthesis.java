package exams;

import java.util.Stack;

public class BalancedParenthesis {

    // Verify balanced brackets into a string chain.
    // e.g. "(AA,{22,[23],XX})"  is valid!
    // e.g. "(Aa,{}[ddd[]})" is invalid


    private static final char B_OPEN = '[';
    private static final char B_CLOSE = ']';
    private static final char P_OPEN = '(';
    private static final char P_CLOSE = ')';
    private static final char CB_OPEN = '{';
    private static final char CB_CLOSE = '}';

    private static Stack<Character> stack;

    public BalancedParenthesis() {
    }

    public boolean isBalancedString(String inputString){

        stack = new Stack<>();

        for(int i=0; i < inputString.length(); i++){
            char cChart = inputString.charAt(i);
            if (B_OPEN == cChart || P_OPEN == cChart || CB_OPEN == cChart){
                stack.push(cChart);
            }

            if (B_CLOSE == cChart || P_CLOSE == cChart || CB_CLOSE == cChart){

                if (!isMatchingPair(stack.pop(), inputString.charAt(i))){
                    return false;
                }
            }
        }

        if (stack.empty()){
            return true;
        } else {
            return false;
        }
    }

    private boolean isMatchingPair(char charA, char charB){

        if (charA == B_OPEN && charB == B_CLOSE) {
            return true;
        } else if (charA == P_OPEN && charB == P_CLOSE) {
            return true;
        } else if (charA == CB_OPEN && charB == CB_CLOSE) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        BalancedParenthesis balancedParenthesis = new BalancedParenthesis();
        String input = "{sdsd}[{}]({)";
        System.out.println("Is Balanced?: " + balancedParenthesis.isBalancedString(input));

    }


}
