package original;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ResultadoDeAnaliseNumerosSimbolosNoMeio extends ResultadoDeAnalise{
    private int contagem = senha.length();
    private int bonus;
    private TipoEstado estado;

    public int bonusSimboloNumerosNoMeio;

    public ResultadoDeAnaliseNumerosSimbolosNoMeio(String senha) {
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


    public int contadorQuantidaDeNumerosSimbolosNoMeio(String senha) {
        int contador = 0;
        String senhaSemPrimeiroUltimoDigito = senha.substring(1, senha.length()-1);

        Pattern padraoRegex = Pattern.compile("[^a-z_]", Pattern.CASE_INSENSITIVE);

        for (char c: senhaSemPrimeiroUltimoDigito.toCharArray()) {
            Matcher resultadoRegex = padraoRegex.matcher(String.valueOf(c));
            if (resultadoRegex.find()) {
                contador++;
            }
        }
        return contador;
    }



    public void calcularResultado(String senha) {
        contadorQuantidaDeNumerosSimbolosNoMeio(senha);
        int resultadoDosSimbolosNumerosMeio = contadorQuantidaDeNumerosSimbolosNoMeio(senha);

        if (resultadoDosSimbolosNumerosMeio > 0) {
            int multiplicador = 2;

            bonus = bonus + resultadoDosSimbolosNumerosMeio * multiplicador;
            bonusSimboloNumerosNoMeio = resultadoDosSimbolosNumerosMeio * multiplicador;
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
