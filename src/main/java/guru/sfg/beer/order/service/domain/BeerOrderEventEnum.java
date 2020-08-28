package guru.sfg.beer.order.service.domain;

/**
 * @author Nuno Martins
 */
public enum BeerOrderEventEnum {
    VALIDATE_ORDER,
    VALIDATION_PASSED,
    VALIDATION_FAILED,
    ALLOCATION_SUCCESS,
    ALLOCATION_NO_INVENTORY,
    ALLOCATION_FAILED,
    BEERORDER_PICKED_UP
}
