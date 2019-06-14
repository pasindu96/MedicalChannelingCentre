/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ac.uok.controller;

import lk.ac.uok.dao.DAOFactory;
import lk.ac.uok.dao.custom.PatientDAO;
import lk.ac.uok.dao.custom.PaymentDAO;

/**
 *
 * @author pasindu
 */
public class ManagePaymentController {
    public static PaymentDAO paymentDAO = (PaymentDAO)DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.PAYMENT);
    
}
