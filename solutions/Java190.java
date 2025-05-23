// 190. Java Primality Test

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        BigInteger n = new BigInteger(bufferedReader.readLine());
        
        if (n.isProbablePrime(1)) {
            System.out.println("prime");
        } else {
        System.out.println("not prime");
        }
        
        bufferedReader.close();
    }
}