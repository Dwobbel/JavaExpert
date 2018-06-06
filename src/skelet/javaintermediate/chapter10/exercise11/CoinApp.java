package skelet.javaintermediate.chapter10.exercise11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by JonathanSyntra on 29/03/2017.
 */
public class CoinApp {
    public static void main(String[] args) {
        //Declare + initiate Map first

        Map<Coin,Integer> coinMap = new HashMap<>();

        //Add coins to the map

        coinMap.put(Coin.ONE_CENT,5);
        coinMap.put(Coin.TWO_CENT,10);
        coinMap.put(Coin.TEN_CENT,5);
        coinMap.put(Coin.ONE_EURO,30);




        /*Coin.ONE_CENT
        Coin.TWO_CENT
        Coin.FIVE_CENT
        Coin.TEN_CENT
        Coin.TWENTY_CENT
        Coin.FIFTY_CENT
        Coin.ONE_EURO
        Coin.TWO_EURO*/

        //Print contents of map
        coinMap.forEach((k,v) -> System.out.println(k+ ": " + v));

        //Calculate total monetary value and print it
        int total = 0;
        for(Coin c: coinMap.keySet()) {
            total = total + (coinMap.get(c) * c.getValue());
        }
        System.out.println(total);

        ArrayList<Map.Entry<Coin, Integer>> entries = new ArrayList<>(coinMap.entrySet());
        entries.sort(Map.Entry.comparingByKey());

        for (Map.Entry<Coin, Integer> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }
}
