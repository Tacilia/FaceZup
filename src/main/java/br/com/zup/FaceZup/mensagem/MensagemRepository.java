package br.com.zup.FaceZup.mensagem;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MensagemRepository extends CrudRepository<Mensagem, String> {
    List<Mensagem>findAlllByVisualizado(boolean visualizado);
    List<Mensagem> findAllByEmailContains(String email);

}
