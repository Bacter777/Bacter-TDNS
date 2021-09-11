package com.bacter.dnschanger;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.shashank.sony.fancyaboutpagelib.FancyAboutPage;

public class About extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        about();
    }
    public void about()
    {
        FancyAboutPage fancyAboutPage = findViewById(R.id.fancyAboutPage);
        fancyAboutPage.setCover(R.drawable.coverimg);
        fancyAboutPage.setName("BdFreak777");
        fancyAboutPage.setDescription("Mobile Application Developer");
        fancyAboutPage.setAppIcon(R.mipmap.ic_launcher_round);
        fancyAboutPage.setAppName("Bacter Tweaker");
        fancyAboutPage.setVersionNameAsAppSubTitle("09.27.21");
        fancyAboutPage.addFacebookLink("https://www.facebook.com/BdFreak777");
        fancyAboutPage.addGitHubLink("https://www.github.com/Bacter777");
        fancyAboutPage.addEmailLink("bdfreak777@gmail.com");
        fancyAboutPage.setAppDescription("Bacter Tweaker is a DNS Changer with NO ROOT required, it act as a local VPN Server that redirect your connections to match DNS criteria");
    }
}