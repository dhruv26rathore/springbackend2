package com.cardprocessing.cardprocessing.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.cardprocessing.cardprocessing.entities.Card;
import com.cardprocessing.cardprocessing.services.CardService;

	@RestController
	@CrossOrigin(origins = "http://localhost:4200")

public class MyController {
		@Autowired
		private CardService cardService;
		
		@GetMapping("/card")
		public List<Card> getCards(){
			return this.cardService.getCards();
		}
		
		@GetMapping("/card/{cardId}")
		public Card getCard(@PathVariable String cardId) {
			return this.cardService.getCard(Long.parseLong(cardId));
		}
		
		@PostMapping("/card")
		public Card addCard(@RequestBody Card card) {
			return this.cardService.addCard(card);
		}
		
		@PutMapping("/card")
		public Card updateCard(@RequestBody Card card) {
			return this.cardService.updateCard(card);
			 
			}
		
		@DeleteMapping("/card/{cardId}")
		public ResponseEntity<HttpStatus> deleteCard(@PathVariable String cardId) {
		  	try {
		  		this.cardService.deleteCard(Long.parseLong(cardId));
		  		return new ResponseEntity<>(HttpStatus.OK);
		  	}catch(Exception e){
		  		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		  	}
		}
	}