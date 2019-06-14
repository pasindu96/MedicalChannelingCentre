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
public class CustomDTO extends SuperDTO{
    private String sessionDate;

    /**
     * @return the sessionDate
     */
    public String getSessionDate() {
        return sessionDate;
    }

    /**
     * @param sessionDate the sessionDate to set
     */
    public void setSessionDate(String sessionDate) {
        this.sessionDate = sessionDate;
    }

    public CustomDTO() {
    }

    public CustomDTO(String sessionDate) {
        this.sessionDate = sessionDate;
    }
    
}
