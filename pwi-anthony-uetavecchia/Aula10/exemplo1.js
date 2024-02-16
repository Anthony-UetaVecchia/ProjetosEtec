function somaNumeros (n1, n2) {
    return console.log ('resultado', n1 + n2)
}
somaNumeros(2, 3)
somaNumeros(50, 13)

function calculaMedia (nomeAluno, nota1, nota2, nota3) {
    let resultado = (nota1 + nota2 + nota3)/3
    return console.log('A nota do aluno ', nomeAluno, "é ", resultado.toFixed(2))
}

calculaMedia("Fabio", 2, 5, 6)

