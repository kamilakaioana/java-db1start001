package original;

public class ResultadoDeAnaliseQuantidadeDeNumeros extends ResultadoDeAnalise{
    private int contagem = senha.length();
    private int bonus;
    private TipoEstado estado;



    public ResultadoDeAnaliseQuantidadeDeNumeros(String senha) {
        super(senha);
      //  calcularResultado(senha);
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

    //terminar o metodos



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
