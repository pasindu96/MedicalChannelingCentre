/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ac.uok.core.dto;

/**
 *
 * @author Pasindu Wijesinghe
 */
public class DrugsDTO extends SuperDTO{
    private int drugID;
    private String drugName;

    public DrugsDTO() {
    }

    public DrugsDTO(int drugID, String drugName) {
        this.drugID = drugID;
        this.drugName = drugName;
    }

    /**
     * @return the drugID
     */
    public int getDrugID() {
        return drugID;
    }

    /**
     * @param drugID the drugID to set
     */
    public void setDrugID(int drugID) {
        this.drugID = drugID;
    }

    /**
     * @return the drugName
     */
    public String getDrugName() {
        return drugName;
    }

    /**
     * @param drugName the drugName to set
     */
    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }
    
    
}
