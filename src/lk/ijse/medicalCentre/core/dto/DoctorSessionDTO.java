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
public class DoctorSessionDTO extends SuperDTO{
    private String SID;
    private String doctorID;
    private String sessiondate;
    private String Maximum_patients;
    private String starttime;
    private String endtime;

    public DoctorSessionDTO() {
    }

    public DoctorSessionDTO(String SID, String doctorID, String sessiondate, String Maximum_patients, String starttime, String endtime) {
        this.SID = SID;
        this.doctorID = doctorID;
        this.sessiondate = sessiondate;
        this.Maximum_patients = Maximum_patients;
        this.starttime = starttime;
        this.endtime = endtime;
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
     * @return the sessiondate
     */
    public String getSessiondate() {
        return sessiondate;
    }

    /**
     * @param sessiondate the sessiondate to set
     */
    public void setSessiondate(String sessiondate) {
        this.sessiondate = sessiondate;
    }

    /**
     * @return the Maximum_patients
     */
    public String getMaximum_patients() {
        return Maximum_patients;
    }

    /**
     * @param Maximum_patients the Maximum_patients to set
     */
    public void setMaximum_patients(String Maximum_patients) {
        this.Maximum_patients = Maximum_patients;
    }

    /**
     * @return the starttime
     */
    public String getStarttime() {
        return starttime;
    }

    /**
     * @param starttime the starttime to set
     */
    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    /**
     * @return the endtime
     */
    public String getEndtime() {
        return endtime;
    }

    /**
     * @param endtime the endtime to set
     */
    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }
    
    
}
