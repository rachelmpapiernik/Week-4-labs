import java.util.Random;

public class Card {

	private String suit;
	private String faceValue;

	//pick five cards
	public Card(String suit, String faceValue) {
		this.suit = suit;
		this.faceValue = faceValue;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public String getFaceValue() {
		return faceValue;
	}

	public void setFaceValue(String faceValue) {
		this.faceValue = faceValue;
	}

	@Override
	public String toString() {
		return "Card{" + "suit='" + suit + '\'' + ", faceValue=" + faceValue + '}';
	}

	//card values
	public static void main(String[] args) {

		String[] suits = { "spades", "hearts", "diamonds", "clubs" };
		String[] faceValues = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

		//random card selector
		Random random = new Random();
		for (int i = 1; i <= 5; i++) {
			Card card = new Card(suits[random.nextInt(suits.length)], faceValues[random.nextInt(faceValues.length)]);
			System.out.println(card);
		}
	}
}