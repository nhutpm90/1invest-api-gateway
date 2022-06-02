package com.invest.microservices.gateway.api;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@Value("${app.env}")
    private String env;
	
	@GetMapping("/live-check")
	public String liveCheck() throws Exception {
		return "1Invest Api Gateway Server:: " + new Date() + " - env:: " + env;
	}
}
