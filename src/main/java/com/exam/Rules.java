package com.exam;

public class Rules {
    String heading;
    String finalRule;

    public Rules() {
        heading = "This test questions are based on naruto.\n" +
                "It's an MCQ type questions. Every question have A,B,C,D option."
                + " You have to enter only one option. Ex: A\n\n";
        finalRule = "You have a choice to attend the final question." +
                " If you don't attend you will fail," +
                " but if you chose to take it and are unable to answere correctly," +
                " then you will not allow to give Chunin Exam ever again";

    }

    public void HeadingShow() {
        System.out.println(heading);
    }

    public void FinalRuleShow() {
        System.out.println(finalRule);
    }
}