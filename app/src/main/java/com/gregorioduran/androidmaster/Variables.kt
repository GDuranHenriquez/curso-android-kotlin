package com.gregorioduran.androidmaster

//Int
val age:Int = 30
val name = "Gregorio"
val seconsInit:Long = 30

//variables
fun main(){
    showMyName()
    showInfoUser("Gregorio", 29)
    add(2f ,4f)
}

fun add(a:Float, b:Float){
    println(a + b)
}

fun showMyName(){
    println("Gregorio Duran")
}

fun showInfoUser(name: String, currentAge:Int){
    println("Hola me llamo $name y tengo $currentAge")
}

fun variablesNumericas(){
    //Numericas ========================

    //tipar la variable

    //Long
    val seconsInit2:Long = 30
    //float
    val temp:Float = 30.2f
    //Double
    val doubleExpample:Double = 3.144126556


    //operaciones
    val suma:Double = age + doubleExpample
    val restar:Double= age - doubleExpample
    val producto:Double = age * doubleExpample
    val division:Double = age / doubleExpample
    val resto:Int = age % 2

    //cambio de tipo
    var intPlussDouble:Int = age + doubleExpample.toInt()

}

fun variablesBoolean(){
    //boolean
    val booleanExample:Boolean = true
    val booleanExample2:Boolean = false
    val booleanExample3:Boolean = seconsInit < 40
    //Los val no pueden ser reaccinado.
}

fun variablesString () {
    print("Hola")
    //creando variable

    //string
//    val stringExample:String = "Gregorio Duran"

    //Las var si se pueden reaccinar.
    var newVar = 30
    newVar = 21

    //AlfaNumericas ========================
    //Char
    val charExamlpe1:Char = 'M'
    val charExamlpe2:Char = '2'
    val charExamlpe3:Char = '@'

    //Suma de tring
    val sumString:String = charExamlpe1.toString() + charExamlpe2.toString()

    //Concatenar
    var stringConcatenada:String = "Hola"
    println(stringConcatenada)
    stringConcatenada = stringConcatenada + " me llamo " + name
    println(stringConcatenada)
    stringConcatenada = "Hola me llamo $name y tengo $age"
    println(stringConcatenada)
}