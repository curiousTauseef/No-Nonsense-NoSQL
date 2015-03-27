package org.gr8ladies

class Cart {
    String userSession

    static hasMany = [cartItems: CartItem]

    static constraints = {
    }

    Integer getSize() {
        this.cartItems?.size() ?: 0
    }

    BigDecimal getTotalPrice() {
        BigDecimal sum = cartItems?.sum { item ->
            item.priceQuantityRelation.unitPrice * item.priceQuantityRelation.quantity
        }
        sum ? sum.setScale(2) : 0.00
    }
}