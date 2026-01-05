package exp4;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {

        List<Card> cards=collectCards();
        Map<String, List<Card>> deck = groupCards(cards);
        printDetails(deck);
    }
    public static List<Card> collectCards(){
        List<Card> cards = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Number of cards: ");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=n;i++) {
            System.out.println("Enter card " + i + ": ");
            String symbol = sc.nextLine().trim();
            int number = sc.nextInt();
            sc.nextLine();
            cards.add(new Card(symbol, number));
        }
        sc.close();
        return cards;
    }
    public static Map<String, List<Card>> groupCards(List<Card> cards) {
        Map<String, List<Card>> groupedCards = new HashMap<>();
        for (Card card : cards) {
            groupedCards.computeIfAbsent(card.symbol, k -> new
                    ArrayList<>()).add(card);
        }
        return groupedCards;
    }
    public static void printDetails(Map<String, List<Card>> groupedCards) {
        List<String> symbols = new ArrayList<>(groupedCards.keySet());
        Collections.sort(symbols);
        System.out.println("Distinct Symbols are: \n" + String.join(" ",
                symbols));
        for (String symbol : symbols) {
            System.out.println("Cards in " + symbol + " Symbol");
            int totalSum = 0;
            for (Card card : groupedCards.get(symbol)) {
                System.out.println(card.symbol + " " + card.number);
                totalSum += card.number;
            }
            System.out.println("Number of cards: " +
                    groupedCards.get(symbol).size());
            System.out.println("Sum of Numbers: " + totalSum + "\n");
        }
    }
}
