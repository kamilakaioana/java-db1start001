package original;

import com.sun.source.util.SourcePositions;

public class Main {

    public static void main(String[] args) {
        ResultadoDeAnaliseNumeroCaracteres resultadoDeAnaliseNumeroCaracteres = new ResultadoDeAnaliseNumeroCaracteres("jabuTicaBa");
        int bonusObtidoCaracteres = resultadoDeAnaliseNumeroCaracteres.obterBonus();
        System.out.println(bonusObtidoCaracteres);

        ResultadoDeAnaliseLetrasMaiusculas resultadoDeAnaliseLetrasMaiusculas = new ResultadoDeAnaliseLetrasMaiusculas("jabuTicaBa");
        int bonusObtidoLetrasMaiusculas = resultadoDeAnaliseLetrasMaiusculas.obterBonus();
        System.out.println(bonusObtidoLetrasMaiusculas);

        ResultadoDeAnaliseLetrasMinusculas resultadoDeAnaliseLetrasMinusculas = new ResultadoDeAnaliseLetrasMinusculas("jabuTicaBa");
        int bonusObtidoLetrasMinusculas = resultadoDeAnaliseLetrasMinusculas.obterBonus();
        System.out.println(bonusObtidoLetrasMinusculas);

        ResultadoDeAnaliseQuantidadeDeNumeros resultadoDeAnaliseQuantidadeDeNumeros = new ResultadoDeAnaliseQuantidadeDeNumeros("jabuTicaBa");
        int bonusObtidoQuantidadeDeNumeros = resultadoDeAnaliseQuantidadeDeNumeros.obterBonus();
        System.out.println(bonusObtidoQuantidadeDeNumeros);
    }



}
