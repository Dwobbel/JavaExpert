package skelet.javaexperts.chapter2.exercise10;

import java.util.List;

/**
 * Created by JonathanSyntra on 23/05/2017.
 */
public class BeerClient {
    public static void main(String[] args) throws Exception {
        BeerDao beerDao = new BeerDao();
        beerDao.setUrl("jdbc:mysql://noelvaes.eu/StudentDB");
        beerDao.setUser("student");
        beerDao.setPassword("student123");

        Beer beer = beerDao.getBeerById(100);

        System.out.println(beer.getName());
        System.out.println(beer.getPrice());
        System.out.println(beer.getAlcohol());
        System.out.println(beer.getStock());

        beer.setStock(beer.getStock() -10);
        beerDao.updateBeer(beer);

        List<Beer> beers = beerDao.getBeersByAlcohol(10);
        for(Beer b: beers) {
            System.out.println(b);
        }

        beers = beerDao.getBeersByName("kriek");
        for(Beer b: beers) {
            System.out.println(b);
        }
    }
}
