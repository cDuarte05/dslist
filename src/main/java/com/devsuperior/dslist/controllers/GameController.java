package com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games") //basicamente mapeando como vai se chamar o link na hora 

public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping //mapear que é um get
	public List<Game> findAll(){
		List<Game> result = gameService.findAll();
		return result;
	}
	
}
