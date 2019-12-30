package com.shivanshu.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class PostFixInFixPreFixCalculator {
    public static void main(String[] args) {
        String expPost = "20 50 3 6 + * * 300 / 2 -";
        System.out.println("Postfix Expression: " + expPost);
        System.out.println("Evaluation: " + convertPostFix(expPost));


        String expPre = "- / * 20 * 50 + 3 6 300 2";
        System.out.println("Prefix Expression: " + expPre);
        System.out.println("Evaluation: " + convertPreFix(expPre));

        String infix = "2 * (5 *(3+6))/15-2";
        System.out.println("Infix Expression: " + infix);
        System.out.println(convertInFix(infix));
    }

    private static String convertInFix(String infix) {

        List<String> operatorsList = Arrays.asList("*", "+", "-", "/");
        Stack<Double> numbers = new Stack<>();
        Stack<String> operator = new Stack<>();

        char[] charArr = infix.toCharArray();

        for (int i = 0; i < charArr.length ; i++){
            char currentChar = charArr[i];
            if(Character.isDigit(currentChar)){
                int currentNumber = 0;

                while (Character.isDigit(charArr[i])){
                    currentNumber = currentNumber*10+currentChar-'0';
                    i++;
                    if(i < charArr.length)
                        currentChar = charArr[i];
                    else
                        break;
                }
                i--;
                numbers.push((double)currentNumber);
            }else if (String.valueOf(currentChar).equals("(")){
                operator.add("(");
            }else if (operatorsList.contains(String.valueOf(currentChar))){
                while(!operator.isEmpty() && precedence(String.valueOf(currentChar)) < precedence(operator.peek())){
                    calculateAndPushinFix(numbers,operator.pop());
                }
                operator.push(String.valueOf(currentChar));
            }else {
                if (currentChar != ' ') {
                    if (currentChar == ')') {
                        while(!operator.peek().equals("(")){
                            calculateAndPushinFix(numbers,operator.pop());
                        }

                        }
                        operator.pop();

                    }
                }
            }

        while(!operator.isEmpty()){
            if(operator.contains("/")){
                calculateAndPushinFix(numbers,"/");
            }else if(operator.contains("*")){
                calculateAndPushinFix(numbers,"*");
            } else if(operator.contains("+")){
                calculateAndPushinFix(numbers,"+");
            }else {
                calculateAndPushinFix(numbers,"-");
            }
            operator.pop();
        }

        return String.valueOf(numbers.peek());
    }

    static int precedence(String c){
        switch (c){
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
            case "^":
                return 3;
        }
        return -1;
    }

    private static String convertPreFix(String exp) {


        List<String> operators = Arrays.asList("*", "+", "-", "/");
        String[] strings = exp.split(" ");
        Stack<Double> stack = new Stack<>();
        for(int i = strings.length-1; i>=0 ; i--){
            if(operators.contains(strings[i])){
                if(stack.size()<2){
                    throw new RuntimeException("Wrong postfix expression");
                }
                calculateAndPushPreFix(stack,strings[i]);
                continue;
            }
            stack.push(Double.valueOf(strings[i]));

        }

        if(stack.size()>1) throw new RuntimeException("Wrong Expression");
        return String.valueOf(stack.peek());
    }

    private static String convertPostFix(String exp) {
        List<String> operators = Arrays.asList("*", "+", "-", "/");
        String[] strings = exp.split(" ");
        Stack<Double> stack = new Stack<>();
        for(String str: strings){
            if(operators.contains(str)){
                if(stack.size()<2){
                    throw new RuntimeException("Wrong postfix expression");
                }
                calculateAndPushPostFix(stack,str);
                continue;
            }
            stack.push(Double.valueOf(str));

        }

        if(stack.size()>1) throw new RuntimeException("Wrong Expression");
        return String.valueOf(stack.peek());
    }

    private static void calculateAndPushPostFix(Stack<Double> stack, String str) {
        double first = stack.pop();
        double second = stack.pop();

        switch (str){
            case "*":
                stack.push(first*second);
                break;
            case "+":
                stack.push(first+second);
                break;
            case "-":
                stack.push(second-first);
                break;
            case "/":
                if(first == 0) throw new RuntimeException("Divison by Zero");
                stack.push(second/first);
                break;

        }

    }

    private static void calculateAndPushinFix(Stack<Double> stack, String str) {
        double first = stack.pop();
        double second = stack.pop();

        switch (str){
            case "*":
                stack.push(first*second);
                break;
            case "+":
                stack.push(first+second);
                break;
            case "-":
                stack.push(second-first);
                break;
            case "/":
                if(first == 0) throw new RuntimeException("Divison by Zero");
                stack.push(second/first);
                break;

        }

    }

    private static void calculateAndPushPreFix(Stack<Double> stack, String str) {
        double first = stack.pop();
        double second = stack.pop();

        switch (str){
            case "*":
                stack.push(first*second);
                break;
            case "+":
                stack.push(first+second);
                break;
            case "-":
                stack.push(first-second);
                break;
            case "/":
                if(first == 0) throw new RuntimeException("Divison by Zero");
                stack.push(first/second);
                break;

        }

    }
}