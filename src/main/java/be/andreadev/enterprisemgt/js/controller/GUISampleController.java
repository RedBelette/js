package be.andreadev.enterprisemgt.js.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
public class GUISampleController {

	@RequestMapping("/")
    public String indexAction() {
        return "dashboard/dashboard.html"; 
    }
	
	public static void main(String[] args) {
		SpringApplication.run(GUISampleController.class, args);
	}
	
}
