/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import java.util.*;
import org.junit.Test;
import org.junit.Ignore;

/**
 *
 * @author MinhQuang
 */
public class TestCheckDate {

    public TestCheckDate() {
    }

    @Ignore
    @Test
    public void shouldReturnError() {
        try {
            Playwright playwright;
            playwright = Playwright.create();
            Browser browser = playwright.webkit().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false).setSlowMo(100));
            BrowserContext context = browser.newContext();
            // Open new page
            Page page = context.newPage();

            page.navigate("http://localhost:8080/Lab3Testing2/");
            page.locator("input[name=\"year\"]").click();
            page.locator("input[name=\"year\"]").fill("999");
            page.locator("input[name=\"month\"]").click();
            page.locator("input[name=\"month\"]").fill("4");
            page.locator("input[name=\"day\"]").click();
            page.locator("input[name=\"day\"]").fill("30");

            // submit 
            page.locator("text=Check").click();
            assertThat(page.locator("h2")).hasText("Date is Invalid!");
            context.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Ignore
    @Test
    public void shouldReturnSuccess() {
        try {
            Playwright playwright;
            playwright = Playwright.create();
            Browser browser = playwright.webkit().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false).setSlowMo(100));
            BrowserContext context = browser.newContext();
            // Open new page
            Page page = context.newPage();
            page.navigate("http://localhost:8080/Lab3Testing2/");

            // fil input
            page.locator("input[name=\"year\"]").click();
            page.locator("input[name=\"year\"]").fill("2022");
            page.locator("input[name=\"month\"]").click();
            page.locator("input[name=\"month\"]").fill("4");
            page.locator("input[name=\"day\"]").click();
            page.locator("input[name=\"day\"]").fill("30");

            // submit
            page.locator("text=Check").click();
            assertThat(page.locator("h2")).hasText("Date 30/4/2022 is valid");

            context.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
