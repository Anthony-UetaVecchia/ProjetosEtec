const decideNumero = (numero) => {
    if (numero >= 6) {
        return console.log("O número", numero, "é maior que 6")
    }else{
        return console.log("O número", numero, "é menor que 6")
    }
}

decideNumero(8)

let numeroDeFora = 16
decideNumero(numeroDeFora)