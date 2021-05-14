package original;

import com.sun.source.util.SourcePositions;

public class Main {

    public static void main(String[] args) {
        ResultadoDeAnaliseNumeroCaracteres resultadoDeAnaliseNumeroCaracteres = new ResultadoDeAnaliseNumeroCaracteres("jabuTicaba");
        int bonusObtidoCaracteres = resultadoDeAnaliseNumeroCaracteres.obterBonus();
        System.out.println(bonusObtidoCaracteres);

        ResultadoDeAnaliseLetrasMaiusculas resultadoDeAnaliseLetrasMaiusculas = new ResultadoDeAnaliseLetrasMaiusculas("jabuTicaba");
        int bonusObtidoLetrasMaiusculas = resultadoDeAnaliseLetrasMaiusculas.obterBonus();
        System.out.println(bonusObtidoLetrasMaiusculas);

        ResultadoDeAnaliseLetrasMinusculas resultadoDeAnaliseLetrasMinusculas = new ResultadoDeAnaliseLetrasMinusculas("jabuTicaba");
        int bonusObtidoLetrasMinusculas = resultadoDeAnaliseLetrasMinusculas.obterBonus();
        System.out.println(bonusObtidoLetrasMinusculas);
    }



}
