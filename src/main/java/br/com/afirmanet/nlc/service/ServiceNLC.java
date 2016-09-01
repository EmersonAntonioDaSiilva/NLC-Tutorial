package br.com.afirmanet.nlc.service;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.afirmanet.nlc.service.vo.NaturalVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Path("/serviceNLC")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class ServiceNLC implements Serializable {
	private static final long serialVersionUID = 6912768962299581218L;

	
	@PersistenceUnit(unitName = "question-ds")
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	
	
	public ServiceNLC(){
		//entityManager = entityManagerFactory.createEntityManager();	
	}
	
	@POST
	@Path("/nlc")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	@Transactional
	public NaturalVO dialog(final NaturalVO locutor) {
	
		return locutor;
	}
	
	@GET
	@Path("/nlcForeHand/{token}")
	@Transactional
	public NaturalVO dialogForeHand(@PathParam("token") String token) {
		
		
		NaturalVO naturalVO = new NaturalVO();
		naturalVO.setToken(token);
		
		return naturalVO;
	}
	

}
