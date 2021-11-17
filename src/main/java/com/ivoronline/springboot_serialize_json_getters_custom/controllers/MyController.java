package com.ivoronline.springboot_serialize_json_getters_custom.controllers;

import com.ivoronline.springboot_serialize_json_getters_custom.dto.PersonDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //================================================================
  // GET PERSON
  //================================================================
  @RequestMapping("GetPerson")
  PersonDTO getPerson() {

    //CREATE INSTANCE
    PersonDTO personDTO        = new PersonDTO();
              personDTO.name   = "John";
              personDTO.height = 1.76F;

    //RETURN INSTANCE AS JSON
    return personDTO;

  }

}
