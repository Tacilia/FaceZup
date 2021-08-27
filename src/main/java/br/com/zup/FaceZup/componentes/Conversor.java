package br.com.zup.FaceZup.componentes;


import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Conversor {

    @Bean
    public ModelMapper conversorDTO(){
        return new ModelMapper();
    }

}
