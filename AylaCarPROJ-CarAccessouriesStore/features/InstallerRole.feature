Feature: InstallerRole

  Scenario: Installer views installation requests
    Given the installer is logged in
    When the installer checks the list of installation requests
    Then the installer should see a list of installation requests
    And each request should include relevant details such as product, car make/model, and preferred date

  Scenario: Installer schedules an appointment
    Given the installer is logged in
    And there is a pending installation request
    When the installer selects an installation request
    And chooses an available time slot for the appointment
    Then the installer should be able to schedule the appointment
  

  Scenario: Installer views scheduled appointments
    Given the installer is logged in
    When the installer checks the list of scheduled appointments
    Then the installer should see a list of upcoming appointments
    And each appointment should include relevant details such as customer name, product, and scheduled date/time

