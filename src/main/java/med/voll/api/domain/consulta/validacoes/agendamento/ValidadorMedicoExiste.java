package med.voll.api.domain.consulta.validacoes.agendamento;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import med.voll.api.domain.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorMedicoExiste implements ValidadorAgendamentoDeConsulta{
    @Autowired
    private MedicoRepository medicoRepository;
    @Override
    public void validar(DadosAgendamentoConsulta dados) {
        if(dados.idMedico() != null || !medicoRepository.existsById(dados.idMedico())){
            throw new ValidacaoException("Id do médico informado não existe.");
        }
    }
}
