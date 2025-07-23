Feature: Login Data Driven with Excel

  Scenario Outline: Login Data Driven Excel
    Given the user navigates to login page
    And the user enters username and password from sheet "<sheetName>" and rows <row_index>
    When user clicks on Login
    Then user should get expected result in the rows <row_index>

    Examples: 
      |sheetName| row_index |
      |Sheet1   |         1 |
      |Sheet1   |         2 |
      |Sheet1   |         3 |