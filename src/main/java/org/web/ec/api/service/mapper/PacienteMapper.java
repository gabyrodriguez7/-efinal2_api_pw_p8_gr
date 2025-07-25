package org.web.ec.api.service.mapper;

import org.web.ec.api.repository.model.Paciente;
import org.web.ec.api.service.to.PacienteTo;

public class PacienteMapper {

    public static Paciente toEntity(PacienteTo pacienteto){
        Paciente paciente = new Paciente();
        paciente.setCedula(pacienteto.getCedula());
        paciente.setNombre(pacienteto.getNombre());
        paciente.setApellido(pacienteto.getApellido());
        paciente.setFechaDeNacimiento(pacienteto.getFechaDeNacimiento());

        return paciente;
    }

        public static PacienteTo toTo(Paciente paciente){
        PacienteTo pacienteTo = new PacienteTo();
        pacienteTo.setCedula(paciente.getCedula());
        pacienteTo.setNombre(paciente.getNombre());
        pacienteTo.setApellido(paciente.getApellido());
        pacienteTo.setFechaDeNacimiento(paciente.getFechaDeNacimiento());

        return pacienteTo;
    }


    
}
