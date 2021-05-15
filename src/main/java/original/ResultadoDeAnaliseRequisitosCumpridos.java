package original;

public class ResultadoDeAnaliseRequisitosCumpridos extends ResultadoDeAnalise{
    private int contagem = senha.length();
    private int bonus;
    private TipoEstado estado;

    public ResultadoDeAnaliseRequisitosCumpridos(String senha) {
        super(senha);
        calcularResultado(senha);
        calcularEstado();
    }

    private void calcularEstado() {

        if (contagem ==4 && senha.length() >=8)
            estado = TipoEstado.SUFICIENTE;
        else if (contagem >4 && senha.length() >=8)
            estado = TipoEstado.EXCELENTE;
        else
            estado = TipoEstado.FALHA;
    }

    private void calcularRequerimentos(String senha){
        int contagem = 0;

        if (ValidadorDeRequisitosCumpridos.obterQuantidadeDeLetrasMinusculas(senha) > 0)
            contagem += 1;
        if (ValidadorDeRequisitosCumpridos.obterQuantidadeDeLetrasMaisculas(senha) > 0)
            contagem += 1;
        if (ValidadorDeRequisitosCumpridos.obterQuantidadeDeNumeros(senha) > 0)
            contagem += 1;
        if (ValidadorDeRequisitosCumpridos.obterQuantidadeDeSimbolos(senha) > 0)
            contagem += 1;
        this.contagem = contagem;
    }

    private void calcularResultado(String senha) {
     //+(n*2)
        int multiplicador = 2;
        calcularRequerimentos(senha);

        if (senha.length() >= 8){
            contagem +=1;
            if (contagem >= 4){

                bonus = contagem * multiplicador;
            }
        } else
            bonus = 0;
    }

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

