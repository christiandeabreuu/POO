package christian.exercicio3

fun main() {

    var filme1: Filme = Filme()
    filme1.titulo = "Os Vingadores"
    filme1.duracaoMinutos = 142
    filme1.exibirDuracaoEmHoras()

    var filme2: Filme = Filme()
    filme2.titulo = "Hotel Transilvânia"
    filme2.duracaoMinutos = 93
    filme2.exibirDuracaoEmHoras()

    println("Os filmes em cartaz são ${filme1.titulo} e ${filme2.titulo}")

    val filmesNovos = ArrayList<Filme>()
    filmesNovos.add(Filme("Rocky", 121))
    filmesNovos.add(Filme("Dani e seu Camelo ", 101))
    filmesNovos.add(Filme("A Lista de Schindler", 181))
    filmesNovos.add(Filme("O Jogo da Imitação", 1421))
    filmesNovos.add(Filme("The God Father", 111))

    filmesNovos.forEach{
        it.exibirDuracaoEmHoras()
        println("${it.titulo} - título")
        println("${it.duracaoMinutos} minutos")
    }

}