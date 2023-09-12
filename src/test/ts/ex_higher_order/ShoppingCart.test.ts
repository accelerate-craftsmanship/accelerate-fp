import {expect, test} from 'vitest'
import {DiscountCatalog, ShoppingCart} from '../../../main/ts/ex_higher_order/ShoppingCart'

const cart = new ShoppingCart([
    {name: "Item 1", amount: 1, price: 20},
    {name: "Item 2", amount: 5, price: 30},
    {name: "Item 3", amount: 6, price: 15},
]);

test('should apply gratis discount to shopping cart', () => {

    const cartWithDiscount = cart.withDiscount(DiscountCatalog.gratis);

    expect(cart.getTotal()).toBe(260);
    expect(cartWithDiscount.getTotal()).toBe(0);
})

test('should apply 10% discount to shopping cart', () => {

    const cartWithDiscount = cart.withDiscount(DiscountCatalog.tenPercent);

    expect(cart.getTotal()).toBe(260);
    expect(cartWithDiscount.getTotal()).toBe(234);
})

test('should apply every third free to shopping cart', () => {

    const cartWithDiscount = cart.withDiscount(DiscountCatalog.everyThirdFree);

    expect(cart.getTotal()).toBe(260);
    expect(cartWithDiscount.getTotal()).toBe(200); // 260 - 30 - 2*15
})

test('should apply every third free and 10 precent discount to shopping cart', () => {

    const cartWithDiscount = cart.withDiscount(DiscountCatalog.everyThirdFree).withDiscount(DiscountCatalog.tenPercent);

    expect(cart.getTotal()).toBe(260);
    expect(cartWithDiscount.getTotal()).toBe(180); // (260 - 30 - 2*15) * 0.9
})
