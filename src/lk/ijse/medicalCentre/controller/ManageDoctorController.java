/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.medicalCentre.controller;

import java.util.ArrayList;
import lk.ijse.medicalCentre.core.dto.DoctorDTO;
import lk.ijse.medicalCentre.dao.DAOFactory;
import lk.ijse.medicalCentre.dao.custom.DoctorDAO;

/**
 *
 * @author pasindu
 */
public class ManageDoctorController {
     public static DoctorDAO doctorDAO = (DoctorDAO)DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.DOCTOR);
    
    public static boolean addDoctor(DoctorDTO doctor) throws  Exception  {
        boolean result = doctorDAO.add(doctor);
        return result;
    }
    
    public static boolean deleteDoctor(DoctorDTO doctor)throws Exception{
        boolean result = doctorDAO.delete(doctor);
        return result;
    }
    
    public static boolean updateDoctor(DoctorDTO doctor)throws Exception{
        boolean result = doctorDAO.update(doctor);
        return result;
    }
    
    public static DoctorDTO searchDoctor(DoctorDTO doctor) throws Exception{
        DoctorDTO searchedDoctor = doctorDAO.search(doctor);
        return searchedDoctor;
    }
    
    public static ArrayList<DoctorDTO> getAllDoctors()throws Exception{
        return doctorDAO.getAll();
    }

    
    
    
}
