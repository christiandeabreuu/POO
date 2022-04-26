fun main() {
    val novoFuncionario: Funcionario = Funcionario("Dani", "Camelo",10, 25.5)

    novoFuncionario.nomeCompleto()
    novoFuncionario.calcular()
    novoFuncionario.incrementarHoras(8)

    novoFuncionario.calcular()

    val funcionariosNovos = ArrayList<Funcionario>()
    funcionariosNovos.add(novoFuncionario)
    funcionariosNovos.add(Funcionario("Kate", "Linda", 100, 10.0))
    funcionariosNovos.add(Funcionario("Victor", "Carvalho", 120, 8.0))
    funcionariosNovos.add(Funcionario("Jessica", "Milena", 150, 12.0))
    funcionariosNovos.add(Funcionario("Carol", "Dias", 140, 9.0))
    funcionariosNovos.add(Funcionario("Theo", "Abreu", 140, 14.0))
    funcionariosNovos.add(Funcionario("Chrystal", "QuarentaDois", 70, 7.0))
    funcionariosNovos.add(Funcionario("Kim", "Kataguiri", 130, 13.6))
    funcionariosNovos.add(Funcionario("Allan", "Naza", 100, 10.0))

    funcionariosNovos.forEach{funcionario ->
        println(funcionario.nome)
        println(funcionario.sobrenome)
        println(funcionario.horasTrabalhadasMes)
        println(funcionario.valorHora)
        println(""" ---------------
         --------------------""".trimIndent())
    }




}