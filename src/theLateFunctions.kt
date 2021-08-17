fun main() {
    var angka1: Int? = 0
    angka1?.let { Int
        println(angka1.plus(3))
    }

    var angka2: Int? = 3
    angka2?.let { Int
        println(angka2.plus(5))
    }

    var angka3: Int? = 5
    angka3?.let { Int
        println(angka3.plus(15))
    }

    var angka4: Int? = 15
    angka4?.let { Int
        println(angka4.minus(5))
    }

    var angka5: Int? = 5
    angka5?.let { Int
        println(angka5.minus(3))
    }

    var angka6: Int? = 3
    angka6?.let { Int
        println(angka6.minus(0))
    }

    var angka7: Int? = 0
    angka7?.let { Int
        println(angka7.times(3))
    }

    var angka8: Int? = 3
    angka8?.let { Int
        println(angka8.times(5))
    }

    var angka9: Int? = 5
    angka9?.let { Int
        println(angka9.times(15))
    }

    var angka10: Int? = 15
    angka10?.let { Int
        println(angka10.div(5))
    }
}