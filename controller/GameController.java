package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.service.GameExample;

@RestController
@RequestMapping("/api")
public class GameController {
	
	@Autowired
	private GameExample gameExample;
	
	@GetMapping("/restart")
	public String restart() {
		gameExample.restart();
		return "New Game Started..You have 5 Attempts to guess the secret number..";
	}
	
	@GetMapping("/guess")
	public String guess(@RequestParam int number) {
		return gameExample.Guess(number);
	}
}
