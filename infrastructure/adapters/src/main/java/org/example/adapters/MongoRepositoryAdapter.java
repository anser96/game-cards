package org.example.adapters;

import co.com.game.model.Card;
import co.com.game.model.gateway.CardRepository;
import org.example.adapters.helper.OperationAdapter;
import org.reactivecommons.utils.ObjectMapperI;
import org.springframework.stereotype.Repository;

@Repository
public class MongoRepositoryAdapter extends OperationAdapter<Card, CardDocument, String, MongoDBRepository> implements CardRepository {

    public MongoRepositoryAdapter(MongoDBRepository mongoDBRepository, ObjectMapperI mapper) {
        super(mongoDBRepository, mapper, d -> mapper.map(d, Card.class));
    }
}
