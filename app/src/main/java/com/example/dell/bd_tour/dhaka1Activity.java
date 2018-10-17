package com.example.dell.bd_tour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toolbar;

public class dhaka1Activity extends AppCompatActivity {
    public WebView video_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka1);

        getSupportActionBar().setTitle("হাতিরঝিল");


        video_view = (WebView)findViewById(R.id.Videoview);
        String video_link="<iframe width=\"380\" height=\"240\" src=\"https://www.youtube.com/embed/SA5M3pojHYM?rel" +
                "=0\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>";
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
