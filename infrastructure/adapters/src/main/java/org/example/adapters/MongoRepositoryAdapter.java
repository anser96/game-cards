package org.example.adapters;

import org.example.adapters.helper.OperationAdapter;
import co.com.sofka.model.Pet;
import co.com.sofka.model.gateway.PetRepository;
import org.reactivecommons.utils.ObjectMapperI;
import org.springframework.stereotype.Repository;

@Repository
public class MongoRepositoryAdapter extends OperationAdapter<Pet, CardDocument, String, MongoDBRepository> implements PetRepository {

    public MongoRepositoryAdapter(MongoDBRepository mongoDBRepository, ObjectMapperI mapper) {
        super(mongoDBRepository, mapper, d -> mapper.map(d, Pet.class));
    }
}
