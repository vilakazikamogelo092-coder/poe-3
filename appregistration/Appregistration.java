/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.appregistration;

/**
 *
 * @author Student
 */
public class Appregistration {

    public static void main(String[] args) {
      
          
      }
    Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter your username");
        String username = new scanner();
                
        System.out.print("Enter your password");
        String password = new scanner();
                
        System.out.print("Enter your cellphone number");
        String cellphone number  = new scanner();      
                
         boolean loginStatus = login.loginUser(Username,Password,CellphoneNumber);       
       if(loginStatus){
        
             System.out.println("Welcome to quick chat");
             System.out.println("option1) Send messages");   
             System.out.println("option2) Recently send messages - coming soon"); 
             System.out.println("option 3)quits");
        
             int controllerv = input.nextInt();
        
             switch (controllerv) {
        
                 case 1: 
                     System.out.print( "How many messages would you like to send? ")
                       break;
                 
                 case  2:
                        break;
        
                 case 3:
                       System.exit(0);
                      break;
                      
                 default : 
                     
                     
                     System.out.println("wrong input entered please,please enter a valid input");
        
                        case 2:

                        System.out.println("""

                                        STORED MESSAGE MENU

                                        a) Display Sender & Recipient
                                        b) Display Longest Message
                                        c) Search Message ID
                                        d) Search Recipient
                                        e) Delete Message Using Hash
                                        f) Full Report
                                        """);

                        System.out.print("Select option: ");
                        
                            MessageReport MessageReport = new MessageReport();
                            
                        String reportChoice = input.nextLine().toLowerCase();

                                switch(reportChoice) {

                                    case "a":
                                        MessageReport.displaySenderRecipient();
                                        break;

                                    case "b":
                                        MessageReport.displayLongestMessage();
                                        break;

                                    case "c":
                                        System.out.print("Enter Message ID: ");
                                        String id = input.nextLine();
                                        MessageReport.searchMessageID(id);
                                        break;

                                    case "d":
                                        System.out.print("Enter Recipient: ");
                                        String recipientSearch =input.nextLine();
                                        MessageReport.searchRecipient(recipientSearch);
                                        break;

                                    case "e":
                                        System.out.print( "Enter Message Hash: ");
                                        String hash =input.nextLine();
                                        MessageReport.deleteMessage(hash);
                                        break;

                                    case "f":
                                        MessageReport.displayReport();
                                        break;

                                    default:
                                        System.out.println("Invalid selection.");
                                }

                        break;
  }

 }
}

