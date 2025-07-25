package org.web.ec.api.repository;

import java.util.List;

import org.web.ec.api.repository.model.Paciente;

public interface IPacienteRepo {
    public List<Paciente> obtenertodos();
    public Paciente buscarPorCedula(String cedula);
    public void guardar(Paciente paciente);
}
