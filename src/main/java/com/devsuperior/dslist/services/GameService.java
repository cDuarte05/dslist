package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

//esse componente precisa ser registrado pra facilitar pro framework
//@Component ou

@Service
public class GameService {

	@Autowired //injetar uma instancia
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList(); //o strem permite fazer operções com sequencias de dados (ver mais) já o .map converte uma coisa pra outra. Nessa caso é assim: Todo objeto x que era Game, vai ser convertido em New GameMinDTO(x)
		return dto;
	}
}
