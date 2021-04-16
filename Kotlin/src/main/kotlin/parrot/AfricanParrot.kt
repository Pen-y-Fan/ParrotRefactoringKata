package parrot

import kotlin.math.max

class AfricanParrot(
    numberOfCoconuts: Int,
    ) : IParrotType {

    override val speed = max(0.0, baseSpeed - loadFactor * numberOfCoconuts)

    private val loadFactor: Double
        get() = 9.0

    private val baseSpeed: Double
        get() = 12.0
}