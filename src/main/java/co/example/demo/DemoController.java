package co.example.demo;


import org.springframework.web.bind.annotation.RestController;

import com.heraldlogic.annotation.Log;

import java.util.List;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;
    @Log
    @GetMapping(value="/hello")
    public List<Demo> getMethodName() {
        // System.out.println("Exception");
 
        
        return demoService.getDemoList();
        
    }
    @Log
    @GetMapping(value="/hello/{id}")
    public Demo getMethodID(@PathVariable("id") Long id) {
       
    	return demoService.getDemo(id);
    }

    @PostMapping(value="/h1")
    public Long postMethod(@RequestBody Demo demo) {
       return  demoService.addDemo(demo);
      
    }
    @DeleteMapping(value="/h2/{id}")
    public String deleteMethod(@PathParam("id") Long id) {
        demoService.deleteDemo(id);
        
        return "success";
    }

    @PutMapping(value="/h3/{id}")
    public String putMethod(@PathParam("id") Long id, @RequestBody Demo demo) {
        demoService.updateDemo(id, demo);
        return "success";
    }

}
