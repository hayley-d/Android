package com.example.recordkeeperapp

class learingInterfaces {

}

//An interface is a template that can be applied to a class
//Classes can implement multiple interfaces

interface Prey{

    fun flee()

    fun getEaten()

    fun getName() : String
}

interface Preditor{

    fun eatPrey()

    fun hunt(prey : Prey)


}

class Rabbit : Prey{

    override fun flee() {
        println("The rabbit is fleeing!")
    }

    override fun getEaten() {
        println("The rabbit is dead.")
    }

    override fun getName(): String {
        return "Rabbit"
    }
}

class Hawk : Preditor{

    override fun hunt(prey : Prey) {
        println("The hawk is looking for the ${prey.getName()}")
    }

    override fun eatPrey() {
        println("The hawk is now full")
    }
}
