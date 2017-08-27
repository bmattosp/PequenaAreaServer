package org.pequenaarea.servicos.pequenaareaserver.servico;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("usuario")
public class Usuario {
	@Path("nome")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String RetornaNome() {
        return "Chico das coves";
    }
	
	@Path("Cria")
    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    public String usuario() {
        return "Chico das coves";
    }
}

