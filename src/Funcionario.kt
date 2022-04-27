class Funcionario (var nome: String,
                   var sobrenome: String,
                   var horasTrabalhadasMes: Int,
                   var valorHora: Double){


    fun nomeCompleto(){
        println("Nome do funcionário é $nome $sobrenome")
    }
    fun calcular(){
        println("O funcionário $nome vai receber no mês R$ ${horasTrabalhadasMes * valorHora} reais")
    }
    fun incrementarHoras(horasExtras: Int){
        horasTrabalhadasMes += horasExtras
        println(horasTrabalhadasMes)
    }

}