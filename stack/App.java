package com.company;

public class App {

    public static void main(String[] args) {
        Stack theStack = new Stack(3);

        System.out.println(reverseString("HELLO"));


    }

    public static String reverseString(String str){
        int stackSize = str.length();
        Stack theStack = new Stack(stackSize);
        for (int j = 0; j < str.length(); j++){
            char ch = str.charAt(j);
            theStack.push(ch);
        }
        String result = "";
        while(!theStack.isEmpty()){
            char ch = theStack.pop();
            result = result+ch;
        }
        return result;
    }
}
