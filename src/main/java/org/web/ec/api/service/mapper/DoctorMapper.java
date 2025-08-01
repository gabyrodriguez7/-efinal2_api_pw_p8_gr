package org.web.ec.api.service.mapper;

import org.web.ec.api.repository.model.Doctor;
import org.web.ec.api.service.to.DoctorTo;

public class DoctorMapper {

    public static Doctor toEntity(DoctorTo doctorTo){
        Doctor doctor = new Doctor();
        doctor.setCedula(doctorTo.getCedula());
        doctor.setNombre(doctorTo.getNombre());
        doctor.setApellido(doctorTo.getApellido());
        doctor.setGenero(doctorTo.getGenero());

        return doctor;
    }
    public static DoctorTo toTo(Doctor doctor){
        DoctorTo doctorTo = new DoctorTo();
        doctorTo.setCedula(doctor.getCedula());
        doctorTo.setNombre(doctor.getNombre());
        doctorTo.setApellido(doctor.getApellido());
        doctorTo.setGenero(doctor.getGenero());
        return doctorTo;
    }
    
}
