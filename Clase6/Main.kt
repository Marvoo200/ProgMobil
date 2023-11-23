import clases.*

fun main() {

    /*
    val miVehiculo = Vehiculo()

    miVehiculo.color = "Verde"
    miVehiculo.marca= "Ford"
    miVehiculo.modelo = "Focus"
    miVehiculo.placa = "REM-4143"
    println("El vehulo está encendido? ${miVehiculo.encendido}")
    miVehiculo.encender()
    println("El coche está encendido? ${miVehiculo.encendido}")
    println("El tanque tiene ${miVehiculo.gasolina}")
    miVehiculo.recargar(20.07f)
    println("El tanque tiene ${miVehiculo.gasolina}")

    var mario = Mario()
    mario.collision("Super Mushroom")
    mario.collision("Star")
    for (i in 1..5){
        if (mario.isAlive){
            mario.collision("Goomba")
            println("Te quedan ${mario.getlives()}")
        }

    }
    var koppa = Koopa()
    koppa.collision("Weapon")

     */
    //no se puede crear travel, porque es anstracta

/*
    val viajeMonterrey = National("Monterrey")
    viajeMonterrey.quotePrice(4)
    viajeMonterrey.reserve(4)

    val viajeMonterreyconDescuento = NationalLowSeason("Monterrey")
    viajeMonterreyconDescuento.reserve(4)
    */

    val scaryMovie = Movie("Scary Movie", "Comedia", 88.27)
    //println(scaryMovie)
    //println(scaryMovie.name)
    scaryMovie.createdAt = "2000"
    //println(scaryMovie.createdAt)

    //desestructuración

    val (name2, gender2, duration2) = scaryMovie

    //println("nuevas variables $name2 $gender2 $duration2")
/*
    val scaryMovie2 = scaryMovie.copy(name = "Scary Movie 2", duration = 83.0)
    println("""
        Scary Movie: $scaryMovie
        Scary Movie2: $scaryMovie2
        
    """.trimIndent())
    */
    val vehicleInstance = Vehicle.create()


    // funciones literales
    /*
    var saludo = { println("Holiwisss")}() //los parentesis sirven para su ejecución inmediata
    var a = 5
    var b = 10
    var suma = { println("La suma es: ${a+b}")}()
*/
    //expresiones lambda se utilizan mucho para matemáticas

    val suma ={a:Int, b:Int -> a+b}
    println(suma(2,5))

    val presentarse: (String,Int) -> String ={name, age -> "Me llamo $name y tengo $age"}
    println(presentarse("Marvin", 20))


    //función lambda para el ahorro

    val guardadito : (Double, Double) -> String ={ esperado, ahorro ->
        val porcentaje = ahorro/esperado

        when{
            porcentaje > 1 -> "Ahorrador pro"
            porcentaje == 1.0 -> "Buen ahorrador"
            porcentaje < 1.0 && porcentaje >= 0.8 -> "Almost"
            else -> "aprendiz ahorrador"
        }

    }

    println(guardadito(100.0,120.0))

    // funcion anonima
    //no deben ser complicadas
    val guardadito2 = fun(esperado: Double, guardado: Double): String{
        val porcentaje = guardado/esperado

        return when{
            porcentaje > 1 -> "Ahorrador pro"
            porcentaje == 1.0 -> "Buen ahorrador"
            porcentaje < 1.0 && porcentaje >= 0.8 -> "Almost"
            else -> "aprendiz ahorrador"
        }
    }

    println(guardadito(100.0,70.0))

    //la clase abstracta no lleva {}

    //ordenes de función superior

    fun sumaOrdenSuperior (a:Int, b:Int, suma: (Int,Int) -> Int): Int{
        return suma(a,b)

    }

    println(sumaOrdenSuperior(4,5, suma))


}

