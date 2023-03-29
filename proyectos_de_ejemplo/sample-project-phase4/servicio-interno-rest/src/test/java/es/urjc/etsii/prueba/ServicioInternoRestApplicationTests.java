package es.urjc.etsii.prueba;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.web.client.RestTemplate;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class ServicioInternoRestApplicationTests {

	@LocalServerPort
	int port;
	
	@Test
	void contextLoads() {
		
		RestTemplate restTemplate = new RestTemplate();
		Description desc = new Description("Me vas a partir esta línea como yo te diga");
		Description result = restTemplate.getForObject("http://localhost:" + port + "/filter", Description.class, desc);
		assertEquals("Me vas a partir<br />esta línea como<br />yo te diga", result.getText());	
	}

}
