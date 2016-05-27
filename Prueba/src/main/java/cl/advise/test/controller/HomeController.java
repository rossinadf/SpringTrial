package cl.advise.test.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cl.advise.test.model.Cliente;
import cl.advise.test.model.Producto;
import cl.advise.test.service.ClientService;
import cl.advise.test.service.ProductService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private ProductService productsService;
	@Autowired
	private ClientService clientsService;
	
	/**
	 * Simply selects the home view to
	 * 
	 *  render by returning its name.
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Model model) {
		
		return "home";
	}
	
	@RequestMapping(value = "/newOrder", method = RequestMethod.GET)
	public ModelAndView addOrder(ModelAndView model) {
		model = new ModelAndView("newOrder");
		List<Producto> listContact = productsService.getProductList();
	    model.addObject("productsList", listContact);
	    model.addObject("command", new Producto());
	    
		return model;
		
	}
	
	@RequestMapping(value="/products")
	public ModelAndView listContact(ModelAndView model) throws IOException{
	    List<Producto> listContact = productsService.getProductList();
	    model.addObject("productsList", listContact);
	    model.setViewName("products");
	 
	    return model;
	}
	
	@RequestMapping(value = "/newClient", method = RequestMethod.GET)
	public ModelAndView addClient() {
		return new ModelAndView("newClient", "clientForm", new Cliente());
		
	}
	
	@RequestMapping(value = "/clientCreated", method = RequestMethod.POST)
	public String addClient(@ModelAttribute("SpringWeb")Cliente cliente, ModelMap model){
		model.addAttribute("id", clientsService.insert(cliente));
		model.addAttribute("nombre", cliente.getNombre());
		model.addAttribute("email", cliente.getEmail());
		return "clientCreated";
	}
	
}
