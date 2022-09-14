fun main() {
    while (true) {
        val n = readLine()!!.toInt()
        if (n in 0..1000000) {
            println(fizzBuzz(n))
        } else {
            println("Limite Superado")
        }
    }
}

fun fizzBuzz(n: Int): String {
    val s: String = if (n % 5 == 0 && n % 3 == 0 && n != 0) {
        "fizzbuzz!"
    } else (if (n % 5 == 0 && n != 0) {
        "fizz!"
    } else if (n % 3 == 0 && n != 0) {
        "buzz!"
    } else {
        Letra(n)
    })
    return s
}

fun Letra(s: Int?): String {
    val resultado = StringBuilder()
    val numero = s!!
    val u = (numero % 1000)
    val m = (numero / 1000 % 1000)
    val mi = (numero / 1000000 % 1000)
    if (numero == 0) {
        resultado.append("Cero ")
        return resultado.toString()
    }


    if (mi == 1) {
        resultado.append("Millón ")
    }
    if (m > 0) {
        resultado.append(identificarDigitos(m).toString() + "Mil ")
    }
    if (u > 0) {
        resultado.append(identificarDigitos(u).toString())
    }
    return resultado.toString()
}

private fun identificarDigitos(n: Int): StringBuilder {
    val cadena = StringBuilder()
    val centenas = n / 100
    val decenas = n % 100 / 10
    val unidades = n % 10
    when (centenas) {
        0 -> {}
        1 -> if (decenas == 0 && unidades == 0) {
            cadena.append("Cien ")
            return cadena
        } else {
            cadena.append("Ciento ")
        }

        2 -> cadena.append("Doscientos ")
        3 -> cadena.append("Trescientos ")
        4 -> cadena.append("Cuatrocientos ")
        5 -> cadena.append("Quinientos ")
        6 -> cadena.append("Seiscientos ")
        7 -> cadena.append("Setecientos ")
        8 -> cadena.append("Ochocientos ")
        9 -> cadena.append("Novecientos ")
    }
    when (decenas) {
        0 -> {}
        1 -> when (unidades) {
            0 -> {
                cadena.append("Diez ")
                return cadena
            }

            1 -> {
                cadena.append("Once ")
                return cadena
            }

            2 -> {
                cadena.append("Doce ")
                return cadena
            }

            3 -> {
                cadena.append("Trece ")
                return cadena
            }

            4 -> {
                cadena.append("Catorce ")
                return cadena
            }

            5 -> {
                cadena.append("Quince ")
                return cadena
            }

            else -> {
                cadena.append("Dieci")
            }
        }

        2 -> if (unidades == 0) {
            cadena.append("Veinte ")
            return cadena
        } else {
            cadena.append("Veinti")
        }

        3 -> cadena.append("Treinta ")
        4 -> cadena.append("Cuarenta ")
        5 -> cadena.append("Cincuenta ")
        6 -> cadena.append("Sesenta ")
        7 -> cadena.append("Setenta ")
        8 -> cadena.append("Ochenta ")
        9 -> cadena.append("Noventa ")
    }
    if (decenas > 2 && unidades > 0) {
        cadena.append("y ")
    }
    when (unidades) {
        0 -> {}
        1 -> cadena.append("Un(o) ")
        2 -> cadena.append("Dos ")
        3 -> cadena.append("Tres ")
        4 -> cadena.append("Cuatro ")
        5 -> cadena.append("Cinco ")
        6 -> cadena.append("Seis ")
        7 -> cadena.append("Siete ")
        8 -> cadena.append("Ocho ")
        9 -> cadena.append("Nueve ")
    }
    return cadena
}