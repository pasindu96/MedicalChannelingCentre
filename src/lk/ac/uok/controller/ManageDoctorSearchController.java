/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ac.uok.controller;

import java.util.ArrayList;
import lk.ac.uok.core.dto.DoctorDTO;
import lk.ac.uok.dao.DAOFactory;
import lk.ac.uok.dao.custom.DoctorDAO;
import lk.ac.uok.dao.custom.DoctorSessionDAO;

/**
 *
 * @author pasindu
 */
public class ManageDoctorSearchController {
    public static DoctorDAO doctorDAO = (DoctorDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.DOCTOR);
    //public static DoctorSessionDAO doctorSessionDAO = (DoctorSessionDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.DOCTORSESSION);
    public static ArrayList<DoctorDTO> getDoctorInfo(String speciality) throws Exception {
       ArrayList<DoctorDTO> specialList=doctorDAO.getSpecialDoctors(speciality);
       return specialList;
    }

    public static ArrayList<DoctorDTO> getDoctorSpeciality(String doctorID) throws Exception {
       
       ArrayList<DoctorDTO> specialList=doctorDAO.getSpecialities(doctorID);
       return specialList;
    }    //To change body of generated methods, choose Tools | Templates.
    
    
    
}
