package Recursion.Memo;

import Recursion.Fibonacci.Fibonacci;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class Memo {

    public static Function<Integer, Integer> memo(final Function<Integer, Integer> function) {
        Map<Integer, Integer> cache = new ConcurrentHashMap<>();
        return (a) -> cache.computeIfAbsent(a, function);
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci.fib(7));
        var memof = memo(Fibonacci::fib);
        memof.apply(10);
        memof.apply(10);
        System.out.println(memof.apply(10));
    }
}
