package med.voll.api.domain.consulta;

import jakarta.validation.constraints.NotBlank;

public record DadosCancelamentoConsulta(
        @NotBlank
        Long idConsulta,
        @NotBlank
        MotivoCancelamento motivo) {

}
