package clases

open class Enemy (val name: String, strength: Int): Any() {
    protected var direction: String = "LEFT"

    protected fun changeDirection(){
        direction = if (direction=="RIGHT") "LEFT" else "RIGHT"
        println("$name va en dirección $direction")
    }
    protected fun die(){
        println("$name ha muerto")
    }
    open fun collision(collider : String){
        when(collider){
            "Weapon" -> die()
            "Enemy" -> changeDirection()
        }
    }

}