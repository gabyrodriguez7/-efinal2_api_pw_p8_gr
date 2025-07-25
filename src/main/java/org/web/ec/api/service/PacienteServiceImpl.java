package org.web.ec.api.service;

import java.util.List;

import org.web.ec.api.repository.IPacienteRepo;
import org.web.ec.api.repository.model.Doctor;
import org.web.ec.api.repository.model.Paciente;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PacienteServiceImpl implements IPacienteService{

    @Inject
    IPacienteRepo pacienteRepo;

    @Override
    public List<Paciente> obtenertodos() {
        return pacienteRepo.obtenertodos();
    }

    @Override
    public Paciente buscarPorCedula(String cedula) {
        return pacienteRepo.buscarPorCedula(cedula);
    }

    @Override
    public void guardar(Paciente paciente) {
        pacienteRepo.guardar(paciente);
    }
    
}
