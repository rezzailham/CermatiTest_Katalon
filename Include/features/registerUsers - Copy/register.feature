@register
Feature: Register users

  Scenario Outline: Positive Case Register successfully
    Given user access page "https://www.cermati.com/app/gabung" 
    When user input <mobilePhone> as mobilePhone
    And user input <email> as email
    And user input <firstName> as firstName
    And user input <lastName> as lastName
    And user click on Daftar button
    Then system display OTP Page

    Examples: 
      | mobilePhone | email | firstName | lastName |
      | 082329060848| rezzailham@testcermati.com | Mohammad Rezza Ilham | Kurniawan |
      | 082162581242| wnasyiah@kuswoyo.name | Tania | Hasanah |
      | 085633744182| habibi.irma@fujiati.web.id | Atma | Dabukke |