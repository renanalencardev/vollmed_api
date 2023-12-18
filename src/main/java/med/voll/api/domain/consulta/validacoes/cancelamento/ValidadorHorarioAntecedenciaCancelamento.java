package med.voll.api.domain.consulta.validacoes.cancelamento;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.ConsultaRepository;
import med.voll.api.domain.consulta.DadosCancelamentoConsulta;
import med.voll.api.domain.consulta.validacoes.cancelamento.ValidadorCancelamentoDeConsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;
@Component
public class ValidadorHorarioAntecedenciaCancelamento implements ValidadorCancelamentoDeConsulta {
    @Autowired
    private ConsultaRepository consultaRepository;
    @Override
    public void validar(DadosCancelamentoConsulta dados) {

        var agora = LocalDateTime.now();
        var consulta = consultaRepository.getReferenceById(dados.idConsulta());
        var diferencaEmHoras = Duration.between(agora, consulta.getData()).toHours();
        if(diferencaEmHoras < 24){
            throw new ValidacaoException("Uma consulta somente poderá ser cancelada com antecedência mínima de 24 horas.");
        }
    }
}
