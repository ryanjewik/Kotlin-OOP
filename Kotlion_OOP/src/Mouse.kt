class Mouse(_name:String = "The mouse"):Animal(_name) {
    override fun makeASound() {
        squeak()
    }
    private var CheeseAmount: Int = 0

    fun StealCheese(amount: Int){
        CheeseAmount = CheeseAmount + amount
        println("stole $amount cheese, new cheese amount: $CheeseAmount")
    }
    fun EatCheese(){
        if (CheeseAmount > 0){
            CheeseAmount--
            println("ate cheese, new cheese amount: $CheeseAmount")
        } else{
            println("no cheese available to eat")
        }
    }

    private fun squeak(){
        println("$animalName said 'squeak'!")
    }


}