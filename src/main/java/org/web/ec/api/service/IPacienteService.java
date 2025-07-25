package org.web.ec.api.service;

import java.util.List;

import org.web.ec.api.repository.model.Paciente;

public interface IPacienteService {

    public List<Paciente> obtenertodos();
    public Paciente buscarPorCedula(String cedula);
    public void guardar(Paciente paciente);
    
}
