package padroescomportamentais.chainofresponsability;

public class TipoOcorrenciaIncendio implements TipoOcorrencia {

    private static TipoOcorrenciaIncendio tipoOcorrenciaIncendio = new TipoOcorrenciaIncendio();

    private TipoOcorrenciaIncendio() {};

    public static TipoOcorrenciaIncendio getTipoOcorrenciaIncendio() {
        return tipoOcorrenciaIncendio;
    }
}