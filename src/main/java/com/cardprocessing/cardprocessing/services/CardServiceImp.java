package com.cardprocessing.cardprocessing.services;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cardprocessing.cardprocessing.dao.CardDao;
import com.cardprocessing.cardprocessing.entities.Card;

@Service
public class CardServiceImp implements CardService {

	@Autowired
	private CardDao cardDao;
	
	@Override
	public List<Card> getCards() {
		// TODO Auto-generated method stub
		return cardDao.findAll();
	}
	
	@Override
	public Card getCard(long cardId) {
		return cardDao.getOne(cardId);
	}
	
	
	@Override
	public Card addCard(Card card) {
		cardDao.save(card);
		return card;
	}
	
	
	@Override
	public Card updateCard(Card card) {
		cardDao.save(card);
		return card;
	}
	
	@Override
	public void deleteCard(long parseLong) {
		Card entity = cardDao.getOne(parseLong);
		cardDao.delete(entity);
	}
}
