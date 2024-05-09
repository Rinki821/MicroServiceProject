package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.client.WelcomeApiClient;

@RestController
public class GreetRestController {

	@Autowired
	private WelcomeApiClient  welcomeClient;
	
	@GetMapping("/greet")
	public String getMsg() {
		String welcomeMsg = welcomeClient.invokeWelcomeMsg();
		String greetMsg = "GMM";
		return greetMsg.concat(welcomeMsg);
	}
}
