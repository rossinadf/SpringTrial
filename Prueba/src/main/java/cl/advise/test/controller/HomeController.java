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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cl.advise.test.model.Producto;
import cl.advise.test.service.ProductService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private ProductService productsService;
	
	/**
	 * Simply selects the home view to
	 * 
	 *  render by returning its name.
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		//logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/newOrder", method = RequestMethod.GET)
	public ModelAndView addOrder(Locale locale, ModelAndView model) {
		model = new ModelAndView("form");
		List<Producto> listContact = productsService.getProductList();
	    model.addObject("productsList", listContact);
	    model.addObject("dfasdfasdff", new Producto());
	    
		return model;
		
	}
	
	@RequestMapping(value="/products")
	public ModelAndView listContact(ModelAndView model) throws IOException{
	    List<Producto> listContact = productsService.getProductList();
	    model.addObject("productsList", listContact);
	    model.setViewName("products");
	 
	    return model;
	}
	
}
