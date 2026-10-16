package padroescomportamentais.chainofresponsability;

public class OrgaoDefesaCivil extends Orgao {

    public OrgaoDefesaCivil(Orgao proximo) {
        listaOcorrencias.add(TipoOcorrenciaEnchente.getTipoOcorrenciaEnchente());
        setProximoOrgao(proximo);
    }

    public String getNomeOrgao() {
        return "Defesa Civil";
    }
}