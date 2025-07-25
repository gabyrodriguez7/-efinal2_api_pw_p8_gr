package org.web.ec.api.repository;

import java.util.List;

import org.web.ec.api.repository.model.Paciente;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Context;

@ApplicationScoped
@Transactional
public class PacienteRepoImpl  implements IPacienteRepo{
    
        @Context
    private EntityManager entityManager;

        @Override
        public List<Paciente> obtenertodos() {
        TypedQuery myQuery = entityManager.createQuery("SELECT p FROM Paciente p ORDER BY p.id",Paciente.class);
        return myQuery.getResultList();
        }

        @Override
        public Paciente buscarPorCedula(String cedula) {
            return entityManager.find(Paciente.class, cedula);
        }

        @Override
        public void guardar(Paciente paciente) {
            entityManager.persist(paciente);
        }
}
