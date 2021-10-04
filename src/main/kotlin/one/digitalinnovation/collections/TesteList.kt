package one.digitalinnovation.collections

fun main () {
    val joao = Funcionario ("Joao", 2000.00, "CLT")
    val pedro = Funcionario ("Pedro", 1500.00, "PJ")
    val maria = Funcionario ("Maria", 4000.00, "CLT")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach{
        println(it)
    }

    println("***********")
    println(funcionarios.find { it.nome == "Maria" })

    println("***********")
    funcionarios.groupBy {
        it.tipoContratacao
    }.forEach{
        println(it)
    }
}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
    )
{
    override fun toString(): String =
        """
            Nome: $nome
            Salário: $salario
        """.trimIndent()
}