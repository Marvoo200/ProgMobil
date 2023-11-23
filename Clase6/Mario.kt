package clases
import java.util.*
import kotlin.concurrent.schedule
class Mario(var vidas : Int = 3) {
    init {
        println("It's a me, Mario!")
    }
    private var state = "Small"
        set(value) {
            val before = field
            field = value
            println("Tu estado ahora es $field")
            if (value == "Star"){
                Timer("SettingUp", false).schedule(10000){
                    field= before
                    println("Tu esstado ahora es $field")
                }
            }
        }
        //set(value){

          //  field = value
        //}

        get() = field
    private var lives = 3

        set (value){
            if (field == 1){
                field = 0
                gameOver()
            }else if(field == 0){

                println("Necesitas volver a jugar")
            }else{
                field=value
            }
        }
    val isAlive: Boolean
        get() {
            return lives>=1
        }

    //private fun die (){
      //  lives--
        //println("Has perdido una vida")
    //}
    public fun collision(collisionObj : String){
        when(collisionObj){
            "Goomba" -> lives--
            "Super Mushroom" -> state = "Super mario"
            "Fire Flower" -> state ="Fire mario"
            "Star" -> state = "Star"
            else -> println("Objeto desconociddo, no pasa nadda")
        }
    }
    fun getlives():String{
        return "$lives vidas"
    }
    fun gameOver(){
        println("Juego Terminado")
    }

}