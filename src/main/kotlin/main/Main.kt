package main

import java.util.*
import kotlin.system.exitProcess

fun main() {
    do {
        println("Aplikasi Pembulatan Nilai")
        println("=====")
        print("Masukkan angka desimal dari 0-1: ")
        val inputDesimal = readLine()?.toDouble()
        val resultPembulatan = PembulatanBilangan()
        resultPembulatan.inputAngka = inputDesimal!!
        println("Hasil pembulatan dari angka $inputDesimal adalah ${resultPembulatan.inputAngka}")
        print("\nApakah ingin mencoba lagi(y/n)? ")
        val scanner = Scanner(System.`in`)
        val decision = scanner.next().single()
        print("\n")
    } while (decision == 'y' || decision == 'Y')
}

class PembulatanBilangan {
    var inputAngka: Double = 0.0
        get() = field
        set(value) {
            field =
                if (value < 0.0 || value > 1.0) {
                    print("invalid input")
                    exitProcess(0)
                } else if (value in 0.0..0.4) {
                    0.0
                } else if (value in 0.5..1.0) {
                    1.0
                } else {
                    print("invalid input")
                    exitProcess(0)
                }
        }
}