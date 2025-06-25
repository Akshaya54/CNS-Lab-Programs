## Diffie Hellman

import java.math.BigInteger;
import java.security.SecureRandom;
public class DiffieHellman {
    public static void main(String[] args) {
        int bitLength = 512;  
        SecureRandom rand = new SecureRandom();
        BigInteger p = BigInteger.probablePrime(bitLength, rand); // large prime
        BigInteger g = BigInteger.probablePrime(bitLength / 2, rand); // prim
        BigInteger xa = new BigInteger(bitLength - 2, rand); // private key A
        BigInteger xb = new BigInteger(bitLength - 2, rand); // private key B
        BigInteger Ya = g.modPow(xa, p); // public key A
        BigInteger Yb = g.modPow(xb, p); // public key B
        System.out.println("Public key is: " + Ya);
        System.out.println("Public key is: " + Yb);
    }
}

## output:
Public key is: 384972283623648371538551802068689582154400852547194866094454103357453736153656965524652358131680070836970017241844384159566532098732417828358802025024968
Public key is: 256291758999225928492700675288678958888893845666108509582675792513669384991865238806437767516668419736649920268033430030008138900913713753307619341586200

