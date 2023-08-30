package com.zcedu.test;

public class ArrayLearn {
    public ArrayLearn() {
    }

    public static void main(String[] args) {
        char[] character = new char[26];

        for (int i = 0; i < 26; ++i) {
            character[i] = (char) (65 + i);
            System.out.println(character[i]);
        }

        System.out.println(character.length);
    }
}
