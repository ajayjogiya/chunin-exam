Feature: Exam
  Simple exam of Naruto fans

  Scenario: Who is copy ninja?
    Given first question as who is copy ninja
    When fan enter the option for Kakashi
    Then score should be 1

  Scenario: Fan enters wrong ans
    Given first question as who is copy ninja
    When fan enter the option for Jiraya
    Then score should be 0
