/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appregistration;

/**
 *
 * @author Student
 */
public class Messages {
    
public static void main(String[] args) {
        Scanner scannerpublic static void main(String[] args) {
 = new Scanner(System.in);

        // Step 2: Welcome message
        System.out.println("Welcome to QuickChat.");

        // Step 5: Ask how many messages user wants to send
        System.out.print("How many messages would you like to enter? ");
        int messageLimit = scanner.nextInt();
        scanner.nextLine(); // consume newline

        int messagesSent = 0;
        String[] messages = new String[messageLimit];

        // Step 3 & 4: Menu loop until quit
        boolean running = true;
        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1) Send Messages");
            System.out.println("2) Show recently sent messages");
            System.out.println("3) Quit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    if (messagesSent < messageLimit) {
                        System.out.print("Enter your message: ");
                        String msg = scanner.nextLine();
                        messages[messagesSent] = msg;
                        messagesSent++;
                        System.out.println("Message sent!");
                    } else {
                        System.out.println("You have reached your message limit.");
                    }
                    break;
                case 2:
                    System.out.println("Coming Soon.");
                    break;
                case 3:
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }
}