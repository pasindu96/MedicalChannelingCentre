/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.medicalCentre.dao.custom.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import lk.ijse.medicalCentre.core.dto.CustomDTO;
import lk.ijse.medicalCentre.core.dto.DoctorSessionDTO;
import lk.ijse.medicalCentre.core.dto.SuperDTO;
import lk.ijse.medicalCentre.dao.custom.QueryDAO;
import lk.ijse.medicalCentre.dao.db.DBConnection;

/**
 *
 * @author pasindu
 */
public class QueryDAOImpl implements QueryDAO{

    @Override
    public boolean add(SuperDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(SuperDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(SuperDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SuperDTO search(SuperDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<SuperDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<SuperDTO> getSpecialDoctors(String speciality) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CustomDTO getAllInformation(String doctorID) throws Exception {
        String sql = "select s.sessiondate from session s,doctor d where d.doctorID='"+doctorID+"'";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        
        while(rst.next()){
        if (rst.next()) {
            return new CustomDTO(rst.getString(0));
          
            }
        }
        return null;
    } 

    @Override
    public ArrayList<DoctorSessionDTO> getSessionDates(String doctorID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
