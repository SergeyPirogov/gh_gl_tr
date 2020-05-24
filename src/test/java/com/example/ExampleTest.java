package com.example;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Selenide.$;

public class ExampleTest {

    @BeforeAll
    public static void setUp() throws Exception {
//        Configuration.headless = true;
//          Configuration.browser = "com.example.WebdriverManager";
//        Configuration.browserCapabilities = new DesiredCapabilities(options);
        Configuration.remote = "http://localhost:4444/wd/hub";
    }

    @Test
    public void test() {
        Selenide.open("https://angular.realworld.io/");
        $("body > app-root > app-layout-header > nav > div > ul > li:nth-child(2) > a").shouldHave(Condition.text("Sign in"));
    }
}
