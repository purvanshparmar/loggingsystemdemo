package co.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface DemoRepository  extends JpaRepository<Demo,Long> {
    //getAllTopics
    //getTopics
    //updateTopic

}