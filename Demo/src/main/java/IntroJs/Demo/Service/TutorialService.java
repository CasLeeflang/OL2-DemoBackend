package IntroJs.Demo.Service;


import IntroJs.Demo.Models.TitleBox;
import IntroJs.Demo.Models.Step;
import IntroJs.Demo.Models.Tutorial;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TutorialService {

    private List<Tutorial> tutorials = new ArrayList<>();

    public void addTutorial(Tutorial tutorial){
        tutorials.add(tutorial);
    }

    public List<Tutorial> getTutorials(){
        return tutorials;
    }

    public void seed(){
        List<Step> seedSteps = new ArrayList<>();
        seedSteps.add(new Step("Welcome to the first tutorial!", null,"This is the first tutorial in the database",""));
        seedSteps.add(new Step( null, null,"This is the first step of the tutorial",""));
        seedSteps.add(new Step( null,null, "This is the second step of the tutorial",""));

        Tutorial seedTut = new Tutorial("IntroTut", seedSteps, "");
        addTutorial(seedTut);
    }





    public List<Object> getTutorial(){

        List<Object> tutorial = new ArrayList<>();

        Step titleBox = new Step("Intro Tutorial!",null, "This tutorial is fetched from an API!", "");
        Step step1 = new Step(null, "#IntroTut-1", "Here you can find recently updated products!", "Admin");
        Step step2 = new Step(null,"#IntroTut-2", "This shows the overall completeness score", "");
        Step step3 = new Step(null,"#IntroTut-3", "Click here to view settings","");
        Step step4 = new Step(null,"#IntroTut-3", "Please click on settings before going to the next step","");
        Step step5 = new Step(null,"#IntroTut-4", "Here you can change your workspace","");
        Step step6 = new Step(null,"#IntroTut-51", "Please click here to go to the users tab","");
        Step step7 = new Step(null,"#IntroTut-52", "Click here to manage users. You can create new users or manage existing ones.","");

        tutorial.add(titleBox);
        tutorial.add(step1);
        tutorial.add(step2);
        tutorial.add(step3);
        tutorial.add(step4);
        tutorial.add(step5);
        tutorial.add(step6);
        tutorial.add(step7);

        return tutorial;
    }
}