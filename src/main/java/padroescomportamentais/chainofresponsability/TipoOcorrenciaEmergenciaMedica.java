package padroescomportamentais.chainofresponsability;

public class TipoOcorrenciaEmergenciaMedica implements TipoOcorrencia {

    private static TipoOcorrenciaEmergenciaMedica tipoOcorrenciaEmergenciaMedica = new TipoOcorrenciaEmergenciaMedica();

    private TipoOcorrenciaEmergenciaMedica() {};

    public static TipoOcorrenciaEmergenciaMedica getTipoOcorrenciaEmergenciaMedica() {
        return tipoOcorrenciaEmergenciaMedica;
    }
}
