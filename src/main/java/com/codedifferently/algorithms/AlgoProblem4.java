package com.codedifferently.algorithms;

public class AlgoProblem4 {



    public String encrypt(String message, int shift) {
        char[] shiftLetters = message.toCharArray();

        for (int index = 0; index < shiftLetters.length; index++) {
            char letter = shiftLetters[index];
            letter = (char) (letter + shift);
            shiftLetters[index] = letter;
        }

            return new String(shiftLetters);

        }

    }
