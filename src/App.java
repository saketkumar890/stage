import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App {
    public static void main(String[] args) throws Exception {

        Logger logger = Logger.getLogger("StageAutomation");
        PropertyConfigurator.configure("log4j.properties");

        // chromebrowser setup
        System.setProperty("webdriver.chrome.driver",
                "/Users/saketkumar/Documents/VS CODE AVALONMETA/StageAutomatiom/src/chromedriver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("use-fake-device-for-media-stream");
        options.addArguments("use-fake-ui-for-media-stream");
        ChromeDriver c = new ChromeDriver(options);
        c = new ChromeDriver(options);

        // handling chromebrowser
        c.manage().window().maximize();
        c.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

        // SCENES WEB
        // opening url
        c.get("https://1b4lker.avalonmeta.com");
        Thread.sleep(5000);
        logger.info("open url");

        // logging in
        WebElement cemail = c.findElement(By.id("email-address"));
        cemail.sendKeys("mt11@avalonmeta.com");
        Thread.sleep(1000);
        logger.info("entering email");

        WebElement cpass = c.findElement(By.id("password"));
        cpass.sendKeys("pass1234");// password
        Thread.sleep(2000);
        logger.info("entering password");

        WebElement csignup = c.findElement(By.xpath(
                "//button[@class='group relative w-full flex justify-center py-2 px-4 border border-transparent text-sm font-semibold rounded-md focus:outline-none focus:ring-0 focus:ring-offset-0 bg-indigo-600 btn__primary']"));
        csignup.click();
        Thread.sleep(5000);
        logger.info("click on signup button");

        // channel switch
        WebElement cchannel = c.findElement(By.id("1887"));
        cchannel.click();
        Thread.sleep(2000);
        logger.info("selecting channel");

        // ask to speak button click
        WebElement asktospeak = c.findElement(By.id("stage__button--request"));
        asktospeak.click();
        Thread.sleep(4000);
        logger.info("ask to speak button click");

        // join stage button click
        WebElement joinstage = c.findElement(By.xpath(
                "//button[@class='mt-3 w-full inline-flex justify-center rounded-md border shadow-sm px-4 py-2 text-sm leading-4 font-semibold focus:outline-none focus:ring-0 focus:ring-offset-0 md:mt-0 md:w-auto md:text-sm btn__primary']"));
        joinstage.click();
        Thread.sleep(2000);
        logger.info("join stage button click");

        // unmute microphone
        WebElement cunmute = c.findElement(By.id("stage__button--mute"));
        cunmute.click();
        Thread.sleep(2000);
        logger.info("unmute");

        // mute microphone
        WebElement cmute = c.findElement(By.id("stage__button--mute"));
        cmute.click();
        Thread.sleep(2000);
        logger.info("mute");

        // camera on
        WebElement ccameraon = c.findElement(By.id("stage__button--video"));
        ccameraon.click();
        Thread.sleep(4000);
        logger.info("camera on");
        // camera off
        WebElement ccameraoff = c.findElement(By.id("stage__button--video"));
        ccameraoff.click();
        Thread.sleep(4000);
        logger.info("camera off");

        // screen share on
        WebElement cshareon = c.findElement(By.id("stage__button--shareScreen"));
        cshareon.click();
        Thread.sleep(5000);
        logger.info("screen share on");

        // screen share off
        WebElement cshareoff = c.findElement(By.id("stage__button--shareScreen"));
        cshareoff.click();
        Thread.sleep(3000);
        logger.info("screen share off");

        // chat flow
        WebElement cchatclick = c.findElement(By.id("react-tabs-0"));
        cchatclick.click();
        Thread.sleep(2000);
        logger.info("chat text click");

        WebElement cchattext = c.findElement(By.xpath("//textarea[@class='rce-input rce-input-textarea']"));
        cchattext.sendKeys("Automation test is going on please wait...............");
        Thread.sleep(2000);
        logger.info("entering chat ");
        WebElement csendchat = c.findElement(By.xpath(
                "//button[@class='inline-flex items-center justify-center h-8 w-8 border border-transparent text-sm leading-4 font-medium rounded shadow-sm focus:outline-none focus:ring-0 focus:ring-offset-0 stage__rightpanel__chat__footer__btn stage__rightpanel__chat__footer__send__btn']"));
        csendchat.click();
        Thread.sleep(3000);
        logger.info("chat send button click");

        // chat option hide
        WebElement cchathide = c.findElement(By.xpath(
                "//div[@class='absolute right-0 h-11 border-b border-gray-100 stage__border flex items-center justify-center']"));
        cchathide.click();
        Thread.sleep(3000);
        logger.info("chat option hide");

        // chat option unhide
        WebElement cchatunhide = c.findElement(By.xpath(
                "//div[@class='absolute right-0 bottom-1 xs:col-span-14 lg:col-span-6 h-13 border-t-1 border-gray-100 stage__border']"));
        cchatunhide.click();
        Thread.sleep(3000);
        logger.info("chat option unhide");

        // //minimized state of stage
        // WebElement cminimised=c.findElement(By.id("2021"));
        // cminimised.click();
        // Thread.sleep(4000);
        //
        // //overview click
        // WebElement coverview=c.findElement(By.linkText("Overview"));
        // coverview.click();
        // Thread.sleep(3000);
        //
        // //unmute in minimized state
        // WebElement cminunmute=c.findElement(By.xpath("//button[@class='bg-red-500
        // border border-red-500 flex items-center justify-center rounded-md h-9
        // w-9']"));
        // cminunmute.click();
        // Thread.sleep(4000);
        //
        // stage setting button click
        WebElement csettinge = c.findElement(By.xpath(
                "//button[@class='inline-flex items-center justify-center h-9 w-9 bg-white border border-gray-300 hover:border-gray-400 active:opacity-50 opacity-100 shadow-sm text-sm font-medium rounded-md focus:outline-none focus:ring-0 focus:ring-offset-0']"));
        csettinge.click();
        Thread.sleep(4000);
        logger.info("stage setting button click");

        // create event open and close button click
        WebElement ceventopen = c.findElement(By.linkText("Create Event"));
        ceventopen.click();
        Thread.sleep(3000);
        logger.info("create event page open");
        WebElement ceventclose = c
                .findElement(By.xpath("//button[@class='p-2 rounded-full inline-flex items-center ml-6']"));
        ceventclose.click();
        Thread.sleep(3000);
        logger.info("create event page close");

        // deafen/undeafen feature button click
        WebElement csettingds = c.findElement(By.xpath(
                "//button[@class='inline-flex items-center justify-center h-9 w-9 bg-white border border-gray-300 hover:border-gray-400 active:opacity-50 opacity-100 shadow-sm text-sm font-medium rounded-md focus:outline-none focus:ring-0 focus:ring-offset-0']"));
        csettingds.click();
        Thread.sleep(4000);
        logger.info("setting opoen for deafen");
        WebElement cdeafen = c.findElement(By.linkText("Deafen"));
        cdeafen.click();
        Thread.sleep(4000);
        logger.info("click on deafen button");
        WebElement csettinguds = c.findElement(By.xpath(
                "//button[@class='inline-flex items-center justify-center h-9 w-9 bg-white border border-gray-300 hover:border-gray-400 active:opacity-50 opacity-100 shadow-sm text-sm font-medium rounded-md focus:outline-none focus:ring-0 focus:ring-offset-0']"));
        csettinguds.click();
        Thread.sleep(4000);
        logger.info("setting open for undefen");
        WebElement cundeafen = c.findElement(By.linkText("Undeafen"));
        cundeafen.click();
        Thread.sleep(4000);
        logger.info("cl;ick on undeafen");

        // enable camera 2nd time
        WebElement ccameraone1 = c.findElement(By.id("stage__button--video"));
        ccameraone1.click();
        Thread.sleep(4000);
        logger.info("second time enables camera");
        // screen share for 2nd time
        WebElement cshareon2 = c.findElement(By.id("stage__button--shareScreen"));
        cshareon2.click();
        Thread.sleep(5000);
        logger.info("second tiome enables scrren screen share");

        // Disable/Enable video on stage button click
        WebElement csettingdsv = c.findElement(By.xpath(
                "//button[@class='inline-flex items-center justify-center h-9 w-9 bg-white border border-gray-300 hover:border-gray-400 active:opacity-50 opacity-100 shadow-sm text-sm font-medium rounded-md focus:outline-none focus:ring-0 focus:ring-offset-0']"));
        csettingdsv.click();
        Thread.sleep(4000);
        logger.info("setting button click for disabled video on stage");

        WebElement disvideo = c.findElement(By.linkText("Disable Video on Stage"));
        disvideo.click();
        Thread.sleep(4000);
        logger.info("click on disbale video on stage");

        WebElement csettingenv = c.findElement(By.xpath(
                "//button[@class='inline-flex items-center justify-center h-9 w-9 bg-white border border-gray-300 hover:border-gray-400 active:opacity-50 opacity-100 shadow-sm text-sm font-medium rounded-md focus:outline-none focus:ring-0 focus:ring-offset-0']"));
        csettingenv.click();
        Thread.sleep(4000);
        logger.info("setting button click for enables video");

        WebElement envideo = c.findElement(By.linkText("Enable Video on Stage"));
        envideo.click();
        Thread.sleep(4000);
        logger.info("click on enable video on stage");

        // screen share off for 2nd time
        WebElement cshareoff1 = c.findElement(By.id("stage__button--shareScreen"));
        cshareoff1.click();
        Thread.sleep(3000);
        logger.info("second time screen share off button click");

        // //2nd user browser open
        //
        System.setProperty("webdriver.chrome.driver",
                "/Users/saketkumar/Documents/VS CODE AVALONMETA/StageAutomatiom/src/chromedriver/chromedriver");
        ChromeOptions optionss = new ChromeOptions();
        optionss.addArguments("use-fake-device-for-media-stream");
        optionss.addArguments("use-fake-ui-for-media-stream");
        ChromeDriver d = new ChromeDriver(optionss);
        d.manage().window().maximize();
        d.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

        // SCENES WEB
        // opening url
        d.get("https://1b4lker.avalonmeta.com");
        Thread.sleep(5000);

        // logging in for 2nd user
        WebElement demail = d.findElement(By.id("email-address"));
        demail.sendKeys("mt4@avalonmeta.com");
        Thread.sleep(1000);
        logger.info("2nd user email entered");
        WebElement dpass = d.findElement(By.id("password"));
        dpass.sendKeys("pass1234");// password
        Thread.sleep(2000);
        logger.info("2nd user password enter");
        WebElement dsignup = d.findElement(By.xpath(
                "//button[@class='group relative w-full flex justify-center py-2 px-4 border border-transparent text-sm font-semibold rounded-md focus:outline-none focus:ring-0 focus:ring-offset-0 bg-indigo-600 btn__primary']"));
        dsignup.click();
        Thread.sleep(5000);
        logger.info("2nd user sign in button click");

        // channel switch for 2nd user
        WebElement dchannel = d.findElement(By.id("1887"));
        dchannel.click();
        Thread.sleep(2000);
        logger.info("2nd user go to channel ");

        // ask to speak button click for 2nd user
        WebElement dasktospeak = d.findElement(By.id("stage__button--request"));
        dasktospeak.click();
        Thread.sleep(4000);
        logger.info("2nd user click on ask to speak button");

        // user1 accept permission for 2nd user
        WebElement cparticipants1 = c.findElement(By.id("react-tabs-10"));
        cparticipants1.click();
        Thread.sleep(2000);
        logger.info("1st user click on participant section");

        // 2nd user join stage button click
        WebElement caccept1 = c.findElement(By.xpath(
                "//button[@class='border border-green-500 bg-green-500 rounded w-9 h-8 flex items-center justify-center ml-auto']"));
        caccept1.click();
        Thread.sleep(8000);
        logger.info("accept the request");

        // hop on stage click for 2nd user
        WebElement djoinstage = d.findElement(By.xpath(
                "//button[@class='mt-3 w-full inline-flex justify-center rounded-md border shadow-sm px-4 py-2 text-sm leading-4 font-semibold focus:outline-none focus:ring-0 focus:ring-offset-0 md:mt-0 md:w-auto md:text-sm btn__primary']"));
        djoinstage.click();
        Thread.sleep(8000);
        logger.info("join stage button click");

        // mute mic for user 2
        WebElement dunmute = d.findElement(By.id("stage__button--mute"));
        dunmute.click();
        Thread.sleep(2000);
        logger.info("unmute 2nd user");

        WebElement dmute = d.findElement(By.id("stage__button--mute"));
        dmute.click();
        Thread.sleep(2000);
        logger.info("mute 2nd user");
        // camera on
        WebElement dcameraon = d.findElement(By.id("stage__button--video"));
        dcameraon.click();
        Thread.sleep(4000);
        logger.info("2nd user camera on");

        // camera off
        WebElement dcameraoff = d.findElement(By.id("stage__button--video"));
        dcameraoff.click();
        Thread.sleep(4000);
        logger.info("2nd user camera off");

        // screen share on
        WebElement dshareon = d.findElement(By.id("stage__button--shareScreen"));
        dshareon.click();
        Thread.sleep(5000);
        logger.info("2nd user screen share on");

        // screen share off
        WebElement dshareoff = d.findElement(By.id("stage__button--shareScreen"));
        dshareoff.click();
        Thread.sleep(3000);
        logger.info("2nd user scrren share off");

        // chat flow for user 2
        WebElement dchatclick = d.findElement(By.id("react-tabs-0"));
        dchatclick.click();
        Thread.sleep(2000);
        logger.info("2nd user chat textfield click");
        WebElement dchattext = d.findElement(By.xpath("//textarea[@class='rce-input rce-input-textarea']"));
        dchattext.sendKeys("Hi user 1.......");
        Thread.sleep(2000);
        logger.info("2nd user text chat");
        WebElement dsendchat = d.findElement(By.xpath(
                "//button[@class='inline-flex items-center justify-center h-8 w-8 border border-transparent text-sm leading-4 font-medium rounded shadow-sm focus:outline-none focus:ring-0 focus:ring-offset-0 stage__rightpanel__chat__footer__btn stage__rightpanel__chat__footer__send__btn']"));
        dsendchat.click();
        Thread.sleep(2000);
        logger.info("2nd user send chat button click");

        // chat flow for user 1
        WebElement cchatclick1 = c.findElement(By.id("react-tabs-6"));
        cchatclick1.click();
        Thread.sleep(2000);
        logger.info("1st useer chat click");
        WebElement cchattext1 = c.findElement(By.xpath("//textarea[@class='rce-input rce-input-textarea']"));
        cchattext1.sendKeys("Hey user 2.......");
        Thread.sleep(2000);
        logger.info("1st user enters text");
        WebElement csendchat1 = c.findElement(By.xpath(
                "//button[@class='inline-flex items-center justify-center h-8 w-8 border border-transparent text-sm leading-4 font-medium rounded shadow-sm focus:outline-none focus:ring-0 focus:ring-offset-0 stage__rightpanel__chat__footer__btn stage__rightpanel__chat__footer__send__btn']"));
        csendchat1.click();
        Thread.sleep(2000);
        logger.info("1st user send chat ");
        c.quit();
        logger.info("1st user browser close");
        d.quit();
        logger.info("2nd user browser close");

    }
}
