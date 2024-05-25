Feature: InstallationRequest

  Scenario: Customer requests installation for a product
    Given the customer is logged in
    And there is a product available for installation
    When the customer selects the product for installation
    And fills out the installation request form with car make/model and preferred date
    Then the installation request should be submitted successfully
    And the customer should receive a confirmation notification

  Scenario: Installer views new installation requests
    Given the installer is logged in
    When the installer checks the list of installation requests
    Then the installer should see the new installation request
    And the installer can view the details of the installation request

  Scenario: Installer schedules an appointment for installation
    Given the installer is logged in
    And there is a new installation request
    When the installer reviews the installation request details
    And selects an available time slot for the appointment
    Then the installer should be able to schedule the appointment
    And the customer should receive a notification with the appointment details

  Scenario: Customer views the status of installation requests
    Given the customer is logged in
    When the customer checks their list of installation requests
    Then the customer should see the status of each installation request
    And can view the details of each request, including scheduled appointments

  Scenario: Installer updates the status of an installation request
    Given the installer is logged in
    And there is a scheduled installation appointment
    When the installer completes the installation
    Then the installer should update the status of the installation request
    And the customer should receive a notification about the completed installation

  Scenario: System handles conflicting appointment schedules
    Given there are multiple installation requests
    And multiple installers with different schedules
    When customers request installations with overlapping preferred dates
    Then the system should handle conflicts and notify customers and installers appropriately
    And suggest alternative appointment times for affected parties

  Scenario: Customer cancels an installation request
    Given the customer has a pending installation request
    When the customer decides to cancel the request
    Then the customer should be able to cancel the installation request
    And the installer should receive a notification about the canceled request

  Scenario: Installer provides feedback on completed installations
    Given the installer has completed an installation
    When the installer provides feedback and a rating
    Then the feedback and rating should be recorded in the system
    And the average rating for the product and service should be updated

