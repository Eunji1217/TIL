package StackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class baekjoon_1874 {
    static int n;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int temp = 1;
        Stack<Integer> stack = new Stack<>();
        boolean result = true;
        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(br.readLine());
            while(temp <= num){
                stack.push(temp);
                sb.append("+\n");
                temp++;
            }
            if(stack.peek()==num){
                stack.pop();
                sb.append("-\n");
            }else {
                result = false;
                break;
            }
        }
        System.out.println(result?sb:"NO");
    }
}
