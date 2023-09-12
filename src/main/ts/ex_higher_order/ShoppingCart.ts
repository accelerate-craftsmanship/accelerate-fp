/**
 * Signature for a function that calculates a discounted price for a single item based on the price and amount of items.
 * @param {number} price for a single item
 * @param {number} amount of items in cart
 * @returns {number} discounted price for a single item
 */
export type DiscountFn = (price: number, amount: number) => number;

// TODO Implement identity discount function that returns the price without any discount
const identity: DiscountFn = undefined;

// TODO Implement combining two discount functions
function compose(discount1: DiscountFn, discount2: DiscountFn): DiscountFn {
    return undefined;
}

// TODO Implement various discount functions
export class DiscountCatalog {

    static gratis: DiscountFn = undefined;

    static tenPercent: DiscountFn = undefined;

    static everyThirdFree: DiscountFn = undefined;

}

export type SelectedProduct = { name: string; price: number; amount: number }

export class ShoppingCart {
    constructor(private readonly items: SelectedProduct[], private readonly discountFn: DiscountFn = identity) {
    }

    withDiscount(discountFn: DiscountFn): ShoppingCart {
        return new ShoppingCart(this.items, compose(this.discountFn, discountFn));
    }

    getTotal(): number {
        return this.items.reduce((total, item) => {
            const discountedPrice = this.discountFn ? this.discountFn(item.price, item.amount) : item.price;
            return total + item.amount * discountedPrice;
        }, 0);
    }
}
