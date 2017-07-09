$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("orderTshirts.feature");
formatter.feature({
  "line": 2,
  "name": "Feature File to test the order of Tshirts",
  "description": "",
  "id": "feature-file-to-test-the-order-of-tshirts",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Tshirt"
    },
    {
      "line": 1,
      "name": "@Order"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Test Case to prove the booking of \u003ccategory\u003e",
  "description": "",
  "id": "feature-file-to-test-the-order-of-tshirts;test-case-to-prove-the-booking-of-\u003ccategory\u003e",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I open a browser using \"\u003cbrowser\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I navigate to \"baseUrl\" of application",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I see the title as \"My Store\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I try to sign in entering userame and password as :",
  "rows": [
    {
      "cells": [
        "Field",
        "Value"
      ],
      "line": 9
    },
    {
      "cells": [
        "UserName",
        "\u003cusername\u003e"
      ],
      "line": 10
    },
    {
      "cells": [
        "Password",
        "\u003cpassword\u003e"
      ],
      "line": 11
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I see the title as \"My account - My Store\"",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I validate the \"HomePage\" elements",
  "keyword": "Then "
});
formatter.examples({
  "comments": [
    {
      "line": 14,
      "value": "#    And I click on \"\u003ccategory\u003e\" on HomePage"
    },
    {
      "line": 15,
      "value": "#    Then I see the title as \"T-shirts - My Store\""
    },
    {
      "line": 16,
      "value": "#    Then I validate the \"tShirtPage\" elements"
    },
    {
      "line": 17,
      "value": "#    When I try to add an \"tShirt\" with the following features:"
    },
    {
      "line": 18,
      "value": "#      | Field | Value   |"
    },
    {
      "line": 19,
      "value": "#      | size  | \u003csize\u003e  |"
    },
    {
      "line": 20,
      "value": "#      | Color | \u003cColor\u003e |"
    },
    {
      "line": 21,
      "value": "##     # | Compositions | \u003cCompositions\u003e |"
    },
    {
      "line": 22,
      "value": "##      #| Styles       | \u003cStyles\u003e       |"
    },
    {
      "line": 23,
      "value": "##     # | Properties   | \u003cProperties\u003e   |"
    },
    {
      "line": 24,
      "value": "##"
    },
    {
      "line": 25,
      "value": "#    Then I verify that the added \"\u003ccategory\u003e\" in cart"
    },
    {
      "line": 26,
      "value": "#    And I verify \"\u003ccategory\u003e\" the confirmation message as \"Product successfully added to your shopping cart\""
    },
    {
      "line": 27,
      "value": "#    And I click \"\u003ccategory\u003e\" checkOut btn"
    },
    {
      "line": 28,
      "value": "#    Then I see the title as \"Order - My Store\""
    },
    {
      "line": 29,
      "value": "#    Then I validate the \"ShoppingCartPage\" elements"
    },
    {
      "line": 30,
      "value": "#    Then I validate the added item to have the following:"
    },
    {
      "line": 31,
      "value": "#      | Field    | Value   |"
    },
    {
      "line": 32,
      "value": "#      | size     | \u003csize\u003e  |"
    },
    {
      "line": 33,
      "value": "#      | Color    | \u003cColor\u003e |"
    },
    {
      "line": 34,
      "value": "#      | Quantity | 1       |"
    },
    {
      "line": 35,
      "value": "#    And I validate that the prices of the product in cart as:"
    },
    {
      "line": 36,
      "value": "#      | Field        | Value              |"
    },
    {
      "line": 37,
      "value": "#      | unitPrice    | \u003cunitPrice\u003e        |"
    },
    {
      "line": 38,
      "value": "#      | totalSipping | \u003cshippingChaarges\u003e |"
    },
    {
      "line": 39,
      "value": "#      | quantity     | \u003cquantity\u003e         |"
    },
    {
      "line": 40,
      "value": "#      | total        | \u003ctotal\u003e            |"
    },
    {
      "line": 41,
      "value": "#      | tax          | \u003cTax\u003e              |"
    },
    {
      "line": 42,
      "value": "#      | grandTotal   | \u003cgrandTotal\u003e       |"
    }
  ],
  "line": 44,
  "name": "",
  "description": "",
  "id": "feature-file-to-test-the-order-of-tshirts;test-case-to-prove-the-booking-of-\u003ccategory\u003e;",
  "rows": [
    {
      "cells": [
        "browser",
        "username",
        "password",
        "category",
        "size",
        "Color",
        "Compositions",
        "Styles",
        "Properties",
        "unitPrice",
        "shippingChaarges",
        "quantity",
        "total",
        "Tax",
        "grandTotal"
      ],
      "line": 45,
      "id": "feature-file-to-test-the-order-of-tshirts;test-case-to-prove-the-booking-of-\u003ccategory\u003e;;1"
    },
    {
      "cells": [
        "Chrome",
        "debarnab.banerjee@gmail.com",
        "California0!",
        "TShirts",
        "small",
        "blue",
        "Cotton",
        "Casual",
        "Short Sleeve",
        "$16.51",
        "$2",
        "1",
        "$18.51",
        "$0.00",
        "$18.51"
      ],
      "line": 46,
      "id": "feature-file-to-test-the-order-of-tshirts;test-case-to-prove-the-booking-of-\u003ccategory\u003e;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 13048064,
  "status": "passed"
});
formatter.scenario({
  "line": 46,
  "name": "Test Case to prove the booking of TShirts",
  "description": "",
  "id": "feature-file-to-test-the-order-of-tshirts;test-case-to-prove-the-booking-of-\u003ccategory\u003e;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Tshirt"
    },
    {
      "line": 1,
      "name": "@Order"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I open a browser using \"Chrome\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I navigate to \"baseUrl\" of application",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I see the title as \"My Store\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I try to sign in entering userame and password as :",
  "matchedColumns": [
    1,
    2
  ],
  "rows": [
    {
      "cells": [
        "Field",
        "Value"
      ],
      "line": 9
    },
    {
      "cells": [
        "UserName",
        "debarnab.banerjee@gmail.com"
      ],
      "line": 10
    },
    {
      "cells": [
        "Password",
        "California0!"
      ],
      "line": 11
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I see the title as \"My account - My Store\"",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I validate the \"HomePage\" elements",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Chrome",
      "offset": 24
    }
  ],
  "location": "tShirtPageSteps.i_open_a_browser_using(String)"
});
formatter.result({
  "duration": 8520205839,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "baseUrl",
      "offset": 15
    }
  ],
  "location": "tShirtPageSteps.i_navigate_to(String)"
});
formatter.result({
  "duration": 7426144085,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My Store",
      "offset": 20
    }
  ],
  "location": "tShirtPageSteps.i_see_the_title_as(String)"
});
formatter.result({
  "duration": 12156112,
  "status": "passed"
});
formatter.match({
  "location": "tShirtPageSteps.i_enter_userame_and_password_as(DataTable)"
});
formatter.result({
  "duration": 3994757449,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My account - My Store",
      "offset": 20
    }
  ],
  "location": "tShirtPageSteps.i_see_the_title_as(String)"
});
formatter.result({
  "duration": 15745846,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HomePage",
      "offset": 16
    }
  ],
  "location": "tShirtPageSteps.i_validate_the_elements(String)"
});
formatter.result({
  "duration": 287783755,
  "status": "passed"
});
formatter.after({
  "duration": 3311365438,
  "status": "passed"
});
});