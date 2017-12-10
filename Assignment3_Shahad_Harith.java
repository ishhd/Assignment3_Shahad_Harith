
//Shahad Harith - 1707861
//COCS202-CA1

package assignment3_shahad_harith;
import java.util.Scanner;
public class Assignment3_Shahad_Harith {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("--------------------------------------------------------------------");
        System.out.println("              Welcome to Ticket buying System");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("       Press A or a for Airplane");
        System.out.println("       Press T or t for Train");
        System.out.print("Enter the choice: ");
        char choice1 = input.next().charAt(0);
        String transportation="";
        double priceAdult = 1;
        double priceChild = 1;
        switch (choice1){
            case 'a' : 
            case 'A' : transportation = "AIRPLANE"; priceAdult=150; priceChild=75; break;
            case 'T' : 
            case 't' : transportation = "TRAIN"; priceAdult=50; priceChild=(priceAdult*0.15); break;
            default : System.out.println("      Wrong Selection of Transportation Type!");
                        System.exit(1);
        }
        System.out.println("       Press 1 for Makkah");
        System.out.println("       Press 2 for Al-Madina");
        System.out.print("Enter the Choice: ");
        int choice2 = input.nextInt();
        String city="";
        switch (choice2){
            case 1: city = "Makkah"; break;
            case 2: city ="Al-Madinah";
                if(choice1=='a'||choice1=='A'){
                        priceAdult=200; priceChild=100;}
                else{
                        priceAdult=70; priceChild=(priceAdult*0.15);} break;
            default :System.out.println("      Wrong Selection of Destination!");
                System.exit(1);
        }
        System.out.print("       Enter number of adults: ");
            int adult = input.nextInt();
            
                if(adult<0){
                    System.out.println("      Number should be >=0 !");
                    System.exit(1);
                }
        System.out.print("       Enter number of Children: ");
        int child = input.nextInt();
                if ( child <0){
                    System.out.println("      Number should be >=0 !");
                    System.exit(1);
                }
        
        Scanner scan = new Scanner(System.in);            
        System.out.print("       Enter the name (first and last): ");
        String name = scan.nextLine();
        System.out.print("       Enter Your Identity or Passport Number: ");
        int ID = input.nextInt();
        System.out.print("       Enter Your Contact Number: ");
        String contactNumber = scan.nextLine();
        System.out.println(" ");
        System.out.println("                     *** Thank you for Buying Ticket ***");
        System.out.println(" ");
        System.out.println("            -------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("               Informatoin Details of Applying for Ticket");
        System.out.println(" ");
        System.out.println("            -------------------------------------------------------------");
        System.out.println("==========================================================================================================");
        System.out.println("Name\t\t:"+name+"\t\t\tIdentity Number\t\t:"+ID);
        System.out.println("Contact Number  :"+contactNumber+"\t\t\tTransportation Type\t:"+transportation);
        System.out.println("Departure City  :JEDDAH\t\t\t\tArrival City\t\t:"+city);
        
        double ticketAdult=adult*priceAdult;
        double ticketChild=child*priceChild;
        
        System.out.println("# Children:"+child+"\t\tTicket Fare : "+ticketChild);
        System.out.println("# Adults: "+adult+"\t\tTicket Fare : "+ticketAdult);
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("#Passengers: "+(child+adult)+"\t\tTotal Ticket Fare:"+(ticketChild+ticketAdult));
        System.out.println("==========================================================================================================");
                
                
                
                
                
                
                
            }
        }
    
    
    

