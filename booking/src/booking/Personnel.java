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
public class Personnel {
    private String ID_number;
    private String full_name;
    private String address;
    private String cell_number;

    public Personnel() {
    }

    
    
    
    public Personnel(String ID_number, String full_name, String address, String cell_number) {
        this.ID_number = ID_number;
        this.full_name = full_name;
        this.address = address;
        this.cell_number = cell_number;
    }

    
    
    public String getID_number() {
        return ID_number;
    }

    public void setID_number(String ID_number) {
        this.ID_number = ID_number;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCell_number() {
        return cell_number;
    }

    public void setCell_number(String cell_number) {
        this.cell_number = cell_number;
    }
    
    
}
