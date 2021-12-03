Feature: [SMGG20211896] [RiskLimitsAPIBehavioralEvaluationsV0]: Retrieves information about customer&#x27;s behavioral evaluations. In Argentina, it is information th...

Background: A logged-in valid user
    Given the user "client" with tags "multicanalactivo,sinbloqueos,dni"
    And the user sign in using the channel "NET" with login "$client.documentId" and password "$client.password"

Scenario: Happy path
  When The user executes service listBehavioralEvaluations
  Then I check that service response is success