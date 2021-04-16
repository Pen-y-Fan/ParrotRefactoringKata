package parrot

class EuropeanParrot : IParrotType {

    override val speed = baseSpeed

    private val baseSpeed: Double
        get() = 12.0
}