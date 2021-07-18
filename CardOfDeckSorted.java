package com.bridgelab.program;
import java.util.Arrays;
public class CardOfDeckSorted {

		public static void main(String[] args) {
			String[] cardType = { "Clubs", "Diamonds", "Hearts", "Spades" };
			String[] cardNumb = { "201", "302", "403", "504", "605", "706", "807", "908", "1009", "Jack10", "Queen11",
					"King12", "Ace13" };
			String[] cardDeck = new String[52];
			int j2 = 0;
			for (int i = 0; i < cardType.length; i++) {
				for (int j = 0; j < cardNumb.length; j++) {
					cardDeck[j2] = cardType[i] + " " + cardNumb[j];
					System.out.println(cardDeck[j2]);
					j2++;
				}
				
			}
			String[] arr = new String[9];
			j2 = 0;
			for (int p = 0; p < 4; p++) {
				for (int j = 0; j < 9; j++) {
					arr[j] = cardDeck[j2];
					j2++;

				}
				
			System.out.println(Arrays.toString(arr));
				System.out.println();

			}
		}
}

				