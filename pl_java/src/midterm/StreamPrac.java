package midterm;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPrac {
    public static void main(String[] args) {
        Scanner scv = new Scanner(System.in);
        int input = scv.nextInt();
        /*

        // imperative factorial
        int result = 1;
        for(int i=j; i>0; i--)
        result = result * i;
        System.out.println("Factorial Number : " + result);

        // functional (Old School) factorial
        System.out.println("Factorial Number : " + factorial(j));

        */

        // intstream factorial
        int fact = IntStream.range(1, input + 1)
                .reduce(1, (a, b) -> {return a*b;});
        System.out.println(fact);


        // Biginteger stream factorial
        BigInteger res = Stream.iterate(BigInteger.ONE, a -> a.add(BigInteger.ONE))
                .limit(input)
                .reduce(BigInteger.ONE, (a, b) -> a.multiply(b));
        System.out.println(res);



        // stream fibonacci
        Stream.iterate(new int[] {1, 1}, p -> new int[] {p[1], p[0] + p[1]})
                .limit(input)
                .forEach(p -> System.out.print(p[0] + " "));

        System.out.println();

        //BigInteger stream fibonacci
        Stream.iterate(new BigInteger[] {BigInteger.ONE, BigInteger.ONE}, p -> new BigInteger[]{p[1], p[0].add(p[1])})
                .limit(input)
                .forEach(p -> System.out.print(p[0] + " "));


    }
}
