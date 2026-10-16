package padroescomportamentais.chainofresponsability;

public class TipoOcorrenciaRoubo implements TipoOcorrencia {

    private static TipoOcorrenciaRoubo tipoOcorrenciaRoubo = new TipoOcorrenciaRoubo();

    private TipoOcorrenciaRoubo() {};

    public static TipoOcorrenciaRoubo getTipoOcorrenciaRoubo() {
        return tipoOcorrenciaRoubo;
    }
}