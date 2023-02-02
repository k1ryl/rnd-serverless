package rnd.serverless;

import rnd.serverless.api.Calculate;

import java.util.ServiceLoader;

public class Handler {
    public static void main(String[] args) {
        ServiceLoader<Calculate> services = ServiceLoader.load(Calculate.class);
        services.forEach(Calculate::calculate);
    }
}