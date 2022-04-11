package com.kevcode.demo.application.person.services;

import com.kevcode.demo.application.person.http.dto.PersonDto;
import com.kevcode.demo.application.person.http.request.PersonRequest;
import com.kevcode.demo.application.shared.Response;
import com.kevcode.demo.domain.entities.Person;
import com.kevcode.demo.infrastructure.repositories.IPersonRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService implements IPersonService {
    @Autowired
    private ModelMapper _modelMapper;

    @Autowired
    private IPersonRepository _personRepository;

    @Override
    public Response<PersonDto> save(PersonRequest personRequest) {
        Person person = _modelMapper.map(personRequest, Person.class);
        person = _personRepository.save(person);
        PersonDto personDto = _modelMapper.map(person, PersonDto.class);
        return new Response<PersonDto>(personDto, HttpStatus.OK, "Persona registrada");
    }

    @Override
    public Response<List<PersonDto>> findAll() {
        return null;
    }

    @Override
    public Response<PersonDto> findById(int id) {
        return null;
    }
}
