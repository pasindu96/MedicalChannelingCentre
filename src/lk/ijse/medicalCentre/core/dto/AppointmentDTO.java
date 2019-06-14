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
public class AppointmentDTO extends SuperDTO{
    private String appointmentID;
    private String PID ;
    private String SID ;
    private String appointmentDate ;
    private String appointmentTime ;
    private String appointmentNo ;

    public AppointmentDTO() {
    }

    public AppointmentDTO(String appointmentID, String PID, String SID, String appointmentDate, String appointmentTime, String appointmentNo) {
        this.appointmentID = appointmentID;
        this.PID = PID;
        this.SID = SID;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.appointmentNo = appointmentNo;
    }
    
    public AppointmentDTO(String appointmentID, String PID, String SID, String appointmentDate, String appointmentTime) {
        this.appointmentID = appointmentID;
        this.PID = PID;
        this.SID = SID;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        
    }
    
    /**
     * @return the appointmentID
     */
    public String getAppointmentID() {
        return appointmentID;
    }

    /**
     * @param appointmentID the appointmentID to set
     */
    public void setAppointmentID(String appointmentID) {
        this.appointmentID = appointmentID;
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
     * @return the SID
     */
    public String getSID() {
        return SID;
    }

    /**
     * @param SID the SID to set
     */
    public void setSID(String SID) {
        this.SID = SID;
    }

    /**
     * @return the appointmentDate
     */
    public String getAppointmentDate() {
        return appointmentDate;
    }

    /**
     * @param appointmentDate the appointmentDate to set
     */
    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    /**
     * @return the appointmentTime
     */
    public String getAppointmentTime() {
        return appointmentTime;
    }

    /**
     * @param appointmentTime the appointmentTime to set
     */
    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    /**
     * @return the appointmentNo
     */
    public String getAppointmentNo() {
        return appointmentNo;
    }

    /**
     * @param appointmentNo the appointmentNo to set
     */
    public void setAppointmentNo(String appointmentNo) {
        this.appointmentNo = appointmentNo;
    }
    
    
    
}
