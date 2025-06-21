package com.example.pratik.Oauth2.Controller;


import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	   @RequestMapping(value="/",method = RequestMethod.GET)
	    public String home() {
	        return "<a href='/login'>Login with SSO</a>";
	    }

	   
	   @RequestMapping(value="/secured",method = RequestMethod.GET)
	    public String secured(Principal principal) {
	        return "Hello, " + principal.getName();
	    }

}
