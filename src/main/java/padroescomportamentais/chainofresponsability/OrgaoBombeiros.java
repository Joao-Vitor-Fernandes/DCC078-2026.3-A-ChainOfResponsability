package padroescomportamentais.chainofresponsability;

public class OrgaoBombeiros extends Orgao {

    public OrgaoBombeiros(Orgao proximo) {
        listaOcorrencias.add(TipoOcorrenciaIncendio.getTipoOcorrenciaIncendio());
        setProximoOrgao(proximo);
    }

    public String getNomeOrgao() {
        return "Corpo de Bombeiros";
    }
}