/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booking;

/**
 *
 * @author SAPPHIRE
 */
public class Room {
    

    private String room_name;

    public Room( String room_name) {
       
        this.room_name = room_name;
    }

    
    
    public String getroom_name() {
        return room_name;
    }

    public void setroom_name(String room_name) {
        this.room_name = room_name;
    }
    
}
