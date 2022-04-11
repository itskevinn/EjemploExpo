package com.kevcode.demo.application.person.services;

import com.kevcode.demo.application.person.http.dto.PersonDto;
import com.kevcode.demo.application.person.http.request.PersonRequest;
import com.kevcode.demo.application.shared.Response;

import java.util.List;

public interface IPersonService {
    Response<PersonDto> save(PersonRequest person);

    Response<List<PersonDto>> findAll();

    Response<PersonDto> findById(int id);
}
