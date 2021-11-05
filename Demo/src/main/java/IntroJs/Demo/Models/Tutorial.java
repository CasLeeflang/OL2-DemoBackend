package IntroJs.Demo.Models;

import java.util.List;

public class Tutorial {

    private String title;
    private List<Step> steps;
    private String category;

    public Tutorial(String title, List<Step> steps, String category) {
        this.title = title;
        this.steps = steps;
        this.category = category;
    }

    public void addStep(Step step){
        steps.add(step);
    }

    public List<Step> getSteps() {
        return steps;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
