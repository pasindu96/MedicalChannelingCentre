/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.medicalCentre.controller;

import java.util.ArrayList;
import lk.ijse.medicalCentre.core.dto.DoctorDTO;
import lk.ijse.medicalCentre.core.dto.DoctorSessionDTO;
import lk.ijse.medicalCentre.dao.DAOFactory;
import lk.ijse.medicalCentre.dao.custom.DoctorDAO;
import lk.ijse.medicalCentre.dao.custom.DoctorSessionDAO;

/**
 *
 * @author pasindu
 */
public class ManageDoctorSessionController {
    public static DoctorSessionDAO doctorSessionDAO = (DoctorSessionDAO)DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.DOCTORSESSION);
    
    public static boolean addDoctorSession(DoctorSessionDTO doctor) throws  Exception  {
        boolean result = doctorSessionDAO.add(doctor);
        return result;
    }
    
    public static boolean deleteDoctorSession(DoctorSessionDTO doctor)throws Exception{
        boolean result = doctorSessionDAO.delete(doctor);
        return result;
    }
    
    public static boolean updateDoctorSession(DoctorSessionDTO doctor)throws Exception{
        boolean result = doctorSessionDAO.update(doctor);
        return result;
    }
    
    public static DoctorSessionDTO searchDoctorSession(DoctorSessionDTO doctor) throws Exception{
        DoctorSessionDTO searchedDoctor = doctorSessionDAO.search(doctor);
        return searchedDoctor;
    }
    
    public static ArrayList<DoctorSessionDTO> getAllDoctorsSession()throws Exception{
        return doctorSessionDAO.getAll();
    }
}
