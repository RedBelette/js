package be.andreadev.enterprisemgt.js.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
public class TwigSampleController {

	@RequestMapping("/twig/helloworld/{name}")
    public String helloworldAction(ModelMap model, @PathVariable("name") String name) {
        model.addAttribute("name", name);
        return "helloworld";
    }
	
	public static void main(String[] args) {
		SpringApplication.run(TwigSampleController.class, args);
	}

}
