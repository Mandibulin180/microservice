package com.usuario.service.feignclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.usuario.service.models.Carro;

@FeignClient(value = "carro-service")
public interface CarroFeignClient {

    @RequestMapping(method = RequestMethod.POST,value = "/carro")
    public Carro save(@RequestBody Carro carro);

    @RequestMapping(method = RequestMethod.GET,value = "/carro/usuario/{usuarioId}")
    public List<Carro> getCarros(@PathVariable("usuarioId")int usuarioId);
    
}
