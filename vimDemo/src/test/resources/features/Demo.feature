Feature: VIM demo
  These Tests verify CHROME UI.

  @smoke
  Scenario: Main page is shown
    Given a user browse to VIM web site
    Then COMMPEAK main page is shown


  @smoke @regression
  Scenario: "contact us" is shown
    Given a user browse to VIM web site
    When User clicks on contact us
    Then contact us main page is shown

