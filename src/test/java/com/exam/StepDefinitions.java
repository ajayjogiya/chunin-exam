package com.exam;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class StepDefinitions {

    Questions q = new Questions();
    int questionNumber = 1;
    int score = 1;
    char kakashi = 'C';
    char masterJiraya = 'D';

    @Given("first question as who is copy ninja")
    public void first_question_as_who_is_copy_ninja() {
        q.ShowQuestion(questionNumber);
    }

    @When("fan enter the option for Kakashi")
    public void fan_enter_the_option_for_kakashi() {
        q.CalculateStore(questionNumber, kakashi);
    }

    @When("fan enter the option for Jiraya")
    public void fan_enter_the_option_for_jiraya() {
        q.CalculateStore(questionNumber, masterJiraya);
    }

    @Then("score should be {int}")
    public void score_should_be(int score) {
        Assertions.assertEquals(q.GetScore(), score);
    }
}
