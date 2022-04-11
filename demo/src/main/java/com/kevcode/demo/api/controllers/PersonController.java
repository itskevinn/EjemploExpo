package com.kevcode.demo.api.controllers;

import com.kevcode.demo.application.person.http.dto.PersonDto;
import com.kevcode.demo.application.person.http.request.PersonRequest;
import com.kevcode.demo.application.person.services.IPersonService;
import com.kevcode.demo.application.shared.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Person")
public class PersonController {

    @Autowired
    private IPersonService _personService;

    @PostMapping("/Create")
    private Response<PersonDto> save(@RequestBody PersonRequest personRequest) {
        return _personService.save(personRequest);
    }
}
