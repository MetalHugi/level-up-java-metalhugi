package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static boolean isPasswordComplex(String password) {

        return password.length() >= 6 
            && password.matches(".*\\d.*")
            && password.matches(".*[a-z].*")
            && password.matches(".*[A-Z].*");

/*        if (password.length() < 6) {
        return false;
       }
       boolean hasUpper = false;
       boolean hasLower = false;
       boolean hasNumber = false;

       for (int i = 0; i < password.length(); i++) {
        char currentChar = password.charAt(i);
        if(Character.isDigit(currentChar)){
            hasNumber = true;
        } else if (Character.isLowerCase(currentChar)){
            hasLower = true;
        } else if (Character.isUpperCase(currentChar)){
            hasUpper = true;
        }
       }

        return hasLower && hasUpper && hasNumber; */
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String userInput = scanner.nextLine();
        System.out.println("Is the password complex? "
                + isPasswordComplex(userInput));

        scanner.close();
    }
}
