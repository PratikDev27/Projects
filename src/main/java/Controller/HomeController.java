package Controller;


import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	   @RequestMapping("/")
	    public String home() {
	        return "<a href='/login'>Login with Google</a>";
	    }

	   
	   @RequestMapping("/secured")
	    public String secured(Principal principal) {
	        return "Hello, " + principal.getName();
	    }

}
