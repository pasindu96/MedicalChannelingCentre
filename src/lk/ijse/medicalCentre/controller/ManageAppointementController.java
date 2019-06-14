/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.medicalCentre.controller;

import java.util.ArrayList;
import static lk.ijse.medicalCentre.controller.ManageDoctorSessionController.doctorSessionDAO;
import lk.ijse.medicalCentre.core.dto.AppointmentDTO;
import lk.ijse.medicalCentre.core.dto.DoctorSessionDTO;
import lk.ijse.medicalCentre.dao.DAOFactory;
import lk.ijse.medicalCentre.dao.custom.AppointmentDAO;
import lk.ijse.medicalCentre.dao.custom.DoctorSessionDAO;

/**
 *
 * @author pasindu
 */
public class ManageAppointementController {
    
    public static AppointmentDAO appointmentDAO = (AppointmentDAO)DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.APPOINTMENT);
    
    public static boolean addAppointement(AppointmentDTO appointment) throws  Exception  {
        boolean result = appointmentDAO.add(appointment);
        return result;
    }
    
    public static boolean deleteAppointement(AppointmentDTO appointment)throws Exception{
        boolean result = appointmentDAO.delete(appointment);
        return result;
    }
    
    public static boolean updateAppointement(AppointmentDTO appointment)throws Exception{
        boolean result = appointmentDAO.update(appointment);
        return result;
    }
    
    
    
    public static ArrayList<DoctorSessionDTO> getAllAppointement()throws Exception{
        return doctorSessionDAO.getAll();
    }

   /* public static ArrayList<DoctorSessionDTO> getSessionDates(String doctorID) {
        return doctorSessionDAO.getSessionDates(doctorID);
    }*/
}
