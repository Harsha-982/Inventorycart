package com.example.GroceryCart;

public class CardDetails{

    private String cardHolderName;
    private Long cardNumber;
    private int cVV;
    public CardDetails() {
        this.cardHolderName = "";
        this.cardNumber = 0l;
        this.cVV= 0;
    }
    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public Long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Long cardNumber) {
        this.cardNumber = cardNumber;
    }
    public int getCVV() {
        return cVV;
    }

    public void setCVV(int CVV) {
        this.cVV = CVV;
    }


}

