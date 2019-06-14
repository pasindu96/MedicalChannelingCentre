/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ac.uok.core.dto;

import java.util.ArrayList;

/**
 *
 * @author pasindu
 */
public class DoctorDTO extends SuperDTO{
    
    private String doctorID;
    private String name;
    private String medRegNo;
    private String speciallity;
    private String hospital_name;
    private String telephone_No;

    public DoctorDTO() {
    }

    public DoctorDTO(String doctorID, String name, String medRegNo, String speciallity, String hospital_name, String telephone_No) {
        this.doctorID = doctorID;
        this.name = name;
        this.medRegNo = medRegNo;
        this.speciallity = speciallity;
        this.hospital_name = hospital_name;
        this.telephone_No = telephone_No;
    }
    
    /*public ArrayList viewTable(String doctorID, String name,String speciallity, String hospital_name ){
        ArrayList<Customer> customerList=CustomerController.getAllCustomers();
					for(Customer c1 : customerList){
						Object[] rowData={c1.getId(),c1.getName(),c1.getAddress(),c1.getSalary()};
						dtm.addRow(rowData);
					}
        
    }*/
    /**
     * @return the doctorID
     */
    public String getDoctorID() {
        return doctorID;
    }

    /**
     * @param doctorID the doctorID to set
     */
    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the medRegNo
     */
    public String getMedRegNo() {
        return medRegNo;
    }

    /**
     * @param medRegNo the medRegNo to set
     */
    public void setMedRegNo(String medRegNo) {
        this.medRegNo = medRegNo;
    }

    /**
     * @return the speciallity
     */
    public String getSpeciallity() {
        return speciallity;
    }

    /**
     * @param speciallity the speciallity to set
     */
    public void setSpeciallity(String speciallity) {
        this.speciallity = speciallity;
    }

    /**
     * @return the hospital_name
     */
    public String getHospital_name() {
        return hospital_name;
    }

    /**
     * @param hospital_name the hospital_name to set
     */
    public void setHospital_name(String hospital_name) {
        this.hospital_name = hospital_name;
    }

    /**
     * @return the telephone_No
     */
    public String getTelephone_No() {
        return telephone_No;
    }

    /**
     * @param telephone_No the telephone_No to set
     */
    public void setTelephone_No(String telephone_No) {
        this.telephone_No = telephone_No;
    }
    
    
}
