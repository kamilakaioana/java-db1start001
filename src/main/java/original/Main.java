package original;

public class Main {

    public static void main(String[] args) {
        ResultadoDeAnaliseNumeroCaracteres resultadoDeAnaliseNumeroCaracteres = new ResultadoDeAnaliseNumeroCaracteres("@@!!AAabcjabuTic4Ba");
        int bonusObtidoCaracteres = resultadoDeAnaliseNumeroCaracteres.obterBonus();
        System.out.println(bonusObtidoCaracteres);

        ResultadoDeAnaliseLetrasMaiusculas resultadoDeAnaliseLetrasMaiusculas = new ResultadoDeAnaliseLetrasMaiusculas("@@!!AAabcjabuTic4Ba");
        int bonusObtidoLetrasMaiusculas = resultadoDeAnaliseLetrasMaiusculas.obterBonus();
        System.out.println(bonusObtidoLetrasMaiusculas);

        ResultadoDeAnaliseLetrasMinusculas resultadoDeAnaliseLetrasMinusculas = new ResultadoDeAnaliseLetrasMinusculas("@@!!AAabcjabuTic4Ba");
        int bonusObtidoLetrasMinusculas = resultadoDeAnaliseLetrasMinusculas.obterBonus();
        System.out.println(bonusObtidoLetrasMinusculas);

        ResultadoDeAnaliseQuantidadeDeNumeros resultadoDeAnaliseQuantidadeDeNumeros = new ResultadoDeAnaliseQuantidadeDeNumeros("@@!!AAabcjabuTic4Ba");
        int bonusObtidoQuantidadeDeNumeros = resultadoDeAnaliseQuantidadeDeNumeros.obterBonus();
        System.out.println(bonusObtidoQuantidadeDeNumeros);

        ResultadoDeAnaliseSimbolos resultadoDeAnaliseSimbolos = new ResultadoDeAnaliseSimbolos("@@!!AAabcjabuTic4Ba");
        int bonusObtidoSimbolos = resultadoDeAnaliseSimbolos.obterBonus();
        System.out.println(bonusObtidoSimbolos);

        ResultadoDeAnaliseNumerosSimbolosNoMeio resultadoDeAnaliseNumerosSimbolosNoMeio = new ResultadoDeAnaliseNumerosSimbolosNoMeio("@@!!AAabcjabuTic4Ba");
        int bonusObtidoNumerosSimbolosMeio = resultadoDeAnaliseNumerosSimbolosNoMeio.obterBonus();
        System.out.println(bonusObtidoNumerosSimbolosMeio);

        ResultadoDeAnaliseLetrasSomente resultadoDeAnaliseLetrasSomente = new ResultadoDeAnaliseLetrasSomente("@@!!AAabcjabuTic4Ba");
        int bonusObtidoLetrasSomente = resultadoDeAnaliseLetrasSomente.obterBonus();
        System.out.println(bonusObtidoLetrasSomente);

        ResultadoDeAnaliseRequisitosCumpridos resultadoDeAnaliseRequisitosCumpridos = new ResultadoDeAnaliseRequisitosCumpridos("@@!!AAabcjabuTic4Ba");
        int bonusObtidoRequisitosCumpridos = resultadoDeAnaliseRequisitosCumpridos.obterBonus();
        System.out.println(bonusObtidoRequisitosCumpridos);

        ResultadoDeAnaliseNumerosSomente resultadoDeAnaliseNumerosSomente = new ResultadoDeAnaliseNumerosSomente("@@!!AAabcjabuTic4Ba");
        int bonusObtidoNumerosSomente = resultadoDeAnaliseNumerosSomente.obterBonus();
        System.out.println(bonusObtidoNumerosSomente);

        ResultadoDeAnaliseCaracteresConsecutivosInsensitive resultadoDeAnaliseCaracteresConsecutivosInsensitive = new ResultadoDeAnaliseCaracteresConsecutivosInsensitive("@@!!AAabcjabuTic4Ba");
        int bonusObtidoCaracteresConsecutivosInsensitive = resultadoDeAnaliseCaracteresConsecutivosInsensitive.obterBonus();
        System.out.println(bonusObtidoCaracteresConsecutivosInsensitive);

        ResultadoDeAnaliseCaracteresConsecutivosMaiusculos resultadoDeAnaliseCaracteresConsecutivosMaiusculos = new ResultadoDeAnaliseCaracteresConsecutivosMaiusculos("@@!!AAabcjabuTic4Ba");
        int bonusObtidoCaracteresConsecutivosMaisculos = resultadoDeAnaliseCaracteresConsecutivosMaiusculos.obterBonus();
        System.out.println(bonusObtidoCaracteresConsecutivosMaisculos);

        ResultadoDeAnaliseCaracteresConsecutivosMinusculos resultadoDeAnaliseCaracteresConsecutivosMinusculos = new ResultadoDeAnaliseCaracteresConsecutivosMinusculos("@@!!AAabcjabuTic4Ba");
        int bonusObtidoCaracteresConsecutivosMinusculos = resultadoDeAnaliseCaracteresConsecutivosMinusculos.obterBonus();
        System.out.println(bonusObtidoCaracteresConsecutivosMinusculos);

        ResultadoDeAnaliseLetrasSequenciais resultadoDeAnaliseLetrasSequenciais = new ResultadoDeAnaliseLetrasSequenciais("@@!!AAabcjabuTic4Ba");
        int bonusObtidoLetrasSequenciais = resultadoDeAnaliseLetrasSequenciais.obterBonus();
        System.out.println(bonusObtidoLetrasSequenciais);

        ResultadoDeAnaliseNumerosSequenciais resultadoDeAnaliseNumerosSequenciais = new ResultadoDeAnaliseNumerosSequenciais("@@!!AAabcjabuTic4Ba");
        int bonusObtidoNumerosSequenciais = resultadoDeAnaliseNumerosSequenciais.obterBonus();
        System.out.println(bonusObtidoNumerosSequenciais);
    }



}
