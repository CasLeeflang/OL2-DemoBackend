package IntroJs.Demo.Controllers;

import IntroJs.Demo.Models.Step;
import IntroJs.Demo.Models.Tutorial;
import IntroJs.Demo.Service.TutorialService;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin
@RequestMapping("/api/tutorial")
@RestController
public class TutorialController {

    private final TutorialService service;

    public TutorialController(TutorialService service) {
        this.service = service;
    }

    @GetMapping
    public List<Object> getAllTutorialSteps(){
        List<Object> steps = new ArrayList<>();
        
        List<Tutorial> tutorials = service.getTutorials();
        for (Tutorial tut: tutorials
             ) {
            for (Step step: tut.getSteps()
                 ) {
                steps.add(step);
            }
        }
        return steps;
    }

    @PostMapping(path = "/new")
    public void addTutorial(@RequestBody Tutorial tutorial){
        service.addTutorial(tutorial);
    }

    @PostMapping(path = "/seed")
    public void seedTutorial(){
        service.seed();
    }


    @GetMapping(path = "/getTut")
    public List<Tutorial> getTutorials(){
        return service.getTutorials();
    }

    @GetMapping(path = "/hardcoded")
    public List<Object> getHCSteps(){
        return service.getTutorial();
    }

}
