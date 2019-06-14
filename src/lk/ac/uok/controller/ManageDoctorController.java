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

    public static ArrayList<DoctorDTO> getAllDoctorID() throws Exception {
        return doctorDAO.getAll();
    }

    
    
    
}
