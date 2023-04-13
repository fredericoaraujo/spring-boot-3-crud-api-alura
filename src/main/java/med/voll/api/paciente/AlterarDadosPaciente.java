package med.voll.api.paciente;

import med.voll.api.endereco.DadosEndereco;

public record AlterarDadosPaciente(Long id, String nome, String telefone, DadosEndereco endereco) {
}
