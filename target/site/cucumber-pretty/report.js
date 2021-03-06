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
formatter.step({
  "line": 14,
  "name": "I click on \"\u003ccategory\u003e\" on \"HomePage\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I see the title as \"T-shirts - My Store\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I validate the \"tShirtPage\" elements",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I try to add an \"\u003ccategory\u003e\" with the following features:",
  "rows": [
    {
      "cells": [
        "Field",
        "Value"
      ],
      "line": 18
    },
    {
      "cells": [
        "size",
        "\u003csize\u003e"
      ],
      "line": 19
    },
    {
      "cells": [
        "Color",
        "\u003cColor\u003e"
      ],
      "line": 20
    }
  ],
  "keyword": "When "
});
formatter.examples({
  "comments": [
    {
      "line": 21,
      "value": "# | Compositions | \u003cCompositions\u003e |"
    },
    {
      "line": 22,
      "value": "# | Styles       | \u003cStyles\u003e       |"
    },
    {
      "line": 23,
      "value": "# | Properties   | \u003cProperties\u003e   |"
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
        "TShirt",
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
    },
    {
      "cells": [
        "Firefox",
        "debarnab.banerjee@gmail.com",
        "California0!",
        "TShirts",
        "M(1)",
        "Blue",
        "Casual",
        "Casual",
        "Short Sleeve",
        "$16.51",
        "$2",
        "1",
        "$18.51",
        "$0.00",
        "$18.51"
      ],
      "line": 47,
      "id": "feature-file-to-test-the-order-of-tshirts;test-case-to-prove-the-booking-of-\u003ccategory\u003e;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7475265,
  "status": "passed"
});
formatter.scenario({
  "line": 46,
  "name": "Test Case to prove the booking of TShirt",
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
formatter.step({
  "line": 14,
  "name": "I click on \"TShirt\" on \"HomePage\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I see the title as \"T-shirts - My Store\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I validate the \"tShirtPage\" elements",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I try to add an \"TShirt\" with the following features:",
  "matchedColumns": [
    3,
    4,
    5
  ],
  "rows": [
    {
      "cells": [
        "Field",
        "Value"
      ],
      "line": 18
    },
    {
      "cells": [
        "size",
        "small"
      ],
      "line": 19
    },
    {
      "cells": [
        "Color",
        "blue"
      ],
      "line": 20
    }
  ],
  "keyword": "When "
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
  "duration": 13659908575,
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
  "duration": 5236934265,
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
  "duration": 12337172,
  "status": "passed"
});
formatter.match({
  "location": "tShirtPageSteps.i_enter_userame_and_password_as(DataTable)"
});
formatter.result({
  "duration": 4053891976,
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
  "duration": 16729310,
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
  "duration": 271523691,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TShirt",
      "offset": 12
    },
    {
      "val": "HomePage",
      "offset": 24
    }
  ],
  "location": "tShirtPageSteps.i_click_on(String,String)"
});
formatter.result({
  "duration": 1812163913,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "T-shirts - My Store",
      "offset": 20
    }
  ],
  "location": "tShirtPageSteps.i_see_the_title_as(String)"
});
formatter.result({
  "duration": 12954357,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tShirtPage",
      "offset": 16
    }
  ],
  "location": "tShirtPageSteps.i_validate_the_elements(String)"
});
formatter.result({
  "duration": 863559623,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TShirt",
      "offset": 17
    }
  ],
  "location": "tShirtPageSteps.i_try_to_buy_a_with_the_following_features(String,DataTable)"
});
formatter.result({
  "duration": 3589284,
  "error_message": "java.lang.NullPointerException\r\n\tat com.debarnab.cucumbePOM.tShirtPageSteps.i_try_to_buy_a_with_the_following_features(tShirtPageSteps.java:130)\r\n\tat ✽.When I try to add an \"TShirt\" with the following features:(orderTshirts.feature:17)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 3614970683,
  "status": "passed"
});
formatter.before({
  "duration": 61112,
  "status": "passed"
});
formatter.scenario({
  "line": 47,
  "name": "Test Case to prove the booking of TShirts",
  "description": "",
  "id": "feature-file-to-test-the-order-of-tshirts;test-case-to-prove-the-booking-of-\u003ccategory\u003e;;3",
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
  "name": "I open a browser using \"Firefox\"",
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
formatter.step({
  "line": 14,
  "name": "I click on \"TShirts\" on \"HomePage\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I see the title as \"T-shirts - My Store\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I validate the \"tShirtPage\" elements",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I try to add an \"TShirts\" with the following features:",
  "matchedColumns": [
    3,
    4,
    5
  ],
  "rows": [
    {
      "cells": [
        "Field",
        "Value"
      ],
      "line": 18
    },
    {
      "cells": [
        "size",
        "M(1)"
      ],
      "line": 19
    },
    {
      "cells": [
        "Color",
        "Blue"
      ],
      "line": 20
    }
  ],
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "Firefox",
      "offset": 24
    }
  ],
  "location": "tShirtPageSteps.i_open_a_browser_using(String)"
});
formatter.result({
  "duration": 8429952748,
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
  "duration": 4609978154,
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
  "duration": 14577792,
  "status": "passed"
});
formatter.match({
  "location": "tShirtPageSteps.i_enter_userame_and_password_as(DataTable)"
});
