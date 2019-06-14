/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ac.uok.dao.custom.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import lk.ac.uok.core.dto.CustomDTO;
import lk.ac.uok.core.dto.DoctorDTO;
import lk.ac.uok.core.dto.DoctorSessionDTO;
import lk.ac.uok.dao.custom.DoctorDAO;
import lk.ac.uok.dao.db.DBConnection;

/**
 *
 * @author pasindu
 */
public class DoctorDAOImpl implements DoctorDAO{

    @Override
    public boolean add(DoctorDTO doctor) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO doctor VALUES (?,?,?,?,?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
        
        pstm.setObject(1, doctor.getDoctorID());
        pstm.setObject(2, doctor.getName());
        pstm.setObject(3, doctor.getMedRegNo());
        pstm.setObject(4, doctor.getSpeciallity());
        pstm.setObject(5, doctor.getHospital_name());
        pstm.setObject(6, doctor.getTelephone_No());
        
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean update(DoctorDTO doctor) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE Doctor SET name=?, medRegNo=?, speciallity=?,hospital_name = ? ,telephone_No = ? WHERE doctorID=?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        
        pstm.setObject(1, doctor.getName());
        pstm.setObject(2, doctor.getMedRegNo());
        pstm.setObject(3, doctor.getSpeciallity());
        pstm.setObject(4, doctor.getHospital_name());
        pstm.setObject(5, doctor.getTelephone_No());
        pstm.setObject(6, doctor.getDoctorID());
        
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean delete(DoctorDTO doctor) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM Doctor WHERE doctorID = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, doctor.getDoctorID());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public DoctorDTO search(DoctorDTO doctor) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Doctor WHERE name='"+doctor.getName()+"' ";
        /*PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, doctor.getName());
        //pstm.setObject(2, doctor.getName());*/
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        //while(rst.next()){
        if(rst.next()) { 
//            doctor.setDoctorID(rst.getString("doctorID"));
//            doctor.setName(rst.getString("name"));
//            doctor.setSpeciallity(rst.getString(" speciallity"));
//            doctor.setHospital_name(rst.getString("hospital_name"));
              return new DoctorDTO(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6));
            
            }
        return null;
    }

    @Override
    public ArrayList<DoctorDTO> getAll() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Doctor";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<DoctorDTO> allDoctors = null;

        while (rst.next()) {
            if (allDoctors == null) {
                allDoctors = new ArrayList<>();
            }

            allDoctors.add(new DoctorDTO(
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
    public ArrayList<DoctorDTO> getSpecialDoctors(String speciality) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Doctor where speciallity='"+speciality+"'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<DoctorDTO> allDoctors = null;

        while (rst.next()) {
            if (allDoctors == null) {
                allDoctors = new ArrayList<>();
            }

            allDoctors.add(new DoctorDTO(
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
    public CustomDTO getAllInformation(String doctorID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    @Override
    public ArrayList<DoctorDTO> getSessionDates() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<DoctorDTO> getSpecialities(String docID) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Doctor where doctorID='"+docID+"'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<DoctorDTO> allDoctors = null;

        while (rst.next()) {
            if (allDoctors == null) {
                allDoctors = new ArrayList<>();
            }

            allDoctors.add(new DoctorDTO(
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
    public ArrayList<DoctorDTO> getSessionDates(String doctorID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
