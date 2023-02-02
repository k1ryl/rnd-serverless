package rnd.serverless.impl.factorial;


import rnd.serverless.api.Calculate;

import java.math.BigInteger;

public class Factorial implements Calculate {
    private final int n;

    public Factorial() {
        this.n = 100;
    }

    @Override
    public void calculate() {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(String.format("FACTORIAL: %s", result));
    }
}
