Feature: The validation of a 'to human translate' message
  All messages flowing in the HUMS service must validate against a set of clear criteria otherwise the message will be
  rejected.

  @service-validation
  Scenario: Verify the message will be rejected with an error
    When the message contains no vendor data
    Then the server responses with a negative acknowledgement

  @service-validation
  Scenario: Verify the message will be rejected with an error
    When the message contains vendor which has no match
    Then the server responses with a negative acknowledgement

  @service-validation
  Scenario: Verify the message will be rejected with an error
    When the tracking id in the message is already been pass to the service
    Then the server responses with a negative acknowledgement
