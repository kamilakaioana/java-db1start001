package original;

public class ResultadoDeAnaliseCaracteresConsecutivosInsensitive extends ResultadoDeAnalise{
    private int contagem;
    private int bonus;
    private TipoEstado estado;

    public ResultadoDeAnaliseCaracteresConsecutivosInsensitive(String senha) {
        super(senha);
        calcularResultado(senha);
        calcularEstado();
    }

    private void calcularEstado() {
        if(contagem > 1)
            estado = TipoEstado.ALERTA;
        else
            estado = TipoEstado.SUFICIENTE;
    }

    private void calcularResultado(String senha) {
        double incrementDeductionOfRepeatedChars = 0;
        String[] arrPwd = senha.replaceAll("\\s+", "").split("\\s*");

        for (int i = 0; i < arrPwd.length; i++) {
            var bCharExists = false;
            for (int j = 0; j < arrPwd.length; j++) {
                if (arrPwd[i].equals(arrPwd[j]) && i != j) {
                    bCharExists = true;
                    incrementDeductionOfRepeatedChars += Math.abs(arrPwd.length / (j - i));
                }
            }
            if (bCharExists) {
                contagem++;
                int countUniqueCharacters = arrPwd.length - contagem;
                incrementDeductionOfRepeatedChars = countUniqueCharacters != 0 ?
                        Math.ceil(incrementDeductionOfRepeatedChars / countUniqueCharacters) :
                        Math.ceil(incrementDeductionOfRepeatedChars);
            }
        }

        if (contagem > 0) {
            bonus = (int) incrementDeductionOfRepeatedChars;
        }
    }


    @Override
    int obterBonus() {
        return bonus;
    }

    @Override
    int obterContagem() {
        return contagem;
    }

    @Override
    TipoEstado obterEstado() {
        return estado;
    }

    @Override
    TipoOperacao obterTipoOperacao() {
        return TipoOperacao.INCREMENTADOR;
    }
}

