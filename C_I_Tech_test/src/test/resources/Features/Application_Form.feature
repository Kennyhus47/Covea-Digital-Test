Feature: Application form Test

  Background: 
    Given I am on the Homepage
    And I click on My quote page Link
    Given The user is on the quote page

  Scenario: Select title MR from dropdown
    When the dropdown is selected
    Then user can select the title MR

  @login
  Scenario Outline: A invalid email address is entered
    When an invalid email address "<email>" is entered
    When an invalid password "<passw>" is entered
    Then an error is displayed

    Examples: 
      | email         | passw   |
      | AAA@gmail.com | uysfyus |

  @login
  Scenario Outline: A valid email address is entered
    When a valid email address "<email>" entered
    When a valid password "<passw>" is entered
    Then no error is displayed

    Examples: 
      | email            | passw     |
      | mike11@gmail.com | passw1234 |

  @Address
  Scenario Outline: Postcode lookup for valid postcode
    When they complete the Your Details Section and enter a valid postcode "<postcode>" and clicks find address
    Then a list of addresses is shown

    Examples: 
      | postcode |
      | AA11 2AA |

  @Form
  Scenario Outline: Quote form completed
    When I select dropdown button
    And I select the title MR
    When I enter Firstname "<firstname>" Surname "<surname>" address "<email>" details
    And I enter confirm email address "<confirmemail>" telephone "<tel>" postcode "<postcode>" details
    And I click continue
    Then the summary page is displayed

    Examples: 
      | firstname | surname | email            | confirmemail     | tel       | postcode |
      | Mike      | Kenny   | mike11@gmail.com | mike11@gmail.com | 000000000 | AA11 2AA |
