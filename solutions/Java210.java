// 210. Java Regex

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {
    String pattern = 
        "((25[0-5]|2[0-4]\\d|1\\d{2}|0?\\d{1,2})\\.){3}" +
        "(25[0-5]|2[0-4]\\d|1\\d{2}|0?\\d{1,2})";
}