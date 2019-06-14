/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.medicalCentre.controller;

import lk.ijse.medicalCentre.dao.DAOFactory;
import lk.ijse.medicalCentre.dao.custom.DoctorSessionDAO;
import lk.ijse.medicalCentre.dao.custom.PatientDAO;

/**
 *
 * @author pasindu
 */
public class ManagePatientController {
     public static PatientDAO patientDAO = (PatientDAO)DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.PATIENT);
    
}
