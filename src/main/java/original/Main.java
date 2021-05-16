package original;

public class Main {

    public static void main(String[] args) {
        ResultadoDeAnaliseNumeroCaracteres resultadoDeAnaliseNumeroCaracteres = new ResultadoDeAnaliseNumeroCaracteres("@@!!AAajabuTic4Ba");
        int bonusObtidoCaracteres = resultadoDeAnaliseNumeroCaracteres.obterBonus();
        System.out.println(bonusObtidoCaracteres);

        ResultadoDeAnaliseLetrasMaiusculas resultadoDeAnaliseLetrasMaiusculas = new ResultadoDeAnaliseLetrasMaiusculas("@@!!AAajabuTic4Ba");
        int bonusObtidoLetrasMaiusculas = resultadoDeAnaliseLetrasMaiusculas.obterBonus();
        System.out.println(bonusObtidoLetrasMaiusculas);

        ResultadoDeAnaliseLetrasMinusculas resultadoDeAnaliseLetrasMinusculas = new ResultadoDeAnaliseLetrasMinusculas("@@!!AAajabuTic4Ba");
        int bonusObtidoLetrasMinusculas = resultadoDeAnaliseLetrasMinusculas.obterBonus();
        System.out.println(bonusObtidoLetrasMinusculas);

        ResultadoDeAnaliseQuantidadeDeNumeros resultadoDeAnaliseQuantidadeDeNumeros = new ResultadoDeAnaliseQuantidadeDeNumeros("@@!!AAajabuTic4Ba");
        int bonusObtidoQuantidadeDeNumeros = resultadoDeAnaliseQuantidadeDeNumeros.obterBonus();
        System.out.println(bonusObtidoQuantidadeDeNumeros);

        ResultadoDeAnaliseSimbolos resultadoDeAnaliseSimbolos = new ResultadoDeAnaliseSimbolos("@@!!AAajabuTic4Ba");
        int bonusObtidoSimbolos = resultadoDeAnaliseSimbolos.obterBonus();
        System.out.println(bonusObtidoSimbolos);

        ResultadoDeAnaliseNumerosSimbolosNoMeio resultadoDeAnaliseNumerosSimbolosNoMeio = new ResultadoDeAnaliseNumerosSimbolosNoMeio("@@!!AAajabuTic4Baa");
        int bonusObtidoNumerosSimbolosMeio = resultadoDeAnaliseNumerosSimbolosNoMeio.obterBonus();
        System.out.println(bonusObtidoNumerosSimbolosMeio);

        ResultadoDeAnaliseLetrasSomente resultadoDeAnaliseLetrasSomente = new ResultadoDeAnaliseLetrasSomente("@@!!AAajabuTic4Ba");
        int bonusObtidoLetrasSomente = resultadoDeAnaliseLetrasSomente.obterBonus();
        System.out.println(bonusObtidoLetrasSomente);

        ResultadoDeAnaliseRequisitosCumpridos resultadoDeAnaliseRequisitosCumpridos = new ResultadoDeAnaliseRequisitosCumpridos("@@!!AAajabuTic4Ba");
        int bonusObtidoRequisitosCumpridos = resultadoDeAnaliseRequisitosCumpridos.obterBonus();
        System.out.println(bonusObtidoRequisitosCumpridos);

        ResultadoDeAnaliseNumerosSomente resultadoDeAnaliseNumerosSomente = new ResultadoDeAnaliseNumerosSomente("@@!!AAajabuTic4Ba");
        int bonusObtidoNumerosSomente = resultadoDeAnaliseNumerosSomente.obterBonus();
        System.out.println(bonusObtidoNumerosSomente);

        ResultadoDeAnaliseCaracteresConsecutivosInsensitive resultadoDeAnaliseCaracteresConsecutivosInsensitive = new ResultadoDeAnaliseCaracteresConsecutivosInsensitive("@@!!AAajabuTic4Ba");
        int bonusObtidoCaracteresConsecutivosInsensitive = resultadoDeAnaliseCaracteresConsecutivosInsensitive.obterBonus();
        System.out.println(bonusObtidoCaracteresConsecutivosInsensitive);

        ResultadoDeAnaliseCaracteresConsecutivosMaiusculos resultadoDeAnaliseCaracteresConsecutivosMaiusculos = new ResultadoDeAnaliseCaracteresConsecutivosMaiusculos("@@!!AAajabuTic4Ba");
        int bonusObtidoCaracteresConsecutivosMaisculos = resultadoDeAnaliseCaracteresConsecutivosMaiusculos.obterBonus();
        System.out.println(bonusObtidoCaracteresConsecutivosMaisculos);

        ResultadoDeAnaliseCaracteresConsecutivosMinusculos resultadoDeAnaliseCaracteresConsecutivosMinusculos = new ResultadoDeAnaliseCaracteresConsecutivosMinusculos("@@!!AAajabuTic4Ba");
        int bonusObtidoCaracteresConsecutivosMinusculos = resultadoDeAnaliseCaracteresConsecutivosMinusculos.obterBonus();
        System.out.println(bonusObtidoCaracteresConsecutivosMinusculos);

    }



}
