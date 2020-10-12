package com.cardprocessing.cardprocessing.services;

import java.util.List;

import com.cardprocessing.cardprocessing.entities.Card;

public interface CardService {
	public List<Card> getCards();
	
	public Card getCard(long cardId);
	
	public Card addCard(Card card);
	
	public Card updateCard(Card card);
	
	public void deleteCard(long parseLong);
	
}