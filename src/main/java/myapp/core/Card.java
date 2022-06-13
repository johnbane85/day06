package myapp.core;

public class Card {

  // implicit static, like a constant
  public enum Suit {Diamond, Spade, Heart, Clubs}
  
  // card names
  public static final String[] CARD_Names = {
    "Ace","Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"
  } ;
  
  // value of each card
  public static final int[] CARD_VALUE = {
    1,2,3,4,5,6,7,8,9,10,10,10,10
  };

  private final Suit suit;
  private final String name;
  private final int value;

  public Card(Suit s, String n, int v) {
    suit = s;
    name =n;
    value =v;
  }

public Suit getSuit() {return this.suit;}
public String getName() {return this.name;}
public int getValue() {return this.value;}

public String toString(){
  return getName() + " of " + getSuit() + " value: " + getValue();
}


}
