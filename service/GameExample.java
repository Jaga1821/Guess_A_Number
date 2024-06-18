package com.project.service;

import org.springframework.stereotype.Service;

@Service
public class GameExample {
    
    private int SecretNum;
    private int remainingNum;
    
    public void restart() {
        SecretNum = (int) (Math.random() * 10) + 1;
        remainingNum = 3;
    }
    
    public String Guess(int num) {
        if (remainingNum <= 0) {
            return "Sorry, you have used all your attempts. The secret number was " + SecretNum + ".";
        } else if (num == SecretNum) {
            return "Congratulations! You guessed the secret number in " + (4 - remainingNum) + " attempts!";
        } else if (num < SecretNum) {
            remainingNum--;
            if (remainingNum == 0) {
                return "Sorry, you have used all your attempts. The secret number was " + SecretNum + ".";
            }
            return "The secret number is higher than " + num + ". You have " + remainingNum + " attempts left.";
        } else {
            remainingNum--;
            if (remainingNum == 0) {
                return "Sorry, you have used all your attempts. The secret number was " + SecretNum + ".";
            }
            return "The secret number is lower than " + num + ". You have " + remainingNum + " attempts left.";
        }
    }
}
