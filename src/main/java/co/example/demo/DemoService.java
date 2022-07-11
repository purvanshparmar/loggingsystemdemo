package co.example.demo;

import java.util.ArrayList;
import java.util.List;

import com.heraldlogic.annotation.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
	
    @Autowired
    private DemoRepository demoRepository;
//    @CustomAnnotion
    
    @Log
    public List<Demo> getDemoList() {
        List<Demo> demo = new ArrayList<>();
        demoRepository.findAll()
                .forEach(demo::add);
        return demo;
    }
    @Log
    public Demo getDemo(Long id) {
        // return demoRepository.getById(id);
    	if(true)throw  new NullPointerException();
    	return demoRepository.findById(id).get();
    }

    public Long addDemo(Demo demo) {
        return demoRepository.save(demo).getId();
    }

    public void deleteDemo(Long id) {
        demoRepository.deleteById(id);
    }

    public void updateDemo(Long id, Demo demo) {
        demoRepository.save(demo);
    }

}
