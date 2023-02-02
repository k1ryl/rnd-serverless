package rnd.serverless.rsa;

import rnd.serverless.api.Calculate;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class RSA implements Calculate {

    private final int keySize;

    public RSA() {
        this.keySize = 2048;
    }

    @Override
    public void calculate() {
        try {
            KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
            generator.initialize(keySize);
            KeyPair keyPair = generator.generateKeyPair();
            System.out.println(String.format("""
                    RSA PUBLIC KEY:
                    %s
                    RSA PRIVATE KEY:
                    %s""", keyPair.getPublic().toString(), keyPair.getPrivate().toString()));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

    }

}
