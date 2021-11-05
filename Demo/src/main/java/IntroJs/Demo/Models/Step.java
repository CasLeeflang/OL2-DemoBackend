package IntroJs.Demo.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Step {

    private String title;
    private String element;
    private String intro;
    private String permission;

    public Step(@JsonProperty("title") String title, @JsonProperty("element") String element, @JsonProperty("intro") String intro, @JsonProperty("permission") String permission) {
        this.title = title;
        this.element = element;
        this.intro = intro;
        this.permission = permission;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
