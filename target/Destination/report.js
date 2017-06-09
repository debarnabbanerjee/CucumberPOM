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
formatter.examples({
  "comments": [
    {
      "line": 12,
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
        "browser"
      ],
      "line": 16,
      "id": "as-a-orange-crm-customer-i-want-to-check-the-login-functionality-of-orange-hrm;testing-the-orange-hrm-login-functionality;;1"
    },
    {
      "cells": [
        "correct",
        "linda.anderson1",
        "linda.anderson",
        "chrome"
      ],
      "line": 17,
      "id": "as-a-orange-crm-customer-i-want-to-check-the-login-functionality-of-orange-hrm;testing-the-orange-hrm-login-functionality;;2"
    },
    {
      "cells": [
        "incorrect",
        "test",
        "test",
        "chrome"
      ],
      "line": 18,
      "id": "as-a-orange-crm-customer-i-want-to-check-the-login-functionality-of-orange-hrm;testing-the-orange-hrm-login-functionality;;3"
    },
    {
      "cells": [
        "correct",
        "admin",
        "admin",
        "chrome"
      ],
      "line": 19,
      "id": "as-a-orange-crm-customer-i-want-to-check-the-login-functionality-of-orange-hrm;testing-the-orange-hrm-login-functionality;;4"
    },
    {
      "cells": [
        "incorrect",
        "peter.mac",
        "peter.mac",
        "chrome"
      ],
      "line": 20,
      "id": "as-a-orange-crm-customer-i-want-to-check-the-login-functionality-of-orange-hrm;testing-the-orange-hrm-login-functionality;;5"
    },
    {
      "cells": [
        "correct",
        "test1",
        "test1",
        "chrome"
      ],
      "line": 21,
      "id": "as-a-orange-crm-customer-i-want-to-check-the-login-functionality-of-orange-hrm;testing-the-orange-hrm-login-functionality;;6"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 137253966,
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
  "duration": 13509343565,
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
formatter.result({
  "duration": 51512511,
  "status": "passed"
});
formatter.match({
  "location": "testSteps.i_try_to_Login_with_the_following_data(DataTable)"
});
formatter.result({
  "duration": 32039776477,
  "status": "passed"
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
  "duration": 1092059,
  "error_message": "junit.framework.AssertionFailedError: FAIL - Unable to Login with correct credentials\r\n\tat junit.framework.Assert.fail(Assert.java:47)\r\n\tat com.debarnab.cucumbePOM.testSteps.i_validate_the_Login_with_credentials(testSteps.java:93)\r\n\tat ✽.Then I validate the Login with \"correct\" credentials(LoginToOrangeCRM.feature:11)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 396952398,
  "status": "passed"
});
formatter.before({
  "duration": 50806,
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
  "duration": 1211265032,
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
formatter.result({
  "duration": 23678882,
  "status": "passed"
});
formatter.match({
  "location": "testSteps.i_try_to_Login_with_the_following_data(DataTable)"
});
formatter.result({
  "duration": 31133585204,
  "status": "passed"
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
  "duration": 356150,
  "status": "passed"
});
formatter.after({
  "duration": 32844,
  "status": "passed"
});
formatter.before({
  "duration": 1233697,
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
  "duration": 1235994404,
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
formatter.result({
  "duration": 32291670,
  "status": "passed"
});
formatter.match({
  "location": "testSteps.i_try_to_Login_with_the_following_data(DataTable)"
});
formatter.result({
  "duration": 4186782503,
  "status": "passed"
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
  "duration": 1228052,
  "status": "passed"
});
formatter.after({
  "duration": 41568,
  "status": "passed"
});
formatter.before({
  "duration": 53884,
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
  "duration": 885395979,
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
formatter.result({
  "duration": 25197909,
  "status": "passed"
});
formatter.match({
  "location": "testSteps.i_try_to_Login_with_the_following_data(DataTable)"
});
formatter.result({
  "duration": 3185301963,
  "status": "passed"
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
  "duration": 626086,
  "error_message": "junit.framework.AssertionFailedError: FAIL - Able to login with incorrect credential\r\n\tat junit.framework.Assert.fail(Assert.java:47)\r\n\tat com.debarnab.cucumbePOM.testSteps.i_validate_the_Login_with_credentials(testSteps.java:107)\r\n\tat ✽.Then I validate the Login with \"incorrect\" credentials(LoginToOrangeCRM.feature:11)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 388304713,
  "status": "passed"
});
formatter.before({
  "duration": 35923,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Testing the Orange HRM login functionality",
  "description": "",
  "id": "as-a-orange-crm-customer-i-want-to-check-the-login-functionality-of-orange-hrm;testing-the-orange-hrm-login-functionality;;6",
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
  "duration": 976608502,
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
formatter.result({
  "duration": 30660767,
  "status": "passed"
});
formatter.match({
  "location": "testSteps.i_try_to_Login_with_the_following_data(DataTable)"
});
formatter.result({
  "duration": 31345905346,
  "status": "passed"
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
  "duration": 504974,
  "error_message": "junit.framework.AssertionFailedError: FAIL - Unable to Login with correct credentials\r\n\tat junit.framework.Assert.fail(Assert.java:47)\r\n\tat com.debarnab.cucumbePOM.testSteps.i_validate_the_Login_with_credentials(testSteps.java:93)\r\n\tat ✽.Then I validate the Login with \"correct\" credentials(LoginToOrangeCRM.feature:11)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "duration": 317187498,
  "status": "passed"
});
});