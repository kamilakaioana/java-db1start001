package original;

public class ResultadoDeAnaliseQuantidadeDeNumeros extends ResultadoDeAnalise{
    private int contagem = senha.length();
    private int bonus;
    private TipoEstado estado;
    public int bonusNumeros;



    public ResultadoDeAnaliseQuantidadeDeNumeros(String senha) {
        super(senha);
        calcularResultado(senha);
        calcularEstado();
    }
    private void calcularEstado() {
        contagem = senha.length();
        if (contagem < 1)
            estado = TipoEstado.FALHA;
        else if (contagem == 1)
            estado = TipoEstado.SUFICIENTE;
        else estado = TipoEstado.EXCELENTE;
    }



    public int contadorQuantidadeDeNumeros(String senha) {
        int contador = 0;

        for (int i = 0; i < senha.length(); i++) {
            int numeroNaTabelaASCII = Character.getNumericValue(senha.charAt(i));
            if (numeroNaTabelaASCII >= 0 && numeroNaTabelaASCII <= 9) {

                contador++;
            }
        }
        return contador;
    }

    //terminar o metodos
    public void calcularResultado(String senha) {
        int resultadoDosNumeros = contadorQuantidadeDeNumeros(senha);

            if (resultadoDosNumeros > 0 && resultadoDosNumeros < contagem) {
                int multiplicador = 4;

                bonus = bonus + resultadoDosNumeros * multiplicador;
                bonusNumeros = resultadoDosNumeros * multiplicador;
            }

    }




//
//        if (countNumber > 0 && countNumber < countLength) {
//            int multiplierNumber = 4;
//            score = score + countNumber * multiplierNumber;
//            bonusNumber = countNumber * multiplierNumber;


    @Override
    int obterBonus () {
        return bonus;
    }

    @Override
    int obterContagem () {
        return contagem;
    }

    @Override
    TipoEstado obterEstado () {
        return estado;
    }

    @Override
    TipoOperacao obterTipoOperacao () {
        return TipoOperacao.INCREMENTADOR;
    }

}
