package com.example.aksel_jpa;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepo repository;

    @Override
    public void savePerson(Person person) {
        repository.save(person);
    }

    public Person findPersonByID (Integer person_ID){
        return repository.findPersonById(person_ID)
                .orElseThrow(() -> new EntityNotFoundException("person not found"));
    }


}
