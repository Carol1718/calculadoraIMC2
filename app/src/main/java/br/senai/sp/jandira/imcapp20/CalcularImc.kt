package br.senai.sp.jandira.imcapp20

fun calcularImc(peso: Double, altura: Double ) = peso / (altura * altura)
    fun obter_status(imc: Double): String {
        if (imc < 18.5) {
            return "Abaixo Peso"
        } else if (imc > 18.5 && imc < 25) {
            return "Peso ideal"
        } else if (imc >=25 && imc < 30) {
            return "Acima do peso"
        } else if(imc >= 30 && imc < 35) {
            return "Obesidade Grau I"
        } else if(imc >= 35 && imc < 40) {
            return "Obesidade Grau II"
        } else{
            return "Obesidade III"
        }
    }
