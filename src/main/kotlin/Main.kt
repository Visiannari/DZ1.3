fun main() {
        val amount = 1100
        val customer = true
        var discount = if (amount in 1001..9999) {
            amount - 100
        } else (if (amount > 10_000) {
            amount - (amount / 100 * 5)
        } else amount)

        var discountCustomer = if (customer)discount - discount * 1 / 100 else discount

        println("Стоимость покупки $discountCustomer руб.")
}
