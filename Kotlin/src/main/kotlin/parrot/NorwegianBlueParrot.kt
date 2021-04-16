package parrot

import kotlin.math.min

class NorwegianBlueParrot(
    voltage: Double,
    isNailed: Boolean
    ) : IParrotType {

    override val speed = if (isNailed) 0.0 else getBaseSpeed(voltage)

    private val baseSpeed: Double
        get() = 12.0

    private fun getBaseSpeed(voltage: Double): Double = min(24.0, voltage * baseSpeed)
}