package com.cardprocessing.cardprocessing.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Card {
@Id	
private long id;
private String cust_ref;
private String mid;
private String lcp;
private String merchant_name;
private String interchange_country;
private String card_name;
private String processing_agent;
private String currency;
private String valid_from;
private String valid_to;



public Card(long id, String cust_ref, String mid, String lcp, String merchant_name, String interchange_country,
		String card_name, String processing_agent, String currency, String valid_from, String valid_to) {
	super();
	this.id = id;
	this.cust_ref = cust_ref;
	this.mid = mid;
	this.lcp = lcp;
	this.merchant_name = merchant_name;
	this.interchange_country = interchange_country;
	this.card_name = card_name;
	this.processing_agent = processing_agent;
	this.currency = currency;
	this.valid_from = valid_from;
	this.valid_to = valid_to;
}

public Card() {
	super();
	// TODO Auto-generated constructor stub
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getCust_ref() {
	return cust_ref;
}

public void setCust_ref(String cust_ref) {
	this.cust_ref = cust_ref;
}

public String getMid() {
	return mid;
}

public void setMid(String mid) {
	this.mid = mid;
}

public String getLcp() {
	return lcp;
}

public void setLcp(String lcp) {
	this.lcp = lcp;
}

public String getMerchant_name() {
	return merchant_name;
}

public void setMerchant_name(String merchant_name) {
	this.merchant_name = merchant_name;
}

public String getInterchange_country() {
	return interchange_country;
}

public void setInterchange_country(String interchange_country) {
	this.interchange_country = interchange_country;
}

public String getCard_name() {
	return card_name;
}

public void setCard_name(String card_name) {
	this.card_name = card_name;
}

public String getProcessing_agent() {
	return processing_agent;
}

public void setProcessing_agent(String processing_agent) {
	this.processing_agent = processing_agent;
}

public String getCurrency() {
	return currency;
}

public void setCurrency(String currency) {
	this.currency = currency;
}

public String getValid_from() {
	return valid_from;
}

public void setValid_from(String valid_from) {
	this.valid_from = valid_from;
}

public String getValid_to() {
	return valid_to;
}

public void setValid_to(String valid_to) {
	this.valid_to = valid_to;
}

@Override
public String toString() {
	return "Card [id=" + id + ", cust_ref=" + cust_ref + ", mid=" + mid + ", lcp=" + lcp + ", merchant_name="
			+ merchant_name + ", interchange_country=" + interchange_country + ", card_name=" + card_name
			+ ", processing_agent=" + processing_agent + ", currency=" + currency + ", valid_from=" + valid_from
			+ ", valid_to=" + valid_to + "]";
}

}
