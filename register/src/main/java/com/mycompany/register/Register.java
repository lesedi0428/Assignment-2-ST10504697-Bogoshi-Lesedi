/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.register;
/**
 *
 * @author lesed
 */

import java.util.Scanner;

public class Register {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Login userLogin = new Login();

        System.out.println("=== USER REGISTRATION ===");
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Username: ");
        String username = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        System.out.print("Enter Cell Phone Number (+27...): ");
        String cellPhone = scanner.nextLine();

        // Run registration logic
        String result = userLogin.registerUser(username, password, cellPhone, firstName, lastName);
        System.out.println("\n" + result);

        // Check if registration succeeded before offering login
        if (result.contains("successfully captured")) {
            
            System.out.println("\n=== USER LOGIN ===");
            System.out.print("Enter Username: ");
            String loginUser = scanner.nextLine();

            System.out.print("Enter Password: ");
            String loginPass = scanner.nextLine();

            boolean loginResult = userLogin.loginUser(loginUser, loginPass);
            System.out.println(userLogin.returnLoginStatus(loginResult));
            
             // Continue only if login is successful
            if (loginResult) {

                boolean running = true;

                while (running) {

                    System.out.println("\n=== QUICKCHAT ===");
                    System.out.println("1. Send Messages");
                    System.out.println("2. Show Recently Sent Messages");
                    System.out.println("3. Quit");
                    System.out.print("Choose an option: ");

                    String option = scanner.nextLine();

                    switch (option) {

                        case "1":

                            System.out.print(
                                "How many messages would you like to send? "
                            );

                            int total;

                            try {
                                total = Integer.parseInt(
                                    scanner.nextLine()
                                );
                            } catch (NumberFormatException e) {
                                System.out.println(
                                    "Please enter a valid number."
                                );
                                break;
                            }

                            if (total <= 0) {
                                System.out.println(
                                    "Please enter a number greater than zero."
                                );
                                break;
                            }

                            for (int i = 1; i <= total; i++) {

                                System.out.println(
                                    "\n===== MESSAGE " + i + " ====="
                                );

                                System.out.print(
                                    "Enter recipient number: "
                                );
                                String recipient = scanner.nextLine();

                                if (!recipient.startsWith("+27")
                                    || recipient.length() != 12
                                    || !recipient.substring(1)
                                        .matches("[0-9]+")) {

                                    System.out.println(
                                        "Invalid phone number. "
                                        + "Use +27 followed by 9 digits."
                                    );

                                    i--;
                                    continue;
                                }

                                System.out.print("Enter message: ");
                                String messageText = scanner.nextLine();

                                if (messageText.length() > 250) {
                                    System.out.println(
                                        "Message must not exceed "
                                        + "250 characters."
                                    );

                                    i--;
                                    continue;
                                }

                                if (messageText.trim().isEmpty()) {
                                    System.out.println(
                                        "Message cannot be empty."
                                    );

                                    i--;
                                    continue;
                                }

                                message msg = new message(
                                    i, recipient, messageText
                                );

                                System.out.println(
                                    "Message ID successfully created: "
                                    + msg.getMessageID()
                                );

                                System.out.println(
                                    "Message Hash: "
                                    + msg.getMessageHash()
                                );

                                System.out.println(
                                    msg.checkRecipientCell()
                                );

                                // Choose send, disregard or store
                                System.out.println(msg.sentMessage());

                                System.out.println(msg.printMessages());
                            }

                            System.out.println(
                                "Total messages sent: "
                                + message.returnTotalMessages()
                            );

                            break;

                        case "2":

                            System.out.println("coming soon");
                                   
 
                            break;

                        case "3":

                            System.out.println("Goodbye!");
                            System.exit(0);
                            running = false;
                            break;

                        default:

                            System.out.println(
                                "(wrong input entered please");
                            
                    }
                }
            }

        } else {
            System.out.println(
                "Registration failed. Please restart and enter valid details."
            );
        }

        scanner.close();
    }
}
            
    