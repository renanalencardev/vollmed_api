package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;

import java.time.Duration;
import java.time.LocalDateTime;

public class ValidadorHorarioAntecedenciaCancelamento implements ValidadorAgendamentoDeConsulta{
    @Override
    public void validar(DadosAgendamentoConsulta dados) {
        var agora = LocalDateTime.now();
        var horaConsulta = dados.data();
        var diferencaEmHoras = Duration.between(agora, horaConsulta).toHours();
        if(diferencaEmHoras < 24){
            throw new ValidacaoException("Uma consulta somente poderá ser cancelada com antecedência mínima de 24 horas.");
        }
    }
}
