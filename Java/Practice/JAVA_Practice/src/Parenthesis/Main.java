package Parenthesis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 괄호 짝 맞추기
// 괄호들이 올바른 순서와 짝을 이루고 있는지 확인하는 프로그램
public class Main {
    static String input;
    static boolean isCorrectParenthesis(String input){
        Stack<Character> stack = new Stack<>();
        for(char ch : input.toCharArray()){
            if(ch == '('){
                stack.push(ch);
            }else if(ch==')'){
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input = br.readLine();
        System.out.println(isCorrectParenthesis(input));
    }
}
