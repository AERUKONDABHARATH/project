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
public class Physician extends Personnel{
    

    private String area_of_expertise;
    private String consultaion_hours1;
    private String consultaion_hours2;

    

    public Physician(String area_of_expertise, String consultaion_hours1, String consultaion_hours2, String ID_number, String full_name, String address, String cell_number) {
        super(ID_number, full_name, address, cell_number);
        this.area_of_expertise = area_of_expertise;
        this.consultaion_hours1 = consultaion_hours1;
        this.consultaion_hours2 = consultaion_hours2;
    }

    
    public String getConsultaion_hours1() {
        return consultaion_hours1;
    }

    public void setConsultaion_hours1(String consultaion_hours1) {
        this.consultaion_hours1 = consultaion_hours1;
    }

    public String getConsultaion_hours2() {
        return consultaion_hours2;
    }

    public void setConsultaion_hours2(String consultaion_hours2) {
        this.consultaion_hours2 = consultaion_hours2;
    }

  

    public Physician(String area_of_expertise, String consultaion_hours1, String ID_number, String full_name, String address, String cell_number) {
        super(ID_number, full_name, address, cell_number);
        this.area_of_expertise = area_of_expertise;
        this.consultaion_hours1 = consultaion_hours1;
    }

 
  
    

    public String getArea_of_expertise() {
        return area_of_expertise;
    }

    public void setArea_of_expertise(String area_of_expertise) {
        this.area_of_expertise = area_of_expertise;
    }

   
    
}