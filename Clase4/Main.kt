import clases.Koopa
import clases.Mario
import clases.Vehiculo

fun main(){

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
     */
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
    koopa.co("Weapon")

}