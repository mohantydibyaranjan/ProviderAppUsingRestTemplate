package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Actor;
@RestController
public class WishMessageOperationcontroller {
	@GetMapping("/wish")
	public ResponseEntity<String> showWishMessage(){
		return new ResponseEntity<String>("Good Morning",HttpStatus.OK);
	}
	@GetMapping("/wish1/{id}/{name}")
	public ResponseEntity<String> showMessage(@PathVariable Integer id,@PathVariable String name) {
		return new ResponseEntity<String> ("Good Morning"+id+"..........."+name,HttpStatus.OK);
	}
	@PostMapping("/register")
	public ResponseEntity<String> registerActor(@RequestBody Actor actor){
		return new ResponseEntity<String>(actor.toString(),HttpStatus.CREATED);
	}
	@GetMapping("/report")
	public ResponseEntity<Actor> showReport(){
		Actor actor=new Actor(101, "Dinesh", 6000.00, "Malisahi");
		return new ResponseEntity<Actor> (actor,HttpStatus.OK);
		
	}
	

}
