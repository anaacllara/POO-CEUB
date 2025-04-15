public class ImcAnalise {

    public void analisarImc(Pessoa pessoa) {
        double imc = pessoa.calcularImcPessoa();
        if (imc < 18.2) {
            System.out.println("Você está com baixo peso. É recomendado procurar um médico para avaliação criteriosa do resultado. Pode indicar um estado de consumo do organismo, com poucas reservas riscos associados");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Você está com peso adequado.  Tudo indica que está tudo bem, mas é importante avaliar outros parâmetros da composição corporal, para compreender se estão dentro do recomendado. Algumas pessoas apresentam IMC dentro da normalidade, mas têm circunferência abdominal maior que a recomendada e/ou quantidade de massa gorda acima do ideal");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Você está com sobrepeso. . O sobrepeso está associado ao risco de doenças como diabetes e hipertensão. Então, atenção! Consulte um médico e reveja hábitos para reverter o quadro. Também é importante avaliar outros parâmetros, como a circunferência abdominal.");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Você está com obesidade grau I. É importante buscar orientação médica e nutricional para entender melhor o seu caso, mesmo que os exames (colesterol e glicemia, por exemplo) estejam normais.");
        } else if (imc>= 35 && imc <= 39.9) {
            System.out.println("Você está com obesidade grau II. Indica um quadro de obesidade mais evoluído em relação à classificação anterior e, mesmo com exames laboratoriais dentro da normalidade, não se deve atrasar a busca por orientação médica e nutricional.");
        } else if (imc >= 40) {
            System.out.println("Você está com obesidade grau III. Nesse ponto, a chance de já estarmos diante de outras doenças associadas é mais elevada. É fundamental buscar orientação médica.");
        } else {
            System.out.println("IMC fora das faixas analisadas. Consulte um médico para mais informações.");
        }
    }
}