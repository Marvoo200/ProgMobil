/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
import kotlin.math.pow
const val PI = 3.1416F
const val PHI = 1.618F


fun main() {
    //val radio = 4
    //val area = circleArea(radio.toFloat())
    //val base = 2.0
    //val altura = 3.0
    //val ancho = 2.0

    //println("el area del circulo es: $area")

    //println(gethPi())
    //  printPHI()

    //val userValidated = login("Juanito","Navaja")
    //println("usuario loggeado? $userValidated")
    //println("Area con valores por defecto: ${rectangleArea(height = 2.0, base = 3.5)}")
    //println("El volumen del prisma es: ${volumenPrisma(base, altura, ancho)}")

    //imprimir ("Reemplazo del primer valor")
    //imprimir("Reemlazo del primer valor", "Reemplazo del segundo valor")

    //println("Promedio final: ${promedio(10.0)}") //error por falta del 3er parametro
    //println("Promedio final: ${promedio(10.0,10.0)}")//error por falta del 3er parametro
    //println("Promedio final: ${promedio(calif3 = 10.0)}")

    //verifyAge()
    //gradoEscolar()
    //tipoTriangulo()
    tipoDato(1)
}
fun circleArea(radio:Float): Float {
    return PI * radio.pow(2)
}

fun gethPi():Float{
    return PI
}
fun printPHI(){
    println("el numero áureo vale $PHI")
}

fun login(user: String, password:String) : Boolean{
    fun validate (input: String):Boolean{
        if(input.isEmpty()){
            return false
        }
        return true
    }

    val userValidated = validate(user)
    val passValidated = validate(password)

    return userValidated && passValidated
}

fun rectangleArea (base: Double = 20.0, height: Double= 30.0): Double{
    return base * height
}

fun volumenPrisma  (profundidad: Double = 1.0, base: Double, altura:Double):Double{
    return rectangleArea(base, altura)*profundidad
}

fun imprimir (
    valor : String = "este es el primer valor por defecto",
    valor2: String = "Este es el segundo valor por defecto"){
    println(valor)
    println(valor2)
}


fun promedio (calif: Double = 8.0, calif2 : Double = 8.0, calif3: Double ): Double{
    return (calif + calif2 + calif3)/3.0
}

fun verifyAge(){
    print("Ingresa edad y presiona enter(escribe solo el númmero): ")
    val age = readLine()?.toInt()
    if(age == 18){
        println("Ya eres mayor de edad!!")
    }

    if(age?.equals(18)!!){
      println("Ya eres mayor de edad!!")
    }
    if(age!! >= 18){
        println("Ya eres mayor de edad!!")
    }
}

fun gradoEscolar(){
    print("Ingresa edad y presiona enter (escribe solo número): ")
    val age = readLine()?.toInt()
    when (age){
        0 -> println("Apenas eres recién nacido!")
        1 -> println("Solo tienes un año de edad")
        in 2..5 -> println("Estas en preescolar")
        in 6..11 -> println("Estas en la primaria")
        in 12..14 -> println("Estas en secundaria")
        in 15..17 -> println("Estas en bachillerato")
        in 18..25 -> println("Estas en la universidad")
        else -> {
            println("Edad inválida")
            println("Vuelve a correr el código")
        }
    }


}

fun tipoTriangulo(){
    print("Ingresa l1 y presiona enter (escribe solo número): ")
    val l1 = readLine()?.toFloat()
    print("Ingresa l2 y presiona enter (escribe solo número): ")
    val l2 = readLine()?.toFloat()
    print("Ingresa l3 y presiona enter (escribe solo número): ")
    val l3 = readLine()?.toFloat()

    if(l1 == l2 && l1 == l3) {
        println("es un triángulo equilatero")
    }else if (l1 == l2 || l2== l3 || l3 == l1){
        println("Es un triángulo Isóceles")
    }else{
        println("Es un triángulo Escaleno")
    }
}

fun tipoDato(var1: Any){

    when (var1::class.simpleName){
        "String" -> println("es String")
        "Int" -> println("es Int")
        "Double" -> println("es Double")
        else -> println("es otro tipo de dato")

    }
}
//66180374374



//hacer validaciones para redondear de .5 sube siempre que sea  mayor a 6, si no que sea para abajo y de 5 a menos no se hace redondeo hacia arriba