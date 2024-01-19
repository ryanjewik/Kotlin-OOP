//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val myDog:Dog = Dog("Hachiko")
    myDog.move("forward")
    myDog.makeASound()

    val myCat:Cat = Cat("Tom")
    moveAndMakeASound(myCat)

    val myMouse:Mouse = Mouse("Jerry")
    moveAndMakeASound(myMouse)
    myMouse.EatCheese()
    myMouse.StealCheese(2)
    myMouse.StealCheese(10)
    myMouse.EatCheese()
}

fun moveAndMakeASound(animal:Animal){
    animal.move("forward")
    animal.makeASound()
}