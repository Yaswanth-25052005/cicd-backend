package com.klu.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

						
@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class ArithmeticCalc {

	@GetMapping("add/{A}/{B}")
	public String add(@PathVariable ("A") int a, @PathVariable("B") int b) {
		return "" + (a + b);
	}
	
	@GetMapping("sub/{C}/{D}")
	public String sub(@PathVariable ("C") int c, @PathVariable("D") int d) {
		return "" + (c - d );
	}
	
	@GetMapping("multi/{A}/{B}")
	public String multi(@PathVariable ("A") int a, @PathVariable("B") int b) {
		return "" + (a * b);
	}
	
	@GetMapping("div/{A}/{B}")
	public String div(@PathVariable ("A") int a, @PathVariable("B") int b) {
		return "" + (a / b);
	}
	
	@GetMapping("mod/{A}/{B}")
	public String mod(@PathVariable ("A") int a, @PathVariable("B") int b) {
		return "" + (a % b);
	}
	
}
