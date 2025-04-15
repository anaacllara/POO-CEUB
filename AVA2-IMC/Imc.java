public class Imc {
    //atributos da classe Imc
    private float pesoImc;
    private float alturaImc;
    private String nomeImc;
    private float resultadoImc;

    // construtor que recebe o objeto Pessoa 
    public Imc(Pessoa pessoa){
        this.nomeImc = pessoa.getNome();
        this.pesoImc = pessoa.getPeso();
        this.alturaImc = pessoa.getAltura();

        this.resultadoImc = calcularImc(this.pesoImc, this.alturaImc);
    }

    //método de calcular o IMC
    private float calcularImc(float peso, float altura){
        return peso/(float) (Math.pow(altura,2));
    }

    //analisar o IMC 
    private String analisarImc() {
        float imc = this.resultadoImc;
        String mensagem;
        if (imc < 18.2) {
            mensagem ="Você está com baixo peso. É recomendado procurar um médico para avaliação criteriosa do resultado. Pode indicar um estado de consumo do organismo, com poucas reservas riscos associados. ";
        } else if (imc >= 18.5 && imc <= 24.9) {
            mensagem ="Você está com peso adequado.  Tudo indica que está tudo bem, mas é importante avaliar outros parâmetros da composição corporal, para compreender se estão dentro do recomendado. Algumas pessoas apresentam IMC dentro da normalidade, mas têm circunferência abdominal maior que a recomendada e/ou quantidade de massa gorda acima do ideal. ";
        } else if (imc >= 25 && imc <= 29.9) {
            mensagem = "Você está com sobrepeso. . O sobrepeso está associado ao risco de doenças como diabetes e hipertensão. Então, atenção! Consulte um médico e reveja hábitos para reverter o quadro. Também é importante avaliar outros parâmetros, como a circunferência abdominal.";
        } else if (imc >= 30 && imc <= 34.9) {
            mensagem = "Você está com obesidade grau I. É importante buscar orientação médica e nutricional para entender melhor o seu caso, mesmo que os exames (colesterol e glicemia, por exemplo) estejam normais.";
        } else if (imc>= 35 && imc <= 39.9) {
            mensagem = "Você está com obesidade grau II. Indica um quadro de obesidade mais evoluído em relação à classificação anterior e, mesmo com exames laboratoriais dentro da normalidade, não se deve atrasar a busca por orientação médica e nutricional.";
        } else if (imc >= 40) {
            mensagem = "Você está com obesidade grau III. Nesse ponto, a chance de já estarmos diante de outras doenças associadas é mais elevada. É fundamental buscar orientação médica.";
        } else {
            mensagem = "IMC fora das faixas analisadas. Consulte um médico para mais informações.";
        }
        return mensagem;
    }

    //mostrar o IMC e a analise
    public void mostrarImc(){
        System.out.println("Nome: "+ this.nomeImc);
        System.out.println("Altura: "+ this.alturaImc);
        System.out.println("Peso: "+ this. pesoImc);
        System.out.println("IMC: "+ this.resultadoImc);

        System.out.println(analisarImc());
    }
}