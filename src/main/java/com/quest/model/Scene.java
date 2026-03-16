package com.quest.model;

public class Scene {

    private String text;
    private String option1;
    private String option2;

    private int next1;
    private int next2;

    private boolean end;
    private boolean win;

    public Scene(String text, String option1, String option2,
                 int next1, int next2,
                 boolean end, boolean win) {

        this.text = text;
        this.option1 = option1;
        this.option2 = option2;
        this.next1 = next1;
        this.next2 = next2;
        this.end = end;
        this.win = win;
    }

    public String getText() { return text; }

    public String getOption1() { return option1; }

    public String getOption2() { return option2; }

    public int getNext1() { return next1; }

    public int getNext2() { return next2; }

    public boolean isEnd() { return end; }

    public boolean isWin() { return win; }
}