package original;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ResultadoDeAnaliseNumerosSomente extends ResultadoDeAnalise {
    private int contagem = senha.length();
    private int bonus;
    private TipoEstado estado;

    public int bonusNumerosSomente;

    public ResultadoDeAnaliseNumerosSomente(String senha) {
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


    public boolean verificarExistenciaNumerosSomente(String senha) {
        boolean somenteNumeros = true;

        Pattern padraoRegex = Pattern.compile("[^0-9_]", Pattern.CASE_INSENSITIVE);

        for (char c: senha.toCharArray()) {
            Matcher resultadoRegex = padraoRegex.matcher(String.valueOf(c));
            if (resultadoRegex.find()) {
                somenteNumeros = false;
            }
        }
        return somenteNumeros;
    }



    public void calcularResultado(String senha) {


        boolean resultadoSomenteLetras = verificarExistenciaNumerosSomente(senha);

        if ( resultadoSomenteLetras ) {
            bonus = bonus - contagem;
            bonusNumerosSomente = contagem;
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
