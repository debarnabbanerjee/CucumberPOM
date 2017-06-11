$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginToOrangeCRM.feature");
formatter.feature({
  "line": 1,
  "name": "As a Orange CRM Customer I want to check the login functionality of Orange HRM",
  "description": "",
  "id": "as-a-orange-crm-customer-i-want-to-check-the-login-functionality-of-orange-hrm",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Testing the Orange HRM login functionality",
  "description": "",
  "id": "as-a-orange-crm-customer-i-want-to-check-the-login-functionality-of-orange-hrm;testing-the-orange-hrm-login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "WH User navigates to \"Orange HRM\" site using \"\u003cbrowser\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I validate the page title as \"OrangeHRM\"",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "I try to Login with the following data:",
  "rows": [
    {
      "cells": [
        "Field",
        "Value"
      ],
      "line": 7
    },
    {
      "cells": [
        "loginField",
        "\u003cusername\u003e"
      ],
      "line": 8
    },
    {
      "cells": [
        "passwordField",
        "\u003cpassword\u003e"
      ],
      "line": 9
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I validate the Login with \"\u003cType\u003e\" credentials",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I validate the page title as \"\u003cpageTitle\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "comments": [
    {
      "line": 13,
      "value": "#Then I Close the browser after testing is done"
    }
  ],
  "line": 15,
  "name": "",
  "description": "",
  "id": "as-a-orange-crm-customer-i-want-to-check-the-login-functionality-of-orange-hrm;testing-the-orange-hrm-login-functionality;",
  "rows": [
    {
      "cells": [
        "Type",
        "username",
        "password",
        "browser",
        "pageTitle"
      ],
      "line": 16,
      "id": "as-a-orange-crm-customer-i-want-to-check-the-login-functionality-of-orange-hrm;testing-the-orange-hrm-login-functionality;;1"
    },
    {
      "comments": [
        {
          "line": 17,
          "value": "#|correct    |linda.anderson1|linda.anderson\t|chrome |\t\t  |"
        },
        {
          "line": 18,
          "value": "#|incorrect  |test\t\t    |test\t        |chrome |         |"
        },
        {
          "line": 19,
          "value": "#|correct    |admin\t\t    |admin\t        |firefox \t|         |"
        },
        {
          "line": 20,
          "value": "#|incorrect  |peter.mac\t\t|peter.mac\t    |firefox \t|         |"
        }
      ],
      "cells": [
        "correct",
        "test1",
        "test1",
        "ie",
        ""
      ],
      "line": 21,
      "id": "as-a-orange-crm-customer-i-want-to-check-the-login-functionality-of-orange-hrm;testing-the-orange-hrm-login-functionality;;2"
    },
    {
      "cells": [
        "correct",
        "test1",
        "test1",
        "ie",
        ""
      ],
      "line": 22,
      "id": "as-a-orange-crm-customer-i-want-to-check-the-login-functionality-of-orange-hrm;testing-the-orange-hrm-login-functionality;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 82832582,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 17,
      "value": "#|correct    |linda.anderson1|linda.anderson\t|chrome |\t\t  |"
    },
    {
      "line": 18,
      "value": "#|incorrect  |test\t\t    |test\t        |chrome |         |"
    },
    {
      "line": 19,
      "value": "#|correct    |admin\t\t    |admin\t        |firefox \t|         |"
    },
    {
      "line": 20,
      "value": "#|incorrect  |peter.mac\t\t|peter.mac\t    |firefox \t|         |"
    }
  ],
  "line": 21,
  "name": "Testing the Orange HRM login functionality",
  "description": "",
  "id": "as-a-orange-crm-customer-i-want-to-check-the-login-functionality-of-orange-hrm;testing-the-orange-hrm-login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "WH User navigates to \"Orange HRM\" site using \"ie\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I validate the page title as \"OrangeHRM\"",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "I try to Login with the following data:",
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
      "line": 7
    },
    {
      "cells": [
        "loginField",
        "test1"
      ],
      "line": 8
    },
    {
      "cells": [
        "passwordField",
        "test1"
      ],
      "line": 9
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I validate the Login with \"correct\" credentials",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I validate the page title as \"\"",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Orange HRM",
      "offset": 22
    },
    {
      "val": "ie",
      "offset": 46
    }
  ],
  "location": "testSteps.wh_User_navigates_to_site_using(String,String)"
});
formatter.result({
  "duration": 3898010508,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "OrangeHRM",
      "offset": 30
    }
  ],
  "location": "testSteps.i_validate_the_page_title_as(String)"
});
});