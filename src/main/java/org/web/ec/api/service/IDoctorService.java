package org.web.ec.api.service;

import java.util.List;

import org.web.ec.api.repository.model.Doctor;

public interface  IDoctorService {
    
    public List<Doctor> obtenertodos();
    public Doctor buscarPorCedula(String cedula);
    public void guardar(Doctor doctor);

}
