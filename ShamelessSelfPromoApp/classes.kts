class Developer{
    var happy : Boolean = false
    var name : String? = null
    var jobTitle : String? = null
    var yearsOfExperience: Int? = null

    fun tellAJoke(){
        println("I'd tell you a joke about UDP but I'm afraid you won't get it.")
    }

    fun introduce(name : String)
    {
        println("Hi I'm $name and I like sloths.")
    }

    //Override annotation is inline
    override fun toString(): String {
        return "I am a developer called $name and I have $yearsOfExperience years of coding experience!"
    }
}

//Do not need the new keyword
val obj = Developer()

//This is a class with a constructor
//These values cannot be null unless specified using the ?
class Programmer(var name:String, private var happy:Boolean,var age:Int){

    fun tellAJoke(){
        println("I'd tell you a joke about UDP but I'm afraid you won't get it.")
    }

    fun introduce(name : String)
    {
        println("Hi I'm $name and I like sloths.")
    }
}

val obj2 = Programmer("Dave",false,25)