package ie.atu.Passenger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@SpringBootApplication
@RequestMapping(path = "api/passenger")
public class PassengerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassengerApplication.class, args);
	}

	@GetMapping
	public List <Passenger> getPassengers()
	{
		List<Passenger> myPassengers = List.of(
				new Passenger("Mr", "Enoch", "123", 21, 23),
				new Passenger("Mr", "Enoch", "6723", 244L, 93),
				new Passenger("Mr", "Enoch", "144", 5562L, 53));
		return myPassengers;
	}
	@GetMapping({"passengerID"})
	public Passenger getMyPassenger(@PathVariable  String passengerID) {
		Passenger myPassenger = new Passenger("Mr","Enoch","123",123,20);
		return myPassenger;
	}


}
