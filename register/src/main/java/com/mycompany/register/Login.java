/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.register;

/**
 *
 * @author lesed
 */
public class Login {
    

    // Variables to store user registration details
    private String username;
    private String password;
    private String cellPhoneNumber;
    private String firstName;
    private String lastName;

    // 1. Check Username
    public boolean checkUserName(String username) {
        if (username.contains("_") && username.length() <= 5) {
            return true;
        } else {
            return false;
        }
    }

    // 2. Check Password Complexity
    public boolean checkPasswordComplexity(String password) {
        // First check length rule
        if (password.length() < 8) {
            return false;
        } 
        
            // Check for capital letter
            boolean hasCapital = false;
            if (password.equals(password.toLowerCase()) == false) {
                hasCapital = true;
            } 
                
            // Check for number
            boolean hasDigit = false;
            if (password.matches(".*[0-9].*")) {
                hasDigit = true;
            } 
               

            // Check for special character
            boolean hasSpecial = false;
            if (password.matches(".*[^a-zA-Z0-9]*.")) {
                hasSpecial = true;
           
            }

            // Verify all three conditions passed
            if (hasCapital == true && hasDigit == true && hasSpecial == true) {
                return true;
            } else {
                return false;
            }
    }
            
            
    // 3. Check Cell Phone Number
    public boolean checkCellPhoneNumber(String cellPhoneNumber) {
        if (cellPhoneNumber.startsWith("+27") && cellPhoneNumber.length() == 12) {
            return true;
        } else {
            return false;
        }
    }

    // 4. Register User
    public String registerUser(String username, String password, String cellPhoneNumber, String firstName, String lastName) {
        if (checkUserName(username) == false) {
            return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
        } else if (checkPasswordComplexity(password) == false) {
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        } else if (checkCellPhoneNumber(cellPhoneNumber) == false) {
            return "Cell number is incorrectly formatted or does not contain an international code; please correct the number and try again.";
        } else {
            // Save details if all validations pass
            this.username = username;
            this.password = password;
            this.cellPhoneNumber = cellPhoneNumber;
            this.firstName = firstName;
            this.lastName = lastName;

            return "Username successfully captured.\nPassword successfully captured.\nCell number successfully captured.";
        }
    }

    // 5. Login User
    public boolean loginUser(String enteredUsername, String enteredPassword) {
        if (enteredUsername.equals(this.username) && enteredPassword.equals(this.password)) {
            return true;
        } else {
            return false;
        }
    }

    // 6. Return Login Status
    public String returnLoginStatus(boolean isLoggedIn) {
        if (isLoggedIn == true) {
            return "Welcome " + firstName + " " + lastName + " it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
}