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
import lk.ijse.medicalCentre.dao.custom.DoctorSessionDAO;

/**
 *
 * @author pasindu
 */
public class ManageDoctorSearchController {
    public static DoctorDAO doctorDAO = (DoctorDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.DOCTOR);
    public static DoctorSessionDAO doctorSessionDAO = (DoctorSessionDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.DOCTORSESSION);
    public static ArrayList<DoctorDTO> getDoctorInfo(String speciality) throws Exception {
       ArrayList<DoctorDTO> specialList=doctorDAO.getSpecialDoctors(speciality);
       return specialList;
    }   
}
