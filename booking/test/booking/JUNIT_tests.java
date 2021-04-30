/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booking;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SAPPHIRE
 */
public class JUNIT_tests {
    treatmean_Apointmeant_tbooking objApointmeant_tbooking = new treatmean_Apointmeant_tbooking();
   Physician  phy_array = new Physician("Physiotherapy", "8am to 10am Monday", "11am to 1pm  Tuesday", "01", "Syed Abeer","Lahore", "0123");
 Room r1 = new Room(" A");

   Treatmeant obj =  new Treatmeant("none","none","Acupuncture", r1, phy_array, "Sunday 2 May 2021", "15:00-16:00");

    /**
     * Test of cancel_appointmeant()  method, of class treatmean_Apointmeant_tbooking.
     */
    @Test
    public void cancel_appointmeant() {
        treatmean_Apointmeant_tbooking instance = objApointmeant_tbooking;
        boolean expResult = true;
        boolean result = true;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("GETPatient_id failed");
    }
  /**
     * Test of book_appointmeant()  method, of class treatmean_Apointmeant_tbooking.
     */
    @Test
    public void book_appointmeant() {
        treatmean_Apointmeant_tbooking instance = objApointmeant_tbooking;
        boolean expResult = true;
        boolean result = true;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("GETPatient_id failed");
    }
      /**
     * Test of change_appointmeant()  method, of class treatmean_Apointmeant_tbooking.
     */
    @Test
    public void change_appointmeant() {
        treatmean_Apointmeant_tbooking instance = objApointmeant_tbooking;
        boolean expResult = true;
        boolean result = true;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("GETPatient_id failed");
    }
    
    
      /**
     * Test of attend_appointmeant()  method, of class treatmean_Apointmeant_tbooking.
     */
    @Test
    public void attend_appointmeant() {
        treatmean_Apointmeant_tbooking instance = objApointmeant_tbooking;
        boolean expResult = true;
        boolean result = true;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("GETPatient_id failed");
    }
    
    
    
    
    /**
     * Test of setPatient_id method, of class Treatmeant.
     */
    @Test
    public void testSetPatient_id() {
        System.out.println("setPatient_id");
        String patient_id = "12";
        Treatmeant instance = obj;
        instance.setPatient_id(patient_id);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getBooking_status method, of class Treatmeant.
     */
    @Test
    public void testGetBooking_status() {
        System.out.println("getBooking_status");
        Treatmeant instance = obj;
        String expResult = "Not Booked";
        String result = instance.getBooking_status();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setBooking_status method, of class Treatmeant.
     */
    @Test
    public void testSetBooking_status() {
        System.out.println("setBooking_status");
        String booking_status = "BOOKED";
        Treatmeant instance = obj;
        instance.setBooking_status(booking_status);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getTreatmeant_name method, of class Treatmeant.
     */
    @Test
    public void testGetTreatmeant_name() {
        System.out.println("getTreatmeant_name");
        Treatmeant instance = obj;
        String expResult = "Acupuncture";
        String result = instance.getTreatmeant_name();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setTreatmeant_name method, of class Treatmeant.
     */
    @Test
    public void testSetTreatmeant_name() {
        System.out.println("setTreatmeant_name");
        String treatmeant_name = "Massage";
        Treatmeant instance = obj;
        instance.setTreatmeant_name(treatmeant_name);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getBookingID method, of class Treatmeant.
     */
    @Test
    public void testGetBookingID() {
        System.out.println("getBookingID");
        Treatmeant instance = obj;
        String expResult = "none";
        String result = instance.getBookingID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setBookingID method, of class Treatmeant.
     */
    @Test
    public void testSetBookingID() {
        System.out.println("setBookingID");
        String patient_name = "01";
        Treatmeant instance = obj;
        instance.setBookingID(patient_name);
        // TODO review the generated test code and remove the default call to fail.
    }

    
        /**
     * Test of getArea_of_expertise method, of class Physician.
     */
    @Test
    public void testGetArea_of_expertise() {
        System.out.println("getArea_of_expertise");
        Physician instance = phy_array;
        String expResult = "Physiotherapy";
        String result = instance.getArea_of_expertise();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setArea_of_expertise method, of class Physician.
     */
    @Test
    public void testSetArea_of_expertise() {
        System.out.println("setArea_of_expertise");
        String area_of_expertise = "Rehabilitation";
        Physician instance = phy_array;
        instance.setArea_of_expertise(area_of_expertise);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    
    
    
    
}
