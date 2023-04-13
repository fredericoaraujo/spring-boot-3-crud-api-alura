package med.voll.api.domain.paciente;

import med.voll.api.domain.endereco.DadosEndereco;

public record AlterarDadosPaciente(Long id, String nome, String telefone, DadosEndereco endereco) {
}
