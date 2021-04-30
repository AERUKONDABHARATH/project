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
public class Treatmeant {
    
    private String BookingID;
    private String patient_id;
    private String treatmeant_name;
    private Room treatmeant_room;
    private Physician phy_details;
    private String date;
    private String time;
    private  String booking_status;

    public Treatmeant(String BookingID, String patient_id, String treatmeant_name, Room treatmeant_room, Physician phy_details, String date, String time) {
        this.BookingID = BookingID;
        this.patient_id = patient_id;
        this.treatmeant_name = treatmeant_name;
        this.treatmeant_room = treatmeant_room;
        this.phy_details = phy_details;
        this.date = date;
        this.time = time;
        this.booking_status = "Not Booked";
    }

    

    public String getPatient_id() {
        return patient_id;
    }

    /*
    public Treatmeant(String BookingID, String treatmeant_name, Room treatmeant_room, Physician phy_details, String date, String time) {
    this.BookingID = BookingID;
    this.treatmeant_name = treatmeant_name;
    this.treatmeant_room = treatmeant_room;
    this.phy_details = phy_details;
    this.date = date;
    this.time = time;
    }
     */
    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }

    public String getBooking_status() {
        return booking_status;
    }

    public void setBooking_status(String booking_status) {
        this.booking_status = booking_status;
    }
    
    public String getTreatmeant_name() {
        return treatmeant_name;
    }

    public void setTreatmeant_name(String treatmeant_name) {
        this.treatmeant_name = treatmeant_name;
    }

       
    public String getBookingID() {
        return BookingID;
    }

    public void setBookingID(String patient_name) {
        this.BookingID = patient_name;
    }

    public Room getTreatmeant_room() {
        return treatmeant_room;
    }

    public void setTreatmeant_room(Room treatmeant_room) {
        this.treatmeant_room = treatmeant_room;
    }

    public Physician getPhy_details() {
        return phy_details;
    }

    public void setPhy_details(Physician phy_details) {
        this.phy_details = phy_details;
    }
 
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
}
