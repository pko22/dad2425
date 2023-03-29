package es.urjc.etsii.prueba;

import org.apache.commons.text.WordUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilterController {

	@PostMapping(value = "/filter", produces = "application/json")
	public Description filter(@RequestBody Description text) {
		System.out.println(text.getText());
		return new Description(WordUtils.wrap(text.getText(), 10, "<br />", false));
	}
	
	
}
