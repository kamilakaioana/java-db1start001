package original;

public class ValidadorDeRequisitosCumpridos {

    public static int obterQuantidadeDeLetrasMaisculas(String senha) {
        int maiusculas = 0;

        for (int i = 0; i < senha.length(); i++) {
            char caractere = senha.charAt(i);
            if (ValidadorCaracteres.isMaisculo(caractere))
                maiusculas++;
        }
        return maiusculas;
    }

    public static int obterQuantidadeDeLetrasMinusculas(String senha) {
        int minusculas = 0;

        for (int i = 0; i < senha.length(); i++) {
            char caractere = senha.charAt(i);
            if (ValidadorCaracteres.isMinusculo(caractere))
                minusculas++;
        }
        return minusculas;
    }

    public static int obterQuantidadeDeSimbolos(String senha) {
        int count = 0;
        for (int i = 0; i < senha.length(); i++) {
            char caractere = senha.charAt(i);
            if (ValidadorCaracteres.isSimbolo(caractere))
                count++;
        }
        return count;
    }

    public static int obterQuantidadeDeNumeros(String senha) {
        int count = 0;
        for (int i = 0; i < senha.length(); i++) {
            if (Character.isDigit(senha.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static int obterQuantidadeDeSimbolosNoMeio(String senha) {
        int count = 0;
        for (int i = 1; i < senha.length() - 1; i++) {
            char caractere = senha.charAt(i);

            if (ValidadorCaracteres.isSimbolo(caractere))
                count++;
        }
        return count;
    }

    public static int obterQuantidadeDeNumerosNoMeio(String senha) {
        int count = 0;
        for (int i = 1; i < senha.length() - 1; i++) {
            if (Character.isDigit(senha.charAt(i)))
                count++;
        }
        return count;

    }

    public static int obterQuantidadeDeEspacos(String senha) {
        int count = 0;

        for (int i = 0; i < senha.length(); i++) {
            char caractere = senha.charAt(i);
            if (ValidadorCaracteres.isEspaco(caractere))
                count++;
        }
        return count;
    }

    public static int obterQuantidadeDeLetras(String senha) {
        return obterQuantidadeDeLetrasMaisculas(senha) + obterQuantidadeDeLetrasMinusculas(senha);
    }

    public static int obterQuantidadeDeLetrasMaisculasConsecutivas(String senha) {
        int maiusculas = 0;

        for (int i = 0; i < senha.length(); i++) {
            char caractere = senha.charAt(i);
            if (i + 1 >= senha.length())
                break;
            char proximoCaractere = senha.charAt(i + 1);
            if (ValidadorCaracteres.isMaisculo(caractere) && ValidadorCaracteres.isMaisculo(proximoCaractere))
                maiusculas++;
        }
        return maiusculas;
    }

    public static int obterQuantidadeDeLetrasMinusculasConsecutivas(String senha) {
        int minusculas = 0;

        for (int i = 0; i < senha.length(); i++) {
            char caractere = senha.charAt(i);
            if (i + 1 >= senha.length())
                break;
            char proximoCaractere = senha.charAt(i + 1);
            if (ValidadorCaracteres.isMinusculo(caractere) && ValidadorCaracteres.isMinusculo(proximoCaractere))
                minusculas++;
        }
        return minusculas;
    }

    public static int obterQuantidadeDeNumerosConsecutivos(String senha) {
        int count = 0;
        senha = senha.replaceAll("\\s", "");

        for (int i = 0; i < senha.length(); i++) {
            char caractere = senha.charAt(i);
            if (i + 1 >= senha.length())
                break;
            char proximoCaractere = senha.charAt(i + 1);
            if (ValidadorCaracteres.isNumero(caractere) && ValidadorCaracteres.isNumero(proximoCaractere))
                count++;
        }
        return count;
    }

    public static int obterQuantidadeDeLetrasSequenciais(String senha) {
        int countSeqAlpha = 0;

        for (int i = 0; i < 23; i++) {
            String ALPHAS = "abcdefghijklmnopqrstuvwxyz";
            String sFwd = ALPHAS.substring(i, i + 3);
            String sRev = new StringBuilder(sFwd).reverse().toString();
            if (senha.toLowerCase().contains(sFwd) || senha.toLowerCase().contains(sRev)) {
                countSeqAlpha++;
            }
        }
        return countSeqAlpha;

    }

    public static int obterQuantidadeDeNumerosSequenciais(String senha) {
        int countSeqNumber = 0;

        for (int i = 0; i < 8; i++) {
            String DIGITS = "01234567890";
            String sFwd = DIGITS.substring(i, i + 3);
            String sRev = new StringBuilder(sFwd).reverse().toString();
            if (senha.toLowerCase().contains(sFwd) || senha.toLowerCase().contains(sRev)) {
                countSeqNumber++;
            }
        }
        return countSeqNumber;
    }

    public static int obterQuantidadeDeSimbolosSequenciais(String senha) {
        int countSeqSymbol = 0;

        for (int i = 0; i < 8; i++) {
            String SYMBOLS = ")!@#$%^&*()";
            String sFwd = SYMBOLS.substring(i, i + 3);
            String sRev = new StringBuilder(sFwd).reverse().toString();
            if (senha.toLowerCase().contains(sFwd) || senha.toLowerCase().contains(sRev)) {
                countSeqSymbol++;
            }
        }
        return countSeqSymbol;
    }
}
