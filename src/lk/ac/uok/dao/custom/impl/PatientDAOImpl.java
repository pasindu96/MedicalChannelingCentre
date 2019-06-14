/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ac.uok.dao.custom.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import lk.ac.uok.core.dto.CustomDTO;
import lk.ac.uok.core.dto.DoctorSessionDTO;
import lk.ac.uok.core.dto.PatientDTO;
import lk.ac.uok.dao.custom.PatientDAO;
import lk.ac.uok.dao.db.DBConnection;

/**
 *
 * @author pasindu
 */
public class PatientDAOImpl implements PatientDAO{

    @Override
    public boolean add(PatientDTO pdto) throws Exception {
        Connection connection=DBConnection.getInstance().getConnection();
        String sql="insert into patient value (?,?,?,?,?);";
        PreparedStatement pstm=connection.prepareStatement(sql);
        pstm.setObject(1, pdto.getNIC());
        pstm.setObject(2, pdto.getPatient_name());
        pstm.setObject(3, pdto.getDOB());
        pstm.setObject(4, pdto.getSex());
        pstm.setObject(5, pdto.getTelephoneNumber());
        
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);   
    }

    @Override
    public boolean update(PatientDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(PatientDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PatientDTO search(PatientDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<PatientDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<PatientDTO> getSpecialDoctors(String speciality) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CustomDTO getAllInformation(String doctorID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    @Override
    public ArrayList<PatientDTO> getSessionDates() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<PatientDTO> getSpecialities(String docID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<PatientDTO> getSessionDates(String doctorID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
