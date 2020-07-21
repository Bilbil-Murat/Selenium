@Parameters
Feature:  Practice for parameterization

  @doublequateparams
  Scenario: string parameter with double quotes
    When I read parameter "value1"
    Then I read parameter "value2"
    And I read parameter "value3"
    But I read parameter "value 4 abcde 12345"

  @outlineexample
  Scenario Outline: scenario outline example
    When I read parameter "<values>"
    Given I login with "<username>" id and "<password>" password
    Given I login with "<username>" id and "<password>" password
    When  I pass intiger <numeric>
    Examples:
      | values              | username| password   |numeric|
      | value1              | user1   | passwordN1 |1      |
      | value2              | user2   | passwordN2 |2      |
      | value3              | user3   | passwordN3 |3      |
      | value 4 abcde 12345 | user4   | passwordN4 |4      |

  @multiparams
  Scenario: multiple string parameters
    Given  I login with "<userN1>" id and "<passwordN1>" password
    Given  I login with "<userN2>" id and "<passwordN2>" password
    Given  I login with "<userN3>" id and "<passwordN3>" password

  @doublequateparam1
  Scenario: string parameter with double quotes2
    Given I signup with user name "<user name 1>" and email "<example@.com>"


  @wordpar
  Scenario: string parameter with continuous words and spaces and double quotes
    Given I login with "<user1>" id and "<passwodr1>" password
    Given I login with "<user2>" id and "<password2>" password


  @intparameter
  Scenario: Int parameter sample
    When I pass intiger 45767

  @doubleparameter
  Scenario: Double parameter sample
    Then  I pass double value 124.5764

  @limitedparameters
  Scenario: limiting parameters values
    Then I selected Slower from the speed drop down

   @mapparameters
    Scenario: multi parameters
      #Given I enter first name "some fn" and last name "some last" and address line 1 "abc street building 1"
         Given I fill signup form
        | first name    | some fn         |
        | last name     | some ln         |
        | address line1 | 200 some street |
        | address line2 | Suite A4        |
        | zip code      | 10001           |
        | City          | Ney York        |
        | State         | NY              |
        Then  I fill bankapplication form
       | first name    | some fn         |
       | last name     | some ln         |
       | address line1 | 200 some street |
       | address line2 | Suite A4        |
       | zip code      | 10001           |
       | City          | Ney York        |
       | State         | NY              |
        And I fill registration form
       | first name    | some fn         |
       | last name     | some ln         |
       | address line1 | 200 some street |
       | address line2 | Suite A4        |
       | zip code      | 10001           |
       | City          | Ney York        |
       | State         | NY              |

          @datatable
          Scenario: DataTable example
          Given I fill all forms
       |first name   |last name    |address line1  |address line2|   zip code  |   City      |   State     |     Email    |
       |some fn1     |some ln1     |200 some street| Apt 1A      |10001        |New York     |NY           | onemail@1.com|
       |some fn2     |some ln2     |201 some street| Apt 2A      |10351        |New Jersey   |NJ           | onemail@1.com|
       |some fn3     |some ln3     |202 some street| Apt 3A      |14801        |Washington   |WA           | onemail@1.com|
       |some fn4     |some ln4     |203 some street| Apt 4A      |75446        |Mary         |MR           | onemail@1.com|
       |some fn5     |some ln5     |204 some street| Apt 5A      |75441        |Lebap        |LB           | onemail@1.com|
       |some fn6     |some ln6     |205 some street| Apt 6A      |75444        |Ashgabat     |AG           | onemail@1.com|

  @datateble2
  Scenario Outline: DataTable example
  When I fill all forms <Browser>
      |first name |last name |address 1       |address 2     | zip code|City      |State |Email         |
      |some fn1   |some ln1  | 200 some street| Apt 1A       |10001    |New York  |NY   | onemail@1.com|
      |some fn2   |some ln2  | 201 some street| Apt 2A       |10351    |New Jersey|NJ   | onemail@1.com|
      |some fn3   |some ln3  | 202 some street| Apt 3A       |14801    |Washington|WA   | onemail@1.com|
      |some fn4   |some ln4  | 203 some street| Apt 4A       |75446    |Mary      |MR   | onemail@1.com|
      |some fn5   |some ln5  | 204 some street| Apt 5A       |75441    |Lebap     |LB   | onemail@1.com|
      |some ln6   |some street|203 some street| Apt 6A       |75444    |Ashgabat  |AG   | onemail@1.com|
    Examples:
      |Browser  |
      |chrome   |
      |firefox  |
      |edge     |



