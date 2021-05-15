package original;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ResultadoDeAnaliseLetrasSomente extends ResultadoDeAnalise{

    private int contagem = senha.length();
    private int bonus;
    private TipoEstado estado;

    public int bonusLetrasSomente;

    public ResultadoDeAnaliseLetrasSomente(String senha) {
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


    public boolean verificarExistenciaLetrasSomente(String senha) {
        boolean somenteLetras = true;

        Pattern padraoRegex = Pattern.compile("[^a-z_]", Pattern.CASE_INSENSITIVE);

        for (char c: senha.toCharArray()) {
            Matcher resultadoRegex = padraoRegex.matcher(String.valueOf(c));
            if (resultadoRegex.find()) {
                somenteLetras = false;
            }
        }
        return somenteLetras;
    }



    public void calcularResultado(String senha) {


        boolean resultadoSomenteLetras = verificarExistenciaLetrasSomente(senha);

        if ( resultadoSomenteLetras ) {
            bonus = bonus - contagem;
            bonusLetrasSomente = contagem;
        }
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
