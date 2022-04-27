package christian.exercicio2

fun main() {

    var livroFavorito : Livros = Livros("O Pequeno princípe", 98)

    println("O livro ${livroFavorito.titulo} possui ${livroFavorito.qtdPaginas} páginas")
    livroFavorito.paginasLidas = 20
    println(" ${livroFavorito.paginasLidas} paginas lidas")

    livroFavorito.verificarProgresso()
    livroFavorito.paginasLidas = 50
    livroFavorito.verificarProgresso()

    var outrosLivros = ArrayList<Livros>()
    outrosLivros.add(livroFavorito)
    outrosLivros.add(Livros("Sapiens", 472,470))
    outrosLivros.add(Livros("Homo Deus", 450,50))
    outrosLivros.add(Livros("Sutil arte de ligar o foda-se", 222,))
    outrosLivros.add(Livros("Do mil ao milhão", 172,70))
    outrosLivros.add(Livros("As coisas que vc sabe quando desacelera", 122,10))
    outrosLivros.add(Livros("Tatuador de Auschwitz", 342,30))
    outrosLivros.add(Livros("Violetas na janela", 142))
    outrosLivros.add(Livros("Uma breve história do tempo", 700))
    outrosLivros.add(Livros("A menina que roubava livros", 230))

    outrosLivros.forEach{
        it.verificarProgresso()
        println(it.titulo)
        println("${it.qtdPaginas} qtd páginas ")
        println(" ${it.paginasLidas} páginas lidas")
    }
}

/*
Crie uma classe TestarLivros no mesmo pacote da classe Livros da questão
anterior. Essa classe possuirá apenas o método main que servirá para testar
a classe Livros. As seguintes ações devem ser realizadas:

- Crie um objeto livrofavorito do tipo Livro.
- Altere o atributo titulo para “O Pequeno Príncipe”
- Altere o atributo qtdPaginas para 98
- Escreva na tela a mensagem: “O livro X possui Y páginas”, onde no
lugar de X deverá aparecer o valor do atributo titulo e, no lugar de Y
deverá aparecer o valor do atributo qtdPaginas.
- Altere a quantidade de paginasLidas para 20
- Chame o método verificarProgresso
- Altere a quantidade de paginasLidas para 50;
- Chame o método verificarProgresso
- Instancie outros 10 livros no método main e chame os métodos
desenvolvidos, conforme o exemplo anterior.*/