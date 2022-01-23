import java.lang.Math.sqrt
import java.util.logging.Level
import java.util.logging.LogManager

val l = LogManager.getLogManager().getLogger("").apply { level = Level.ALL }
open class Figura {
    open protected var tamanioLado: Double= 0.0
    open protected var diagonal: Double= 0.0
    open protected var perimetro: Double= 0.0
    open protected var area: Double= 0.0
    open fun cDiagonal(){

    }
    open fun cPerimetro(){

    }
    open fun cArea(){

    }
}

class Cuadrado (tamanioLado: Double): Figura() {
    override fun cDiagonal() {
        this.diagonal= tamanioLado*sqrt(2.0)
    }
    override fun cPerimetro() {
        this.perimetro= 4*tamanioLado
    }
    override fun cArea() {
        this.area= tamanioLado*tamanioLado
    }
}
class TrianguloEquilatero (tamanioLado: Double): Figura() {
    override fun cPerimetro() {
        this.perimetro= 3*tamanioLado
    }
    override fun cArea() {
        this.area= (sqrt(3.0)/4)*(tamanioLado*tamanioLado)
    }
}
fun main() {
    var cuadrado1: Cuadrado= Cuadrado(20.0)
    var figura1: Figura= cuadrado1
    l.info ( ""+figura1)
}
//c) Di que tipo de herencia es: (Especialización, Extensión, Especificación, Construcción).
//Especialización porque se especializa la información del cuadrado respecto la figura
//ya que figura tiene un comportamiento básico y cuadrado lo especializa según sus características.
//d) ¿Quién es la superclase y subclase?
// la superclase es figura y las subclases son cuadrado y trianguloequilatero
//e) ¿Existe otra forma de implementarlo que no sea a través de la herencia?
// Mediante interfaces.
//f) Piensa y comenta qué ventajas aporta esta implementación de herencia, con respecto a otra.
// La interfaz permite dar unas funciones o características que la pueda utilizar cualquier clase,
// en cambio la herencia es para que haya una jerarquía de reutilización de propiedades y métodos de la clase