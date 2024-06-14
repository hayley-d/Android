//Functions start with the keyword fun
// do not need to specify void if a void
fun foo(){
    println("Foo!")
}

foo()

fun greet(name: String)
{
    println("Hi $name!")
}

greet("Hayley")

fun birthdayCake(name: String, age :Int)
{
    println("Happy Birthday $name!!\nNow blow out your $age candels!")
}

//To specify the return type the function return type comes just before the function body
fun product(a:Int, b:Int) :Int {
    return a*b
}

fun add(a:Int,b:Int) :Int {
    return a+b
}

//Function expression
fun addition(a:Int,b:Int) :Int = a+b

//Can infer the return type
fun square (a:Int) = a*a