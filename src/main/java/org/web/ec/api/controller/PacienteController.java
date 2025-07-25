package org.web.ec.api.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.web.ec.api.repository.IPacienteRepo;
import org.web.ec.api.service.mapper.PacienteMapper;
import org.web.ec.api.service.to.PacienteTo;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/pacientes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PacienteController {
    @Inject
    public IPacienteRepo pacienteRepo;

    @GET
    @Path("")
    @Operation(
        summary = "Obtener todos los pacientes",
        description = "Capacidad para obtener todos los pacientes"
    )
    public Response obtenerTodos(){
        List<PacienteTo> doc = pacienteRepo.obtenertodos().stream().map(PacienteMapper::toTo).collect(Collectors.toList());
        return Response.status(Response.Status.OK).entity(doc).build();
    }

    @POST
    @Path("")
        @Operation(
        summary = "Crear todos los pacientes",
        description = "Capacidad para crear todos los pacientes"
    )
    public Response crearPaciente(@RequestBody PacienteTo pacienteTo){
        this.pacienteRepo.guardar(PacienteMapper.toEntity(pacienteTo));
        return Response.status(Response.Status.CREATED).build();
    }

    @GET
    @Path("{cedula}")
        @Operation(
        summary = "Buscar todos los pacientes por id",
        description = "Capacidad para buscar todos los pacientes por id"
    )
    public Response buscarPorid(@PathParam("cedula") String cedula){
        PacienteTo paciente = PacienteMapper.toTo(this.pacienteRepo.buscarPorCedula(cedula));
        return Response.status(Response.Status.OK).entity(paciente).build();
    }
    
}
