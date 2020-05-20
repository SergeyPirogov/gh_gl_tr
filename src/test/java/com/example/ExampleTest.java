package com.example;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;

public class ExampleTest {

    @BeforeClass
    public static void setUp() throws Exception {
//        Configuration.headless = true;
        Configuration.remote = "http://localhost:4444/wd/hub";
    }

    @Test
    public void name() {
        Selenide.open("https://angular.realworld.io/");
        $("body > app-root > app-layout-header > nav > div > ul > li:nth-child(2) > a").shouldHave(Condition.text("Sign in"));
    }
}
