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
public class Patient extends Personnel{

    
    
    private  String null_patient = "none";

    public String getNull_patient() {
        return null_patient;
    }

    public void setNull_patient(String null_patient) {
        this.null_patient = null_patient;
    }
    
 
    
   /* 
    private Treatmeant patient_Treatmeant;

    public Treatmeant getPatient_Treatmeant() {
        return patient_Treatmeant;
    }

    public void setPatient_Treatmeant(Treatmeant patient_Treatmeant) {
        this.patient_Treatmeant = patient_Treatmeant;
    }

  
    public Patient(Treatmeant patient_Treatmeant, String ID_number, String full_name, String address, String cell_number) {
        super(ID_number, full_name, address, cell_number);
        this.patient_Treatmeant = patient_Treatmeant;
    }
    
    
  */  
    public Patient() {
    }
 
    public Patient(String ID_number, String full_name, String address, String cell_number) {
        super(ID_number, full_name, address, cell_number);
    }
    
  
  
    
}
