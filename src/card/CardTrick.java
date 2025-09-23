/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template


 */


package card;
import java.util.Scanner;
import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * Modifier:
*   Dorian Motieshare
*   991783685
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        
        //randomly generating a magic hand using the for loop
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1); 
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i] = c;
            System.out.println(c.getSuit() + " " + c.getValue());
        }
        //hardcoded lucky card that is 2 of clubs
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Clubs");
        //asking user for the input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a card value (1—13): ");
        int insertedValue = input.nextInt();

        System.out.print("Enter a suit (0—3 where 0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades): ");
        int suitIndex = input.nextInt();
        String userSuit = Card.SUITS[suitIndex];

        boolean isInside = false;

        for (Card card : magicHand) {
            if (card.getValue() == insertedValue && card.getSuit().equals(userSuit)) {
                isInside = true;
                break;
            }
        }
         if (!isInside && luckyCard.getValue() == insertedValue && luckyCard.getSuit().equals(userSuit)) {
            isInside = true;
        }
         
         if (isInside) {
            System.out.println("Yay! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
    }
        
      
        
 
    }
    

