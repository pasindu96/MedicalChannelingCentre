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
public class PaymentDTO extends SuperDTO{
    private String paymentID;
    private String appointmentID;
    private String paymentTime;
    private String paymentStatus;

    public PaymentDTO() {
    }

    public PaymentDTO(String paymentID, String appointmentID, String paymentTime, String paymentStatus) {
        this.paymentID = paymentID;
        this.appointmentID = appointmentID;
        this.paymentTime = paymentTime;
        this.paymentStatus = paymentStatus;
    }

    /**
     * @return the paymentID
     */
    public String getPaymentID() {
        return paymentID;
    }

    /**
     * @param paymentID the paymentID to set
     */
    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
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
     * @return the paymentTime
     */
    public String getPaymentTime() {
        return paymentTime;
    }

    /**
     * @param paymentTime the paymentTime to set
     */
    public void setPaymentTime(String paymentTime) {
        this.paymentTime = paymentTime;
    }

    /**
     * @return the paymentStatus
     */
    public String getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * @param paymentStatus the paymentStatus to set
     */
    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
    
}
