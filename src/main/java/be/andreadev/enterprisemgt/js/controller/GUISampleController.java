package be.andreadev.enterprisemgt.js.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
public class GUISampleController {

	@RequestMapping(value={"", "/", "dashboard.html"})
    public String indexAction() {
        return "dashboard/dashboard.html"; 
    }
	
	@RequestMapping("/searchCustomer.html")
	public String searchCustomerAction() {
		return "customer/searchcustomer.html"; 
	} 
	
	public static void main(String[] args) {
		SpringApplication.run(GUISampleController.class, args);
	}
	 
}
