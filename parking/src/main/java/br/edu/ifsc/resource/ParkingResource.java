package br.edu.ifsc.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsc.service.ParkingService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/parking")
public class ParkingResource {

	private ParkingService parkingService = new ParkingService();

	@RequestMapping(value = "/vagas", method = RequestMethod.GET)
	public ResponseEntity<String> vagas() {
		return new ResponseEntity<String>("Rola", HttpStatus.OK);
	}
}
