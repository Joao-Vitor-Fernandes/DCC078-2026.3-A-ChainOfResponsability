package padroescomportamentais.chainofresponsability;

public class OrgaoPolicia extends Orgao {

    public OrgaoPolicia(Orgao proximo) {
        listaOcorrencias.add(TipoOcorrenciaRoubo.getTipoOcorrenciaRoubo());
        setProximoOrgao(proximo);
    }

    public String getNomeOrgao() {
        return "Policia";
    }
}