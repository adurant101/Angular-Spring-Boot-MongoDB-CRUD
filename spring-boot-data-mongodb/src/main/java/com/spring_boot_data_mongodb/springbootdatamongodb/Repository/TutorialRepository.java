package com.spring_boot_data_mongodb.springbootdatamongodb.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring_boot_data_mongodb.springbootdatamongodb.Model.Tutorial;

public interface TutorialRepository extends MongoRepository<Tutorial, String>{
    List<Tutorial> findByTitleContaining(String title);
    List<Tutorial> findByPublished(boolean published);
}
