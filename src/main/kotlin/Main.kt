fun main() {
    val inPenny = 100
    val percent = 0.0075
    val minCommission = 35

    var commission:Double

    var amount:Double = 100_000_000.0

    if (amount * percent < minCommission * inPenny) {
        commission = minCommission.toDouble() * inPenny
        amount -= commission
    } else {
        commission = amount * percent
        amount = amount - commission
    }

    println("Коммисия: $commission, сумма перевода :$amount")
}