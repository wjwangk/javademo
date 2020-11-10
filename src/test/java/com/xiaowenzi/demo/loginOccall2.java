package com.xiaowenzi.demo;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.net.URL;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class loginOccall2 {
    private AppiumDriver  driver;


    @BeforeClass
    public void setup() throws Exception {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(CapabilityType.BROWSER_NAME, "");
        cap.setCapability("platformName", "Android"); //指定测试平台
        cap.setCapability("deviceName", "5c1b90e9"); //指定测试机的ID,通过adb命令`adb devices`获取
        cap.setCapability("platformVersion", "7.1.1");

        //将上面获取到的包名和Activity名设置为值
        cap.setCapability("appPackage", "com.sky.jisuanji");
        cap.setCapability("appActivity", "com.sky.jisuanji.JisuanjizixieActivity");

        //A new session could not be created的解决方法
        cap.setCapability("appWaitActivity","com.sky.jisuanji.JisuanjizixieActivity");
        //每次启动时覆盖session，否则第二次后运行会报错不能新建session
        cap.setCapability("sessionOverride", true);

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
    }

    @Test
    public void plus(){

        //获取1
        driver.findElementById("com.sky.jisuanji:id/btn1").click();
        //获取+
        driver.findElementById("com.sky.jisuanji:id/jia").click();
        //获取2
        driver.findElementById("com.sky.jisuanji:id/btn2").click();
        //获取=
        driver.findElementById("com.sky.jisuanji:id/denyu").click();


    }

    @AfterClass
    public void tearDown() throws Exception {

        driver.quit();

    }


}


