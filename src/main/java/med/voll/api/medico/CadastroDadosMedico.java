package med.voll.api.medico;

import med.voll.api.endereco.DadosEndereco;

public record CadastroDadosMedico(
        Long id,
        String nome, 
        String email, 
        String crm, 
        Especialidade especialidade,
        DadosEndereco endereco) {

}
