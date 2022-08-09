Feature: Product Page
  Scenario: Urun Sayfasi Kontrolleri

    Given I am on the product page
    When I click a product
    Then I should be on the product page
    And I should see the product title
    And I should see the product price
    And I should see the product description
    And I should see the product image
    And I should see the product quantity
    And I should see the product add to cart button

