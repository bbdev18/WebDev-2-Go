/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ubuntu
 */
public class Ticket {
    
    private String id;
    private Time issueTime;

    public Ticket(String id, Time issueTime) {
        this.id = id;
        this.issueTime = issueTime;
    }    

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Ticket{" + "id=" + id + ", issueTime=" + issueTime + '}';
    }
    
    

}
