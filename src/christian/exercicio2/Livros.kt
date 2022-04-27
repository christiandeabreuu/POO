package christian.exercicio2

class Livros (var titulo: String, var qtdPaginas: Int, var paginasLidas: Int = 0){

    fun verificarProgresso(){
        val porcentagem = paginasLidas.toDouble() * 100 / qtdPaginas
        println("Você ja leu $porcentagem por cento do livro")
    }

}

