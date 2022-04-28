
class Pessoa(private var nome: String,
                 var diaNasc: Int,
                 var mesNasc: Int,
                 var anoNasc : Int,
                 var idade: Int = 0 ){

        val diaHoje = 28
        val mesHoje = 4
        val anoHoje = 2022

        init {
            calcularIdade()
        }

        fun calcularIdade(): Int{
            idade = if(mesNasc < mesHoje){
                anoHoje - anoNasc
            }else if(mesNasc == mesHoje && diaNasc <= diaHoje){
                anoHoje - anoNasc
            }else{
                anoHoje - anoNasc - 1
            }
            return idade
        }
        fun informarIdade(){
            println("A idade da pessoa é: $idade anos")
        }
        fun informarNome(){
            println("O nome da pessoa é: $nome")
        }
        fun ajustarDataNascimento(dia: Int, mes: Int, ano: Int){
            diaNasc = dia
            mesNasc = mes
            anoNasc = ano
        }
}
