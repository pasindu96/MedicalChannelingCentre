/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ac.uok.dao;

import java.util.ArrayList;
import lk.ac.uok.core.dto.CustomDTO;
import lk.ac.uok.core.dto.DoctorSessionDTO;
import lk.ac.uok.core.dto.SuperDTO;

/**
 *
 * @author pasindu
 */
public interface SuperDAO<T extends SuperDTO> {
    
    public boolean add(T dto)throws Exception;
    
    public boolean update(T dto)throws Exception;
    
    public boolean delete(T dto)throws Exception;
    
    public T search(T dto)throws Exception;
    
    public ArrayList<T> getAll()throws Exception;  
    
    public ArrayList<T> getSpecialDoctors(String speciality) throws Exception;        
    
    public CustomDTO getAllInformation(String doctorID)throws Exception;
    
    public ArrayList<T> getSessionDates() throws Exception;
    
    public ArrayList<T> getSessionDates(String doctorID) throws Exception;
    
    public ArrayList<T> getSpecialities(String docID) throws Exception;
    
}
