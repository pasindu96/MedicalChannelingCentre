/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.medicalCentre.controller;

import lk.ijse.medicalCentre.dao.DAOFactory;
import lk.ijse.medicalCentre.dao.custom.PatientDAO;
import lk.ijse.medicalCentre.dao.custom.PaymentDAO;

/**
 *
 * @author pasindu
 */
public class ManagePaymentController {
    public static PaymentDAO paymentDAO = (PaymentDAO)DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.PAYMENT);
    
}
