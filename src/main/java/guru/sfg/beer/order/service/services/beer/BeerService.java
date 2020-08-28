package guru.sfg.beer.order.service.services.beer;

import guru.sfg.brewery.model.BeerDto;

import java.util.Optional;
import java.util.UUID;

/**
 * @author Nuno Martins
 */
public interface BeerService {

    Optional<BeerDto> getBeerById(UUID beerId);

    Optional<BeerDto> getBeerByUpc(String upc);
}
