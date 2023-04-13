package med.voll.api.domain.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    public Endereco(DadosEndereco dados) {
        this.logradouro = dados.logradouro();
        this.bairro = dados.bairro();
        this.cep = dados.cep();
        this.numero = dados.numero();
        this.complemento = dados.complemento();
        this.cidade = dados.cidade();
        this.uf = dados.uf();
    }

    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

    public void atualizarInformacoes(DadosEndereco endereco) {

        if (null != endereco.logradouro()) {
            this.logradouro = endereco.logradouro();
        }

        if (null != endereco.bairro()) {
            this.bairro = endereco.bairro();
        }

        if (null != endereco.cep()) {
            this.cep = endereco.cep();
        }

        if (null != endereco.numero()) {
            this.numero = endereco.numero();
        }

        if (null != endereco.complemento()) {
            this.complemento = endereco.complemento();
        }

        if (null != endereco.cidade()) {
            this.cidade = endereco.cidade();
        }

        if (null != endereco.uf()) {
            this.uf = endereco.uf();
        }
    }

}
