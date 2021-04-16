package parrot

open class Parrot(
    type: ParrotTypeEnum,
    numberOfCoconuts: Int,
    voltage: Double,
    isNailed: Boolean,
) {
    val speed = ParrotFactory(type, numberOfCoconuts, voltage, isNailed).parrotType.speed
}
