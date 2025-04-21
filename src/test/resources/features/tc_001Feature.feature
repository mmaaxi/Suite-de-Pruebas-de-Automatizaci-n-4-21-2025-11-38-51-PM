Feature: Validate connection to Google Sheets

  Scenario: Successful connection and data reading from Google Sheets
    Given the user navigates to the Google Sheets URL
    When the connection is established successfully
    Then the data from the document is read correctly