/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ubuntu
 */
public class TestProgram {
    
    public static void main(String[] args)
    {
        System.out.println("Test");
        
        Time tOne = new Time("6:50");
        System.out.println(tOne.toString());
        Ticket ticketObj = new Ticket("8005A3", tOne);
        System.out.println(ticketObj.toString());      
        Register r = new Register();
        Ticket t = new Ticket("00001", new Time("13:00"));
        String ID_one = t.getId();
        r.add(t);
        //System.out.println(r.constains(ID_one));
        t = new Ticket("00002", new Time("13:15"));
        String ID_two = t.getId();    
        r.add(t);
        System.out.println("Is ticket found: " + r.constains("00001"));
        System.out.println("Is ticket found: " + r.constains("00002"));
        System.out.println("Is ticket found: " + r.constains("00003"));
        System.out.println("Retrieve ticket: " + r.retrieve(ID_two).toString());
    }
    
}
