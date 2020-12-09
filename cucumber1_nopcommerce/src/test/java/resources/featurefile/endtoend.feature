Feature: Build your own  computers
  as a user i should be able to build computer

  Scenario: verify that products arrange in reverse alphabetical order
    Given I am on home page
    And  I click on computer tab
    And I click on desktop tab
    When I click on products sort by
    And I click on Z to A from drop down
    Then products title should be in reverse order

  Scenario: verify that products should added to shopping cart successfully
    Given I am on home page
    And  I click on computer tab
    And I click on desktop tab
    When I click on products sort by
    And I click on A To Z from drop down
    And I click on add to cart
    And I should get and build message
    And I select select proccesor 2.2 GHz Intel Pentium Dual-Core E2200
    And I select RAM 8GB
    And I click on HDD radio button
    And I click on OS radio button
    And  I click on total commander check box
    And I verify price updated successfully
    And I click on add to cart button
    And I verify add to cart button successfully
    And I click on cross button to close
    And I mouse hover to shopping cart
    And I click on go to cart
    And I click on qty boc to clear default value
    And I added qrt "2"
    And I click to update shopping cart
    Then price should be updated successfully




