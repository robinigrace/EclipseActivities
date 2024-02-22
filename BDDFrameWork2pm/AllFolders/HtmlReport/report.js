$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:ForgotPassword.feature");
formatter.feature({
  "name": "To validate forgotten password functionality of facebook application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "\t\t\t\t\tTo validate forgotten password",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User have to login facebook login through chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_have_to_login_facebook_login_through_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to click forgotten password button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_have_to_click_forgotten_password_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[text()\u003d\u0027Forgotten password\u0027]\"}\n  (Session info: chrome\u003d120.0.6099.71)\nFor documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception\nBuild info: version: \u00274.13.0\u0027, revision: \u0027ba948ece5b*\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_371\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [c292cb26eddb38ee6bde2457829516cf, findElement {using\u003dxpath, value\u003d//a[text()\u003d\u0027Forgotten password\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 120.0.6099.71, chrome: {chromedriverVersion: 120.0.6099.71 (9729082fe617..., userDataDir: C:\\Users\\DT434\\AppData\\Loca...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:58268}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:58268/devtoo..., se:cdpVersion: 120.0.6099.71, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: c292cb26eddb38ee6bde2457829516cf\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:52)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:191)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:196)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:171)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:602)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:359)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:353)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:68)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy22.click(Unknown Source)\r\n\tat org.maven.BaseClass.btnClick(BaseClass.java:57)\r\n\tat org.stepdefinition.StepDefinition.user_have_to_click_forgotten_password_button(StepDefinition.java:137)\r\n\tat ✽.User have to click forgotten password button(file:ForgotPassword.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User have to enter email or phone number",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enter_email_or_phone_number()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User have to click search button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_have_to_click_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:Login.feature");
formatter.feature({
  "name": "To check the facebook login functionality using chrome browser",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To login facebook using chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.to_login_facebook_using_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To check the invalid username and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@Smoke"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "User have to Enter valid username and valid password",
  "rows": [
    {
      "cells": [
        "username",
        "Greens"
      ]
    },
    {
      "cells": [
        "password",
        "123455454"
      ]
    },
    {
      "cells": [
        "email",
        "greens@gmail.com"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_have_to_Enter_valid_username_and_valid_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to Click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_have_to_Click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to reach the invalid credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_have_to_reach_the_invalid_credential_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To login facebook using chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.to_login_facebook_using_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To check the valid UserName and Invalid Pass",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@Smoke"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "User have to Enter Invalid emailadd and Invalid password",
  "rows": [
    {
      "cells": [
        "email",
        "password",
        "username"
      ]
    },
    {
      "cells": [
        "greens@gmail.com",
        "5565777889",
        "selenium"
      ]
    },
    {
      "cells": [
        "rocky@gmail.com",
        "7909887899",
        "java123"
      ]
    },
    {
      "cells": [
        "selenium@gmail.com",
        "9887590090",
        "javasel5"
      ]
    },
    {
      "cells": [
        "python@gmail.com",
        "7686786888",
        "python123"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_have_to_Enter_Invalid_emailadd_and_Invalid_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to Click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_have_to_Click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to reach the invalid credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_have_to_reach_the_invalid_credential_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});