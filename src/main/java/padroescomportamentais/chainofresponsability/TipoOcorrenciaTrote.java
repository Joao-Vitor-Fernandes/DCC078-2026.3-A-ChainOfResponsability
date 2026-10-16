package padroescomportamentais.chainofresponsability;

public class TipoOcorrenciaTrote implements TipoOcorrencia {

    private static TipoOcorrenciaTrote tipoOcorrenciaTrote = new TipoOcorrenciaTrote();

    private TipoOcorrenciaTrote() {};

    public static TipoOcorrenciaTrote getTipoOcorrenciaTrote() {
        return tipoOcorrenciaTrote;
    }
}