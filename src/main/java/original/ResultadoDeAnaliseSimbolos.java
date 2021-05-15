package original;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ResultadoDeAnaliseSimbolos extends ResultadoDeAnalise{
    private int contagem = senha.length();
    private int bonus;
    private TipoEstado estado;

    public int bonusSimbolo;

    public ResultadoDeAnaliseSimbolos(String senha) {
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


    public int contadorQuantidaDeSimbolos(String senha) {
        int contador = 0;
        Pattern padraoRegex = Pattern.compile("[^a-z0-9_]", Pattern.CASE_INSENSITIVE);

        for (char c: senha.toCharArray()) {
            Matcher resultadoRegex = padraoRegex.matcher(String.valueOf(c));
            if (resultadoRegex.find()) {
                contador++;
            }
        }
        return contador;
    }



    public void calcularResultado(String senha) {
            contadorQuantidaDeSimbolos(senha);
        int resultadoDosSimbolos = contadorQuantidaDeSimbolos(senha);

        if (resultadoDosSimbolos > 0) {
            int multiplicador = 6;

            bonus = bonus + resultadoDosSimbolos * multiplicador;
            bonusSimbolo = resultadoDosSimbolos * multiplicador;
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
