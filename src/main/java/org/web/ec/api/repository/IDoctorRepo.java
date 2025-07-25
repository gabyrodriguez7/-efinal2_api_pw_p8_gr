package org.web.ec.api.repository;

import java.util.List;

import org.web.ec.api.repository.model.Doctor;

public interface  IDoctorRepo {

    public List<Doctor> obtenertodos();
    public Doctor buscarPorCedula(String cedula);
    public void guardar(Doctor doctor);

    
    
}
