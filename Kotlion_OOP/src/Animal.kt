abstract class Animal(_name:String = "The animal"):iAnimal {
    override fun move(direction:String){
        println("$animalName moves $direction")
    }
    abstract override fun makeASound()
    val animalName = _name
}