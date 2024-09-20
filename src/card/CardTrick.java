/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;


/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * Michael Kirton
 * Student ID: 991601646
 */
import static card.Card.SUITS;
import java.util.Random;
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rcard = new Random();
        int num = 1 + rcard.nextInt(3);
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setSuit("hearts");
            c.setValue(5);
            c.setSuit(Card.SUITS[num]);
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner choice =  new Scanner(System.in);
       
        
        System.out.println("Please state a card");
        String playerchoice = choice.nextLine();
        
       for (String c : SUITS){
           if (playerchoice.equals(c)){
               System.out.println("Your card is in the Magic hand of cards");
           }else{
               System.out.println("That card is not in the hand");
           }
           
       } 
       System.out.println("Your luck card is: " + 2 + "clubs" );
      // add one luckcard hard code 2,clubs
    }
    
}
