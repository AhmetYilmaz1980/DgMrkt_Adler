package com.euroTech.stepDefs;

import com.euroTech.pages.SecurityPage;
import com.euroTech.utilities.BrowserUtils;
import com.euroTech.utilities.ConfigurationReader;
import com.euroTech.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {
    SecurityPage securityPage = new SecurityPage();
    @Before
    public void setUp() {
        Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Driver.get().manage().window().maximize();
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitFor(2);
        securityPage.entry();
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }
       Driver.closeDriver();
    }

}
