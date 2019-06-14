/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ac.uok.controller;

import lk.ac.uok.core.dto.PatientDTO;
import lk.ac.uok.dao.DAOFactory;
import lk.ac.uok.dao.custom.DoctorSessionDAO;
import lk.ac.uok.dao.custom.PatientDAO;

/**
 *
 * @author pasindu
 */
public class ManagePatientController {
     public static PatientDAO patientDAO = (PatientDAO)DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.PATIENT);
        public static boolean addPatient(PatientDTO pdto) throws  Exception  {
        boolean result = patientDAO.add(pdto);
        return result;
    }
}
