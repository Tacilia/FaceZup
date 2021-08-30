package br.com.zup.FaceZup.mensagem;

import br.com.zup.FaceZup.mensagem.dtos.MensagemCadastroDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mensagens")
public class MensagemController {

    @Autowired
    private MensagemSevice mensagemService;
    @Autowired
    private ModelMapper modelMapper;

    /*@PostMapping("/{usuarioId}")
    @ResponseStatus(HttpStatus.CREATED)
    public MensagemCadastroDTO cadastrarMensagem(@RequestBody MensagemCadastroDTO mensagemCadastroDTO, @PathVariable String usuarioId){
        Mensagem mensagem = mensagemCadastroDTO.converterDTOParaModel
    }*/

}
