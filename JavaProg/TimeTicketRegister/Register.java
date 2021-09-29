/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ubuntu
 */
public class Register {
    
    private Ticket[] tickets;
    private int numTickets;

    public Register() {
        tickets = new Ticket[10];
        numTickets = 0;
    }
    
    public void add(Ticket ticket)
    {
        tickets[numTickets] = ticket;
        //System.out.println(tickets[numTickets]);
        numTickets = numTickets + 1;
        //tickets[0] = ticket; 
        //System.out.println(numTickets);
    }
    
    public boolean constains(String ticketID)
    {
       // int counter = numTickets - 1;
        // 00001 is in tall the tickets ...check all the getID
       // System.out.println(tickets[0].getId()); 
       // System.out.println(tickets[1].getId()); 
//        System.out.println(ticketID); 
//        if (tickets[counter].getId().equals(ticketID))
//        {
//            return true;
//        }
//        else
//        {
//            return false;
//        }

        boolean foundFlag = false;
        
        System.out.println("**************************");

        for (int i = 0; i < numTickets; i++)
        {
            System.out.println("new ticket is: " +  tickets[i].getId() + " target id: " + ticketID);
            if (tickets[i].getId().equals(ticketID))
            {
                System.out.println("id is found");
                foundFlag = true;
                i = numTickets;
            }
            else
            {
                System.out.println("id is not found");
                foundFlag = false;
            }
        }
        
        return foundFlag;     
    }
    
    public Ticket retrieve(String ticketID)
    {
        System.out.println("******retrieve ticket************");
        
        int targetID = 0;
        
        for (int i = 0; i < numTickets; i++)
        {
            //System.out.println("new ticket is: " +  tickets[i].getId() + " target id: " + ticketID);
            if (tickets[i].getId().equals(ticketID))
            {
                System.out.println("id is found");
                targetID = i;
                i = numTickets;
            }
            else
            {
                System.out.println("id is not found");
            }
        }
        
        return tickets[targetID];    
    }

    @Override
    public String toString() {
        return "Register{" + "tickets=" + tickets + ", numTickets=" + numTickets + '}';
    }
    
}
