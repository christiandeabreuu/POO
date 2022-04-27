package christian.exercicio3

class Filme(var titulo: String = "", var duracaoMinutos: Int = 0) {

    fun exibirDuracaoEmHoras(){
        var horas = duracaoMinutos / 60
        var minutos = duracaoMinutos % 60
        println("O filme $titulo possui $horas horas e $minutos minutos de duração")
    }
}