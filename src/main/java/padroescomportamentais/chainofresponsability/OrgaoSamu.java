package padroescomportamentais.chainofresponsability;

public class OrgaoSamu extends Orgao {

    public OrgaoSamu(Orgao proximo) {
        listaOcorrencias.add(TipoOcorrenciaEmergenciaMedica.getTipoOcorrenciaEmergenciaMedica());
        setProximoOrgao(proximo);
    }

    public String getNomeOrgao() {
        return "SAMU";
    }
}