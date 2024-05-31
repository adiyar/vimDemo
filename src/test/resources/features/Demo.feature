Feature: VIM demo
  These Tests verify CHROME UI.

  @smoke
  Scenario: Main page is shown
    Given a user browse to VIM web site
    Then VIM main page is shown


  @smoke @regression
  Scenario: "contact us" is shown
    Given a user browse to VIM web site
    When User clicks on Request a Demo
    Then Request a Demo page is shown

