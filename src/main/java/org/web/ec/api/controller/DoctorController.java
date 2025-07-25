package org.web.ec.api.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.web.ec.api.repository.IDoctorRepo;
import org.web.ec.api.service.mapper.DoctorMapper;
import org.web.ec.api.service.to.DoctorTo;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/doctores")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DoctorController {

    @Inject
    public IDoctorRepo doctorRepo;

    @GET
    @Path("")
    @Operation(
        summary = "Obtener todos los doctores",
        description = "Capacidad para obtener todos los doctores"
    )
    public Response obtenerTodos(){
        List<DoctorTo> doc = doctorRepo.obtenertodos().stream().map(DoctorMapper::toTo).collect(Collectors.toList());
        return Response.status(Response.Status.OK).entity(doc).build();
    }

    @POST
    @Path("")
        @Operation(
        summary = "Crear todos los doctores",
        description = "Capacidad para crear todos los doctores"
    )
    public Response crearDoctor(@RequestBody DoctorTo doctorTo){
        this.doctorRepo.guardar(DoctorMapper.toEntity(doctorTo));
        return Response.status(Response.Status.CREATED).build();
    }

    @GET
    @Path("{cedula}")
        @Operation(
        summary = "Buscar todos los doctores por id",
        description = "Capacidad para buscar todos los doctores por id"
    )
    public Response buscarPorid(@PathParam("cedula") String cedula){
        DoctorTo doctor = DoctorMapper.toTo(this.doctorRepo.buscarPorCedula(cedula));
        return Response.status(Response.Status.OK).entity(doctor).build();
    }

    
}
