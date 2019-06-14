/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.medicalCentre.core.dto;

/**
 *
 * @author pasindu
 */
public class PatientDTO extends SuperDTO{
    private String PID;
    private String patient_name;
    private String DOB;
    private String sex;
    private String age;
    private String TelephoneNumber;

    public PatientDTO() {
    }

    public PatientDTO(String PID, String patient_name, String DOB, String sex, String age, String TelephoneNumber) {
        this.PID = PID;
        this.patient_name = patient_name;
        this.DOB = DOB;
        this.sex = sex;
        this.age = age;
        this.TelephoneNumber = TelephoneNumber;
    }

    /**
     * @return the PID
     */
    public String getPID() {
        return PID;
    }

    /**
     * @param PID the PID to set
     */
    public void setPID(String PID) {
        this.PID = PID;
    }

    /**
     * @return the patient_name
     */
    public String getPatient_name() {
        return patient_name;
    }

    /**
     * @param patient_name the patient_name to set
     */
    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    /**
     * @return the DOB
     */
    public String getDOB() {
        return DOB;
    }

    /**
     * @param DOB the DOB to set
     */
    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return the age
     */
    public String getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * @return the TelephoneNumber
     */
    public String getTelephoneNumber() {
        return TelephoneNumber;
    }

    /**
     * @param TelephoneNumber the TelephoneNumber to set
     */
    public void setTelephoneNumber(String TelephoneNumber) {
        this.TelephoneNumber = TelephoneNumber;
    }
    
    
}
