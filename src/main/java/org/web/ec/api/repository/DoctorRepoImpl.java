package org.web.ec.api.repository;

import java.util.List;

import org.web.ec.api.repository.model.Doctor;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Context;

@ApplicationScoped
@Transactional
public class DoctorRepoImpl implements IDoctorRepo{

    @Context
    private EntityManager entityManager;
    @Override
    public List<Doctor> obtenertodos() {
        TypedQuery myQuery = entityManager.createQuery("SELECT d FROM Doctor d ORDER BY d.id",Doctor.class);
        return myQuery.getResultList();
    }

    @Override
    public Doctor buscarPorCedula(String cedula) {
        return entityManager.find(Doctor.class, cedula);
    }

    @Override
    public void guardar(Doctor doctor) {
        entityManager.persist(doctor);
    }
    
}

