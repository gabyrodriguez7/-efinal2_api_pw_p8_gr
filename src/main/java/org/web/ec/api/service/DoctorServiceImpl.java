package org.web.ec.api.service;

import java.util.List;

import org.web.ec.api.repository.IDoctorRepo;
import org.web.ec.api.repository.model.Doctor;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class DoctorServiceImpl implements IDoctorService {
    @Inject
    IDoctorRepo doctorRepo;

    @Override
    public List<Doctor> obtenertodos() {
        return this.doctorRepo.obtenertodos();
    }

    @Override
    public Doctor buscarPorCedula(String cedula) {
        return this.doctorRepo.buscarPorCedula(cedula);
    }

    @Override
    public void guardar(Doctor doctor) {
        this.doctorRepo.guardar(doctor);
    }

}
