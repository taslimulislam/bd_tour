package com.example.dell.bd_tour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class raj6Activity extends AppCompatActivity {

    public WebView video_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raj6);

        getSupportActionBar().setTitle("কামারুজ্জামান উদ্যান");

        video_view = (WebView)findViewById(R.id.Videoview);
        String video_link="<iframe width=\"380\" height=\"240\" src=\"https://www.youtube.com/embed/b-W7l-B9AGg?rel=0\" \n" +
                "frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>";
        video_view.setWebViewClient(new WebViewClient(){

                                        @Override
                                        public boolean shouldOverrideUrlLoading(WebView view,String url) {
                                            return false;
                                        }
                                    }


        );
        WebSettings ws = video_view.getSettings();
        ws.setJavaScriptEnabled(true);
        video_view.loadData(video_link, "text/html","utf-8");
    }
}
