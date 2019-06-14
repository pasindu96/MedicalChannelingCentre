/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.medicalCentre.dao.custom.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.medicalCentre.core.dto.CustomDTO;
import lk.ijse.medicalCentre.core.dto.DoctorDTO;
import lk.ijse.medicalCentre.core.dto.DoctorSessionDTO;
import lk.ijse.medicalCentre.dao.custom.DoctorDAO;
import lk.ijse.medicalCentre.dao.custom.DoctorSessionDAO;
import lk.ijse.medicalCentre.dao.db.DBConnection;

/**
 *
 * @author pasindu
 */
public class DoctorSessionDAOImpl implements DoctorSessionDAO{

    @Override
    public boolean add(DoctorSessionDTO docSession) throws Exception {
     Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO session VALUES (?,?,?,?,?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
        
        pstm.setObject(1, docSession.getSID());
        pstm.setObject(2, docSession.getDoctorID());
        pstm.setObject(3, docSession.getSessiondate());
        pstm.setObject(4, docSession.getMaximum_patients());
        pstm.setObject(5, docSession.getStarttime());
        pstm.setObject(6, docSession.getEndtime());
        
        
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);   
    }

    @Override
    public boolean update(DoctorSessionDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(DoctorSessionDTO session) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM Session WHERE SID = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, session.getSID());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public DoctorSessionDTO search(DoctorSessionDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<DoctorSessionDTO> getAll() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Session";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<DoctorSessionDTO> allDoctors = null;

        while (rst.next()) {
            if (allDoctors == null) {
                allDoctors = new ArrayList<>();
            }

            allDoctors.add(new DoctorSessionDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6)
            ));

        }
        return allDoctors;     
    }

    @Override
    public ArrayList<DoctorSessionDTO> getSpecialDoctors(String speciality) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CustomDTO getAllInformation(String doctorID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<DoctorSessionDTO> getSessionDates(String doctorID) {
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            String sql = "select * from session where doctorID='"+doctorID+"'";
            Statement stm = connection.createStatement();
            ResultSet rst = stm.executeQuery(sql);
            
            ArrayList<DoctorSessionDTO> allDates = null;
            
            while (rst.next()) {
                if (allDates == null) {
                    allDates = new ArrayList<>();
                }
                
                
                allDates.add(new DoctorSessionDTO(
                        null,
                        null,
                        rst.getString(3),
                        null,
                        null,
                        null
                ));
               return allDates;  
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(DoctorSessionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

//    @Override
//    public ArrayList<DoctorSessionDTO> getSessionDates() throws Exception {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    
  
}
