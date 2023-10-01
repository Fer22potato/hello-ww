/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validatepassword;

/* Name: Fernanda Arroyo
Date: 6/27/2023
Section: CS 232-001
Assignment: Ch 7 Programming Exercises, Ex 7-4
Due Date: 6/27/2023
About this project: Write code that promts the user for a password 
that contains at least 2 uppercase letters, at least three lowercase
letters, and at least one digit. Continue to repromt the user 
until a valid password is entered.
Assumptions: it is able to take input continuous until all requirements are met.
All work below was performed by Fernanda Arroyo */

import java.util.*;
public class ValidatePassword {
    public static void main(String[] args) {
        // Write your code here
        Scanner word = new Scanner(System.in);
        String password;
        boolean valid = false;
        
        System.out.println("Please enter a password that contains at least: 2 uppercase letters,"
                    + " 3 lowercase letters, and 1 digit.");
        while(!valid){
            System.out.println("Enter password: ");
            password = word.nextLine();
            int upperCase = 0;
            int lowerCase = 0;
            int digitCount = 0;
            for (int i = 0; i < password.length(); i++){
                char ch = password.charAt(i);
                if (Character.isUpperCase(ch)){
                    upperCase++;
                }
                else if (Character.isLowerCase(ch)){
                    lowerCase++;
                }
                else if (Character.isDigit(ch)){
                    digitCount++;
                }
            }
            
            if (upperCase >=2 && lowerCase >= 3 && digitCount >=1){
                valid = true;
            }
            else if (upperCase < 2 && lowerCase < 3 && digitCount <1){
                System.out.println("Needs 2 or more uppercase letters.");
                System.out.println("Needs 3 or more lowercase letters.");
                System.out.println("Needs 1 or more digits.");
            }
            else if (upperCase < 2 && lowerCase < 3){
                System.out.println("Needs 2 or more uppercase letters.");
                System.out.println("Needs 3 or more lowercase letters.");
            }
            else if (lowerCase < 3 && digitCount <1){
                System.out.println("Needs 3 or more lowercase letters.");
                System.out.println("Needs 1 or more digits.");
            }
            else if (upperCase < 2 && digitCount <1){
                System.out.println("Needs 2 or more uppercase letters.");
                System.out.println("Needs 1 or more digits.");
            }
            else if (upperCase < 2){
                System.out.println("Needs 2 or more uppercase letters.");
            }
            else if (lowerCase < 3){
                System.out.println("Needs 3 or more lowercase letters.");
            }
            else if (digitCount < 1){
                System.out.println("Needs 1 or more digits.");
            }
        }
        System.out.println("Password accepted.");
    }
}
