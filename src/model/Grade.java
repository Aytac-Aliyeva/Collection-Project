package model;

public class Grade {
    private Integer score;
    private String name ;

    public Grade(Integer score, String name) {
        this.score = score;
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public Grade setScore(Integer score) {
        this.score = score;
        return this;
    }

    public String getName() {
        return name;
    }

    public Grade setName(String name) {
        this.name = name;
        return this;
    }
}
