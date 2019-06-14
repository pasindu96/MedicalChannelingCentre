/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.medicalCentre.dao;


import lk.ijse.medicalCentre.dao.custom.impl.AppointmentDAOImpl;
import lk.ijse.medicalCentre.dao.custom.impl.DoctorDAOImpl;
import lk.ijse.medicalCentre.dao.custom.impl.DoctorSessionDAOImpl;

import lk.ijse.medicalCentre.dao.custom.impl.QueryDAOImpl;

/**
 *
 * @author pasindu
 */
public class DAOFactory {
     public enum DAOTypes{
        DOCTOR,DOCTORSESSION,QUERY,APPOINTMENT,PAYMENT,PATIENT
    }
    
    private static DAOFactory daoFactory;
    
    private DAOFactory(){
        
    }
    
    public static DAOFactory getInstance(){
        if (daoFactory == null){
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }
    
    public SuperDAO getDAO(DAOTypes daoType){
        switch(daoType){
            case DOCTOR:
                return new DoctorDAOImpl();
            case DOCTORSESSION:
                return new DoctorSessionDAOImpl();
            case APPOINTMENT:
                return new AppointmentDAOImpl();
            /*case PATIENT:
                return new PatientDAOImpl();
            case PAYMENT:
                return new ;*/
            case QUERY:
                return new QueryDAOImpl();    
            default:
                return null;
        }
    }
}
