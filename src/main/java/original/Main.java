package original;

import com.sun.source.util.SourcePositions;

public class Main {

    public static void main(String[] args) {
        ResultadoDeAnaliseNumeroCaracteres resultadoDeAnaliseNumeroCaracteres = new ResultadoDeAnaliseNumeroCaracteres("@@!!jabuTic4Ba");
        int bonusObtidoCaracteres = resultadoDeAnaliseNumeroCaracteres.obterBonus();
        System.out.println(bonusObtidoCaracteres);

        ResultadoDeAnaliseLetrasMaiusculas resultadoDeAnaliseLetrasMaiusculas = new ResultadoDeAnaliseLetrasMaiusculas("@@!!jabuTic4Ba");
        int bonusObtidoLetrasMaiusculas = resultadoDeAnaliseLetrasMaiusculas.obterBonus();
        System.out.println(bonusObtidoLetrasMaiusculas);

        ResultadoDeAnaliseLetrasMinusculas resultadoDeAnaliseLetrasMinusculas = new ResultadoDeAnaliseLetrasMinusculas("@@!!jabuTic4Ba");
        int bonusObtidoLetrasMinusculas = resultadoDeAnaliseLetrasMinusculas.obterBonus();
        System.out.println(bonusObtidoLetrasMinusculas);

        ResultadoDeAnaliseQuantidadeDeNumeros resultadoDeAnaliseQuantidadeDeNumeros = new ResultadoDeAnaliseQuantidadeDeNumeros("@@!!jabuTic4Ba");
        int bonusObtidoQuantidadeDeNumeros = resultadoDeAnaliseQuantidadeDeNumeros.obterBonus();
        System.out.println(bonusObtidoQuantidadeDeNumeros);

        ResultadoDeAnaliseSimbolos resultadoDeAnaliseSimbolos = new ResultadoDeAnaliseSimbolos("@@!!jabuTic4Ba");
        int bonusObtidoSimbolos = resultadoDeAnaliseSimbolos.obterBonus();
        System.out.println(bonusObtidoSimbolos);

        ResultadoDeAnaliseNumerosSimbolosNoMeio resultadoDeAnaliseNumerosSimbolosNoMeio = new ResultadoDeAnaliseNumerosSimbolosNoMeio("@@!!jabuTic4Ba");
        int bonusObtidoNumerosSimbolosMeio = resultadoDeAnaliseNumerosSimbolosNoMeio.obterBonus();
        System.out.println(bonusObtidoNumerosSimbolosMeio);

        ResultadoDeAnaliseLetrasSomente resultadoDeAnaliseLetrasSomente = new ResultadoDeAnaliseLetrasSomente("@@!!jabuTic4Ba");
        int bonusObtidoLetrasSomente = resultadoDeAnaliseLetrasSomente.obterBonus();
        System.out.println(bonusObtidoLetrasSomente);
    }



}
