package br.com.supermarket.api.MarketResources;

import br.com.supermarket.api.models.products;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/products")
@Produces(value = MediaType.APPLICATION_JSON)
@Consumes(value = MediaType.APPLICATION_JSON)
public class MarketResources {

    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public MarketResources (){
        entityManagerFactory = Persistence.createEntityManagerFactory("supermarketPU");
        entityManager = entityManagerFactory.createEntityManager();
    }

    @GET
    public List<products> getAllProducts(){

        List<products>  list = (List<products>) entityManager
                .createQuery("select o from products o", products.class)
                .getResultList();
        return list;

    }
}
