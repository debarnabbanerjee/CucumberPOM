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
      "cells": [
        "correct",
        "linda.anderson1",
        "linda.anderson",
        "chrome",
        ""
      ],
      "line": 17,
      "id": "as-a-orange-crm-customer-i-want-to-check-the-login-functionality-of-orange-hrm;testing-the-orange-hrm-login-functionality;;2"
    },
    {
      "cells": [
        "incorrect",
        "test",
        "test",
        "chrome",
        ""
      ],
      "line": 18,
      "id": "as-a-orange-crm-customer-i-want-to-check-the-login-functionality-of-orange-hrm;testing-the-orange-hrm-login-functionality;;3"
    },
    {
      "cells": [
        "correct",
        "admin",
        "admin",
        "firefox",
        ""
      ],
      "line": 19,
      "id": "as-a-orange-crm-customer-i-want-to-check-the-login-functionality-of-orange-hrm;testing-the-orange-hrm-login-functionality;;4"
    },
    {
      "cells": [
        "incorrect",
        "peter.mac",
        "peter.mac",
        "firefox",
        ""
      ],
      "line": 20,
      "id": "as-a-orange-crm-customer-i-want-to-check-the-login-functionality-of-orange-hrm;testing-the-orange-hrm-login-functionality;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 81756103,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Testing the Orange HRM login functionality",
  "description": "",
  "id": "as-a-orange-crm-customer-i-want-to-check-the-login-functionality-of-orange-hrm;testing-the-orange-hrm-login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "WH User navigates to \"Orange HRM\" site using \"chrome\"",
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
        "linda.anderson1"
      ],
      "line": 8
    },
    {
      "cells": [
        "passwordField",
        "linda.anderson"
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
      "val": "chrome",
      "offset": 46
    }
  ],
  "location": "testSteps.wh_User_navigates_to_site_using(String,String)"
});
formatter.result({
  "duration": 10085166670,
  "error_message": "junit.framework.AssertionFailedError: expected:\u003c200\u003e but was:\u003c500\u003e\r\n\tat junit.framework.Assert.fail(Assert.java:47)\r\n\tat junit.framework.Assert.failNotEquals(Assert.java:282)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:64)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:201)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:207)\r\n\tat com.debarnab.cucumbePOM.testSteps.wh_User_navigates_to_site_using(testSteps.java:85)\r\n\tat ✽.Given WH User navigates to \"Orange HRM\" site using \"chrome\"(LoginToOrangeCRM.feature:4)\r\n",
  "status": "failed"
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
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "testSteps.i_try_to_Login_with_the_following_data(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "correct",
      "offset": 27
    }
  ],
  "location": "testSteps.i_validate_the_Login_with_credentials(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 30
    }
  ],
  "location": "testSteps.i_validate_the_page_title_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 277152982,
  "status": "passed"
});
formatter.before({
  "duration": 37320,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Testing the Orange HRM login functionality",
  "description": "",
  "id": "as-a-orange-crm-customer-i-want-to-check-the-login-functionality-of-orange-hrm;testing-the-orange-hrm-login-functionality;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "WH User navigates to \"Orange HRM\" site using \"chrome\"",
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
        "test"
      ],
      "line": 8
    },
    {
      "cells": [
        "passwordField",
        "test"
      ],
      "line": 9
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I validate the Login with \"incorrect\" credentials",
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
      "val": "chrome",
      "offset": 46
    }
  ],
  "location": "testSteps.wh_User_navigates_to_site_using(String,String)"
});
formatter.result({
  "duration": 1347932387,
  "error_message": "junit.framework.AssertionFailedError: expected:\u003c200\u003e but was:\u003c500\u003e\r\n\tat junit.framework.Assert.fail(Assert.java:47)\r\n\tat junit.framework.Assert.failNotEquals(Assert.java:282)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:64)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:201)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:207)\r\n\tat com.debarnab.cucumbePOM.testSteps.wh_User_navigates_to_site_using(testSteps.java:85)\r\n\tat ✽.Given WH User navigates to \"Orange HRM\" site using \"chrome\"(LoginToOrangeCRM.feature:4)\r\n",
  "status": "failed"
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
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "testSteps.i_try_to_Login_with_the_following_data(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "incorrect",
      "offset": 27
    }
  ],
  "location": "testSteps.i_validate_the_Login_with_credentials(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 30
    }
  ],
  "location": "testSteps.i_validate_the_page_title_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 240575341,
  "status": "passed"
});
formatter.before({
  "duration": 25657,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Testing the Orange HRM login functionality",
  "description": "",
  "id": "as-a-orange-crm-customer-i-want-to-check-the-login-functionality-of-orange-hrm;testing-the-orange-hrm-login-functionality;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "WH User navigates to \"Orange HRM\" site using \"firefox\"",
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
        "admin"
      ],
      "line": 8
    },
    {
      "cells": [
        "passwordField",
        "admin"
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
      "val": "firefox",
      "offset": 46
    }
  ],
  "location": "testSteps.wh_User_navigates_to_site_using(String,String)"
});
formatter.result({
  "duration": 12760996290,
  "error_message": "junit.framework.AssertionFailedError: expected:\u003c200\u003e but was:\u003c500\u003e\r\n\tat junit.framework.Assert.fail(Assert.java:47)\r\n\tat junit.framework.Assert.failNotEquals(Assert.java:282)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:64)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:201)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:207)\r\n\tat com.debarnab.cucumbePOM.testSteps.wh_User_navigates_to_site_using(testSteps.java:85)\r\n\tat ✽.Given WH User navigates to \"Orange HRM\" site using \"firefox\"(LoginToOrangeCRM.feature:4)\r\n",
  "status": "failed"
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
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "testSteps.i_try_to_Login_with_the_following_data(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "correct",
      "offset": 27
    }
  ],
  "location": "testSteps.i_validate_the_Login_with_credentials(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 30
    }
  ],
  "location": "testSteps.i_validate_the_page_title_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "duration": 163695541,
  "status": "passed"
});
formatter.before({
  "duration": 26124,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Testing the Orange HRM login functionality",
  "description": "",
  "id": "as-a-orange-crm-customer-i-want-to-check-the-login-functionality-of-orange-hrm;testing-the-orange-hrm-login-functionality;;5",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "WH User navigates to \"Orange HRM\" site using \"firefox\"",
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
        "peter.mac"
      ],
      "line": 8
    },
    {
      "cells": [
        "passwordField",
        "peter.mac"
      ],
      "line": 9
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I validate the Login with \"incorrect\" credentials",
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
      "val": "firefox",
      "offset": 46
    }
  ],
  "location": "testSteps.wh_User_navigates_to_site_using(String,String)"
});
formatter.result({
  "duration": 1213450816,
  "error_message": "junit.framework.AssertionFailedError: expected:\u003c200\u003e but was:\u003c500\u003e\r\n\tat junit.framework.Assert.fail(Assert.java:47)\r\n\tat junit.framework.Assert.failNotEquals(Assert.java:282)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:64)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:201)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:207)\r\n\tat com.debarnab.cucumbePOM.testSteps.wh_User_navigates_to_site_using(testSteps.java:85)\r\n\tat ✽.Given WH User navigates to \"Orange HRM\" site using \"firefox\"(LoginToOrangeCRM.feature:4)\r\n",
  "status": "failed"
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
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "testSteps.i_try_to_Login_with_the_following_data(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "incorrect",
      "offset": 27
    }
  ],
  "location": "testSteps.i_validate_the_Login_with_credentials(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 30
    }
  ],
  "location": "testSteps.i_validate_the_page_title_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded3.png");
formatter.after({
  "duration": 130718799,
  "status": "passed"
});
});