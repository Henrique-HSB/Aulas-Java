package com.hsb.empresa.boot.web.conversor;

import com.hsb.empresa.boot.domain.Departamento;
import com.hsb.empresa.boot.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToDepartamentoConverter implements Converter<String, Departamento> {

  @Autowired
  private DepartamentoService service;

  @Override
  public Departamento convert(String text) {
    if (text.isEmpty()) {
      return null;
    }
    Long id = Long.valueOf(text);
    return service.buscarPorId(id);
  }
}
