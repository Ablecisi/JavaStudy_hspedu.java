package com.zcedu.bignum_;

import java.math.BigInteger;

public class BigNumAction {
    public static void main(String[] args) {
        action();
    }
    public static void action(){
        BigInteger bigInteger = new BigInteger("12345678999999999999999999999");
        BigInteger bigInteger2 = new BigInteger("12345678999999999999999");
        BigInteger add = bigInteger.add(bigInteger2);
        System.out.println(add);
        
    }
}
