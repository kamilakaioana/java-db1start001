package original;

public class ResultadoDeAnaliseCaracteresSimbolosSequenciais extends ResultadoDeAnalise{

    private int contagem;
    private int bonus;
    private TipoEstado estado;

    public ResultadoDeAnaliseCaracteresSimbolosSequenciais(String senha) {
        super(senha);
        calcularResultado(senha);
        calcularEstado();
    }

    private void calcularEstado() {
        if(contagem > 0)
            estado = TipoEstado.ALERTA;
        else
            estado = TipoEstado.SUFICIENTE;
    }

    private void calcularResultado(String senha) {
        int multiplicador = 3;
        int quantidadeSequenciaSimbolos=
                ValidadorDeRequisitosCumpridos.obterQuantidadeDeSimbolosSequenciais(senha);

        contagem = quantidadeSequenciaSimbolos;
        bonus = contagem * multiplicador;
    }

    @Override
    int obterBonus() {
        return bonus;
    }

    @Override
    int obterContagem() {
        return contagem;
    }

    @Override
    TipoEstado obterEstado() {
        return estado;
    }

    @Override
    TipoOperacao obterTipoOperacao() {
        return TipoOperacao.INCREMENTADOR;
    }
}
