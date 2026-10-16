package padroescomportamentais.chainofresponsability;

public class TipoOcorrenciaEnchente implements TipoOcorrencia {

    private static TipoOcorrenciaEnchente tipoOcorrenciaEnchente = new TipoOcorrenciaEnchente();

    private TipoOcorrenciaEnchente() {};

    public static TipoOcorrenciaEnchente getTipoOcorrenciaEnchente() {
        return tipoOcorrenciaEnchente;
    }
}