package original;

public class ResultadoDeAnaliseLetrasMinusculas extends ResultadoDeAnalise {
    private int contagem = senha.length();
    private int bonus;
    private TipoEstado estado;

    public int bonusLength;
    public int bonusAlphaLC;



    public ResultadoDeAnaliseLetrasMinusculas(String senha) {
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

    public int contadorLetrasMinusculas(String senha) {
        int contador = 0;

        for (int i = 0; i < senha.length(); i++) {
            if (Character.isLowerCase(senha.charAt(i))) {
                contador++;
            }
        }
        return contador;
    }

    public void calcularResultado(String senha) {
        int resultadoLetrasMinusculas = contadorLetrasMinusculas(senha);{
            bonusLength = bonus;
            if (resultadoLetrasMinusculas > 0 && resultadoLetrasMinusculas < contagem) {
                bonus = bonus + (contagem - resultadoLetrasMinusculas) * 2;
                bonusAlphaLC = (contagem - resultadoLetrasMinusculas) * 2;
            }
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

