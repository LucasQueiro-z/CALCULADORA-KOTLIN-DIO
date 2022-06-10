fun main(){

    //***** MENU DO PROGRAMA *****\\

    println("******************")
    println("(1) - MENU MATEMATICA")
    println("(2) - Soma")
    println("(3) - Subtracao")
    println("(4) - Multiplicacao")
    println("(5) - Divisao")
    println("******************")

    //**** VALORES DE ENTRADA PARA TAL OPERAÇÃO****\\

    var numero1: Int = 2
    var numero2: Int = 2

    //**** ESCOLHA DE 1 - 4 *****\\

    var opcao: Int = 4

    when (opcao){
        1 -> println("Soma: ${numero1+numero2}")
        2 -> println("Subtracao: ${numero1-numero2}")
        3 -> println("Multiplicacao: ${numero1*numero2}")
        4 -> println("Divisao: ${numero1/numero2}")
        else -> {
            println("Valor Inválido")
            println("Escolha entre 1 e 5")
        }
    }
}