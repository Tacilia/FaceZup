package br.com.zup.FaceZup.mensagem;

import br.com.zup.FaceZup.mensagem.dtos.MensagemCadastroDTO;
import br.com.zup.FaceZup.mensagem.dtos.MensagemDTO;
import br.com.zup.FaceZup.mensagem.dtos.MensagemIdDTO;
import br.com.zup.FaceZup.mensagem.dtos.ResumoMensagemDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/mensagens")
public class MensagemController {

    @Autowired
    private MensagemSevice mensagemService;
    @Autowired
    private ModelMapper modelMapper;

    @PostMapping("/{usuarioId}")
    @ResponseStatus(HttpStatus.CREATED)
    public MensagemDTO cadastrarMensagem(@RequestBody MensagemCadastroDTO mensagemCadastroDTO, @PathVariable String usuarioId){
        Mensagem mensagem = MensagemIdDTO.converterDTOParaModel();
        mensagem = mensagemService.cadastraeMensagem(usuarioId, mensagem);
        return MensagemDTO.converterModelParaDTO(mensagem);
    }
    @GetMapping("/{mensagemId}")
    public ResumoMensagemDTO visualizarMensagem(@PathVariable(name = "mensagemId") String id){
        Mensagem mensagem = mensagemService.visualizarMensagemPorId(id);
        return modelMapper.map(mensagem, ResumoMensagemDTO.class);
    }
    @GetMapping
    public List<MensagemIdDTO> pesquisarMensagens(@RequestParam(required = false) String emailUsuario,
                                                  @RequestParam(required = false) Boolean visualizado){
        List<Mensagem> mensagens = mensagemService.filtrarMensagem(emailUsuario, visualizado);
        List<MensagemIdDTO> mensagemIdDTOS = mensagens.stream().map(mensagem -> modelMapper.map(mensagem, MensagemIdDTO.class)).collect(Collectors.toList());
        return mensagemIdDTOS;
    }
}