package IntroJs.Demo.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TitleBox {
    private String title;
    private String intro;

    public TitleBox(@JsonProperty("title") String title,@JsonProperty("intro") String intro) {
        this.title = title;
        this.intro = intro;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }
}
