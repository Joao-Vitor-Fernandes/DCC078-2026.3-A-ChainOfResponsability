package padroescomportamentais.chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OcorrenciaTest {

    OrgaoDefesaCivil defesaCivil;
    OrgaoPolicia policia;
    OrgaoBombeiros bombeiros;
    OrgaoSamu samu;

    @BeforeEach
    void setUp() {
        defesaCivil = new OrgaoDefesaCivil(null);
        policia = new OrgaoPolicia(defesaCivil);
        bombeiros = new OrgaoBombeiros(policia);
        samu = new OrgaoSamu(bombeiros);
    }

    @Test
    void deveRetornarSamuParaEmergenciaMedica() {
        assertEquals("SAMU", samu.atenderOcorrencia(new Ocorrencia(TipoOcorrenciaEmergenciaMedica.getTipoOcorrenciaEmergenciaMedica())));
    }

    @Test
    void deveRetornarBombeirosParaIncendio() {
        assertEquals("Corpo de Bombeiros", samu.atenderOcorrencia(new Ocorrencia(TipoOcorrenciaIncendio.getTipoOcorrenciaIncendio())));
    }

    @Test
    void deveRetornarPoliciaParaRoubo() {
        assertEquals("Policia", samu.atenderOcorrencia(new Ocorrencia(TipoOcorrenciaRoubo.getTipoOcorrenciaRoubo())));
    }

    @Test
    void deveRetornarDefesaCivilParaEnchente() {
        assertEquals("Defesa Civil", samu.atenderOcorrencia(new Ocorrencia(TipoOcorrenciaEnchente.getTipoOcorrenciaEnchente())));
    }

    @Test
    void deveRetornarSemAtendimentoParaTrote() {
        assertEquals("Sem atendimento", samu.atenderOcorrencia(new Ocorrencia(TipoOcorrenciaTrote.getTipoOcorrenciaTrote())));
    }

}
