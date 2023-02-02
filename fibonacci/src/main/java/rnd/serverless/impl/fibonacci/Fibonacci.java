package rnd.serverless.impl.fibonacci;

import rnd.serverless.api.Calculate;

import java.math.BigInteger;

public class Fibonacci implements Calculate {
    private final int n;

    public Fibonacci() {
        this.n = 100;
    }

    @Override
    public void calculate() {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        for (int i = 0; i < n; i++) {
            BigInteger c = a.add(b);
            a = b;
            b = c;
        }
        System.out.println(String.format("FIBONACCI: %s", a));
    }
}
