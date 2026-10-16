package padroescomportamentais.chainofresponsability;

import java.util.ArrayList;

public abstract class Orgao {

    protected ArrayList<TipoOcorrencia> listaOcorrencias = new ArrayList<>();
    private Orgao proximoOrgao;

    public Orgao getProximoOrgao() {
        return proximoOrgao;
    }

    public void setProximoOrgao(Orgao proximoOrgao) {
        this.proximoOrgao = proximoOrgao;
    }

    public abstract String getNomeOrgao();

    public String atenderOcorrencia(Ocorrencia ocorrencia) {
        if (listaOcorrencias.contains(ocorrencia.getTipoOcorrencia())) {
            return getNomeOrgao();
        }
        else {
            if (proximoOrgao != null) {
                return proximoOrgao.atenderOcorrencia(ocorrencia);
            }
            else {
                return "Sem atendimento";
            }
        }
    }
}
