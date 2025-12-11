package LabWorks.cryptography;

public class StudentVerifier {
    private static final int N = 3233;
    private static final int E = 17;

    //Exercise 1
    public int simpleHash(String message){
        int hash = 0;
        for(int i = 0; i < message.length(); i++){
            hash = (hash + message.charAt(i)) % 1000;
        }
        return hash;
    }

    public static int modPow(int base, int exponent, int mod){

    }
}
