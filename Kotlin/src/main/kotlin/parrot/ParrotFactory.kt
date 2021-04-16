package parrot

class ParrotFactory(
    type: ParrotTypeEnum,
    numberOfCoconuts: Int,
    voltage: Double,
    isNailed: Boolean
) {

    val parrotType: IParrotType = when (type) {
        ParrotTypeEnum.EUROPEAN -> EuropeanParrot()
        ParrotTypeEnum.AFRICAN -> AfricanParrot(numberOfCoconuts)
        ParrotTypeEnum.NORWEGIAN_BLUE -> NorwegianBlueParrot(voltage, isNailed)
    }
}
