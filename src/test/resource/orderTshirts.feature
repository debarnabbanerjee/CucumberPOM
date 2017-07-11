@Tshirt@Order
Feature: Feature File to test the order of Tshirts

  Scenario Outline: Test Case to prove the booking of <category>
    Given I open a browser using "<browser>"
    When I navigate to "baseUrl" of application
    Then I see the title as "My Store"
    And I try to sign in entering userame and password as :
      | Field    | Value      |
      | UserName | <username> |
      | Password | <password> |
    Then I see the title as "My account - My Store"
    Then I validate the "HomePage" elements
    And I click on "<category>" on "HomePage"
    Then I see the title as "T-shirts - My Store"
    Then I validate the "tShirtPage" elements
#    When I try to add an "tShirt" with the following features:
#      | Field | Value   |
#      | size  | <size>  |
#      | Color | <Color> |
##     # | Compositions | <Compositions> |
##      #| Styles       | <Styles>       |
##     # | Properties   | <Properties>   |
##
#    Then I verify that the added "<category>" in cart
#    And I verify "<category>" the confirmation message as "Product successfully added to your shopping cart"
#    And I click "<category>" checkOut btn
#    Then I see the title as "Order - My Store"
#    Then I validate the "ShoppingCartPage" elements
#    Then I validate the added item to have the following:
#      | Field    | Value   |
#      | size     | <size>  |
#      | Color    | <Color> |
#      | Quantity | 1       |
#    And I validate that the prices of the product in cart as:
#      | Field        | Value              |
#      | unitPrice    | <unitPrice>        |
#      | totalSipping | <shippingChaarges> |
#      | quantity     | <quantity>         |
#      | total        | <total>            |
#      | tax          | <Tax>              |
#      | grandTotal   | <grandTotal>       |

    Examples:
      | browser | username                    | password     | category | size  | Color | Compositions | Styles | Properties   | unitPrice | shippingChaarges | quantity | total  | Tax   | grandTotal |
      | Chrome  | debarnab.banerjee@gmail.com | California0! | TShirt  | small | blue  | Cotton       | Casual | Short Sleeve | $16.51    | $2               | 1        | $18.51 | $0.00 | $18.51     |
      | Firefox      | debarnab.banerjee@gmail.com | California0! | TShirts  | M(1)  | Blue  | Casual       | Casual | Short Sleeve | $16.51    | $2               | 1        | $18.51 | $0.00 | $18.51     |
