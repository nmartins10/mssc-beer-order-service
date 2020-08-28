package guru.sfg.beer.order.service.services;

import guru.sfg.beer.order.service.domain.BeerOrder;

/**
 * @author Nuno Martins
 */
public interface BeerOrderManager {

    BeerOrder newBeerOrder(BeerOrder beerOrder);
}
