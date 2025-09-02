package services;

import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.servlet.ServletContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import beans.Product;
import dao.ProductDAO;
import dto.ProductPriceDTO;

@Path("/products")
public class ProductService {
	@Context
	ServletContext ctx;
	
	public ProductService() {
	}
	
	@PostConstruct
	// ctx polje je null u konstruktoru, mora se pozvati nakon konstruktora (@PostConstruct anotacija)
	public void init() {
		// Ovaj objekat se instancira vise puta u toku rada aplikacije
		// Inicijalizacija treba da se obavi samo jednom
		if (ctx.getAttribute("productDAO") == null) {
	    	String contextPath = ctx.getRealPath("");
			ctx.setAttribute("productDAO", new ProductDAO(contextPath));
		}
	}
	
	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Product> getProducts() {
		ProductDAO dao = (ProductDAO) ctx.getAttribute("productDAO");
		return dao.findAll();
	}
	
	@POST
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public Product getProducts(Product product) {
		ProductDAO dao = (ProductDAO) ctx.getAttribute("productDAO");
		return dao.save(product);
	}
	
	@PUT
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Product updateProduct(@PathParam("id") String id, Product product) {
		ProductDAO dao = (ProductDAO) ctx.getAttribute("productDAO");
		return dao.updateProduct(id, product);
	}
	
	@PATCH
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Product updateProductPrice(@PathParam("id") String id, ProductPriceDTO product) {
		ProductDAO dao = (ProductDAO) ctx.getAttribute("productDAO");
		return dao.updatePrice(id, product);
	}
	
	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Product deleteProduct(@PathParam("id") String id) {
		ProductDAO dao = (ProductDAO) ctx.getAttribute("productDAO");
		return dao.deleteProduct(id);
	}
	
	@GET
	@Path("/search")
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Product> searchProducts(@QueryParam("name") String name,
											@QueryParam("minPrice") double minPrice,
											@QueryParam("maxPrice") double maxPrice) {
		ProductDAO dao = (ProductDAO) ctx.getAttribute("productDAO");
		return dao.findByNameAndPriceRange(name, minPrice, maxPrice);
	}
		
}
