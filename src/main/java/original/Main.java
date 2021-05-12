package original;

public class Main {

    public static void main(String[] args) {
        ResultadoDeAnaliseNumeroCaracteres resultadoDeAnaliseNumeroCaracteres = new ResultadoDeAnaliseNumeroCaracteres("jabuticaba");
        int bonusObtidoCaracteres = resultadoDeAnaliseNumeroCaracteres.obterBonus();
        System.out.println(bonusObtidoCaracteres);


    }
}
