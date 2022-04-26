package com.hedaya.duyaehedaya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class QuranDoyaDetailsActivity extends AppCompatActivity {

    private TextView textView;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_doya_details);


        getSupportActionBar().setTitle("বিস্তারিত বর্ণনা");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textView = findViewById(R.id.quranDoyaDetailsId);
        webView = findViewById(R.id.quranDoyaDetailsWebViewId);

        Bundle bundle = getIntent().getExtras();

        if(bundle!=null){
            String value = bundle.getString("quranDoya");
            if(value.equals("বেহেশতী লােকদের প্রথম দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/1.html");

            }else if(value.equals("জ্ঞান বৃদ্ধির দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/2.html");

            }else if(value.equals("বিপদে ধৈর্যধারণ ও আল্লাহর রহমত লাভের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/3.html");

            }else if(value.equals("সকল ভয়ভীতি হতে মুক্তি ও আল্লাহর আশ্রয় লাভের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/4.html");

            }else if(value.equals("দুঃসংবাদ শুনলে বা বিপদের সম্মুখীন হলে পড়ার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/5.html");

            }else if(value.equals("চোখ-লাগা বা বদ-নজর থেকে নিরাপদ থাকার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/6.html");

            }else if(value.equals("পূণ্যবান পুত্র-সন্তান লাভের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/7.html");

            }else if(value.equals("ইমিগ্রেশনে ঢােকার আগে পড়ার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/8.html");

            }else if(value.equals("অত্যাচারী শাসকের জুলুম থেকে নিষ্কৃতি লাভের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/9.html");

            }else if(value.equals("আল্লাহ তাআলার দরবারে সত্যনিষ্ট হিসেবে গ্রহণযােগ্য হওয়ার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/10.html");

            }else if(value.equals("অশ্লীলতা ও বেহায়াপনা থেকে মুক্তি লাভের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/11.html");

            }else if(value.equals("চরম দুশ্চিন্তা ও উৎকণ্ঠায় ধৈর্যশক্তি লাভের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/12.html");

            }else if(value.equals("অজ্ঞতা হতে রক্ষা পওয়া এবং বিচক্ষণতা লাভের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/13.html");

            }else if(value.equals("দোয়ার মাধ্যমে মাতাপিতার খেদমত")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/14.html");

            }else if(value.equals("দুষ্কৃতিকারীর অনিষ্ট হতে নিরাপদ থাকার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/15.html");

            }else if(value.equals("জিন-শয়তানের অনিষ্টতা হতে মুক্তি লাভের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/16.html");

            }else if(value.equals("হঠাৎ কারাে পক্ষ হতে অনিষ্টতার আশংকা করলে আল্লাহর আশ্রয় লাভের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/17.html");

            }else if(value.equals("নেককার স্ত্রী লাভের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/18.html");

            }else if(value.equals("ভুল সংশােধন এবং আল্লাহর পক্ষ হতে ক্ষমা লাভের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/19.html");

            }else if(value.equals("বিপদে ধৈর্য ধারণের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/20.html");

            }else if(value.equals("নিঃসন্তান দম্পতিদের সন্তান লাভের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/21.html");

            }else if(value.equals("প্রবাসী সন্তান ও আপনজনের হেফাযতের জন্য দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/22.html");

            }else if(value.equals("মাগফিরাত ও রহমত লাভের সর্বোত্তম দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/23.html");

            }else if(value.equals("শ্রোতাদের হেদায়ত লাভ ও নিজের প্রচেষ্টা আল্লাহর দরবারে কবুল হওয়ার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/24.html");

            }else if(value.equals("একান্ত অসহায় ও বিপদগ্রস্ত হলে মুক্তি লাভের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/25.html");

            }else if(value.equals("সফরে আল্লাহর খাস সাহায্য লাভের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/26.html");

            }else if(value.equals("কঠিন মুসিবতের হাত হতে উদ্ধার পাওয়ার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/27.html");

            }else if(value.equals("ঘর থেকে বের হওয়ার সময় বা অন্য সময়ে নিজের সবকিছু আল্লাহর উপর সােপর্দ করার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/28.html");

            }else if(value.equals("গুনাহ মাফ হওয়া ও দোযখ হতে মুক্তির জন্য আল্লাহর প্রিয় বান্দাদের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/29.html");

            }else if(value.equals("দোয়া ইউনুস: কঠিন বিপদমুক্তির দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/30.html");

            }else if(value.equals("বিপদমুক্তি, যানবাহন থেকে অবতরণ ও নতুন জায়গায় পৌঁছে পড়ার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/31.html");

            }else if(value.equals("মামলা-মােকদ্দমায় অবিচার ও জুলুম থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/32.html");

            }else if(value.equals("ষড়যন্ত্রের মােকাবেলায় আল্লাহর সাহায্য লাভের দোয়া\n")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/33.html");

            }else if(value.equals("আল্লাহর গােপন সাহায্য লাভের বরকতপূর্ণ দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/34.html");

            }else if(value.equals("হিংসুকের শত্রুতার মােকাবেলায় মনের দৃঢ়তা ও আল্লাহর সাহায্য লাভের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/34.html");

            }else if(value.equals("নবজাতকের আপদ বিপদ দূর হওয়া ও শয়তানের অনিষ্টতা থেকে রক্ষার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/36.html");

            }else if(value.equals("নৌকায় বা যানবাহনে আরােহীদের জন্য অতি বরকতময় দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/37.html");

            }else if(value.equals("আল্লাহ তাআলার নৈকট্য অর্জনের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/38.html");

            }else if(value.equals("আল্লাহর দয়া অনুগ্রহ লাভ এবং সবকিছুর সুষ্ঠু ব্যবস্থাপনার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/39.html");

            }else if(value.equals("ভুল শােধরানাে ও আরাে উত্তম পুরস্কার লাভের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/40.html");

            }else if(value.equals("নেক সন্তান লাভের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/41.html");

            }else if(value.equals("সামাজিক পাপাচার-জনিত দুর্যোগ থেকে মুক্তি লাভের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/42.html");

            }else if(value.equals("অন্তরে আল্লাহর নূর লাভের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/43.html");

            }else if(value.equals("আল্লাহর পক্ষ হতে গায়েবী ইলম লাভের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/44.html");

            }else if(value.equals("দুনিয়া ও আখেরাতে সলােকদের সঙ্গ লাভের জন্য দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/45.html");

            }else if(value.equals("দুনিয়া ও আখেরাতে যাবতীয় কল্যাণ লাভের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/46.html");

            }else if(value.equals("সন্ত্রাসী বা দুষ্ট শক্তির হাত থেকে উদ্ধার পাওয়ার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/47.html");

            }else if(value.equals("কপট চরিত্র হতে মুক্তি ও আল্লাহর ভালােবাসা লাভের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/48.html");

            }else if(value.equals("শয়তানী কুমন্ত্রণার প্রতিকার")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/49.html");

            }else if(value.equals("অনিচ্ছাকৃত ভুলের জন্য ক্ষমা প্রার্থনার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/50.html");

            }else if(value.equals("যে কোনাে পরিস্থিতিতে আল্লাহর আশ্রয়, পাওয়ার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/51.html");

            }else if(value.equals("নিজের ও সঙ্গী-সাথীদের গুনাহ হতে মুক্তি লাভের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/52.html");

            }else if(value.equals("যে দোয়ার ফলে বাবা আদম (আ) ও মা হাওয়া (আ)-এর গুনাহ মাফ হয়েছিল")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/53.html");

            }else if(value.equals("যুদ্ধ ও আপদকালীন মনের দৃঢ়তা ও আল্লাহর সাহায্য লাভের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/54.html");

            }else if(value.equals("স্ত্রী ও সন্তানরা যাতে নয়নমণিতুল্য হয়, তার জন্য দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/55.html");

            }else if(value.equals("বিপদকালে গায়েবী সাহায্য লাভের জন্য দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/56.html");

            }else if(value.equals("যানবাহনে আরােহণের দোয়া।")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/57.html");

            }else if(value.equals("বুকের সন্তানের উজ্জ্বল ভবিষ্যতের জন্য গর্ভবতী মায়ের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/58.html");

            }else if(value.equals("জায়নামাযে দাঁড়িয়ে পড়ার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/59.html");

            }else if(value.equals("গুনাহ মার্জনা, বিপদমুক্তি ও দুশমনের উপর বিজয় লাভের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/60.html");

            }else if(value.equals("জাহান্নামের আযাব থেকে নিরাপত্তা লাভের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/61.h1tml");

            }else if(value.equals("নতুন বাড়িতে প্রবেশ, নতুন কোন কাজ শুরু করা ও সাফল্যজনকভাবে তা শেষ করার তাওফিক লাভের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/62.html");

            }else if(value.equals("ঈমানী পরীক্ষায় উত্তীর্ণ হয়ে পরকালে উত্তম প্রতিদান লাভের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/63.html");

            }else if(value.equals("কঠিন কাজ সহজ হওয়া, মুখের জড়তা দূর করা এবং জালিমের সামনে সত্য কথা বলার সাহসের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/64.html");

            }else if(value.equals("জালিম ও কাফেরদের কবল থেকে মুক্তি লাভের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/65.html");

            }else if(value.equals("বিপদ থেকে মুক্তি লাভের পর কৃতজ্ঞতার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/66.html");

            }else if(value.equals("অত্যাচারী সরকার ও সমাজ থেকে উদ্ধার এবং ঐশী সাহায্য লাভের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/67.html");

            }else if(value.equals("যে আয়াতে জান্নাতের ঠিকানা লেখা")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/68.html");

            }else if(value.equals("বদ নজরের চিকিৎসা")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/69.html");

            }else if(value.equals("আল্লাহর খাস রহমত লাভ ও হারানাে জিনিষ খুঁজে পাওয়ার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/70.html");

            }else if(value.equals("কাফেরদের ধ্বংস কামনা ও মুমিনদের নিরাপত্তার জন্য নূহ (আ)-এর দোয়া।")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/71.html");

            }else if(value.equals("সত্যের পথে অবিচল থাকার জন্য আল্লাহর সাহায্য লাভের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/72.html");

            }else if(value.equals("শিশু কথা বলার মত হলে যে দোয়া শেখাতে হবে")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/73.html");

            }else if(value.equals("যে আয়াত পাঠ করে দোয়া করলে দোয়া অবশ্যই কবুল হয়")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/74.html");

            }else if(value.equals("সাহাবায়ে কেরাম ও বুযুর্গানে দ্বীনের প্রতি ভালােবাসা বৃদ্ধির দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/75.html");

            }else if(value.equals("খাওয়ার পর শােকর এবং গায়েবী রিযক লাভের জন্য আল্লাহর দরবারে দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/76.html");

            }else if(value.equals("দ্বীনের ব্যাপারে মানুষের বিরােধিতার মুখে আল্লাহর সাহায্য প্রার্থনা")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/77.html");

            }else if(value.equals("মন থেকে মুসলমানদের প্রতি হিংসা-বিদ্বেষ মুছে যাওয়ার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/78.html");

            }else if(value.equals("সন্তান-সন্তুতি নামাযী হওয়া এবং পূর্বপুরুষদের মাগফিরাত কামনার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/79.html");

            }else if(value.equals("কোন নেয়ামত বা সাফল্য লাভের পর কৃতজ্ঞতা প্রকাশের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/80.html");

            }else if(value.equals("শুভকর্ম ও ইবাদত সুসম্পন্ন করার পর কবুল হওয়ার জন্য দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/81.html");

            }else if(value.equals("নেয়ামতের কৃতজ্ঞতা প্রকাশ ও নেক সন্তান লাভের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/82.html");

            }else if(value.equals("ঘরবাড়ি, ক্ষেতখামার ও সুসন্তানের জন্য দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/83.html");

            }else if(value.equals("অত্যাচার সীমা ছাড়িয়ে গেলে শত্রুর ধ্বংস কামনা করে দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/84.html");

            }else if(value.equals("অতীত জীবনের ভুল শােধরানাে, গুনাহের মার্জনা এবং ভবিষ্যতের সকল জটিল সংকট থেকে উদ্ধার পাওয়া ও দুশমনের ওপর জয়ী হওয়ার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/85.html");

            }else if(value.equals("আল্লাহর কাছে পূর্ণ আত্মসমর্পন এবং আল্লাহর সাহায্য লাভের দোয়া।")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/86.html");

            }else if(value.equals("ধন-দৌলত, ইজ্জত-সম্মান লাভ এবং অসম্ভবকে সম্ভব করার ব্যাপারে আল্লাহর সাহায্য লাভের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/87.html");

            }else if(value.equals("আল্লাহর আরশ বহনকারী ফেরেশতাদের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/88.html");

            }else if(value.equals("উপযুক্ত সন্তান ও বংশধর লাভের ব্যাপক দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/89.html");

            }else if(value.equals("জীবন ও জগৎ নিয়ে গবেষণায় সাফল্য এবং জীবনের সঠিক পথ ও গন্তব্য নির্ণয়ের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/90.html");

            }else if(value.equals("সূরা ফাতিহার ফযিলত")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/91.html");

            }else if(value.equals("আয়াতুল কুরসীর ফযীলত")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/92.html");

            }else if(value.equals("মে’রাজে প্রদত্ব সূরা বাকারার শেষ দুই আয়াত")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/93.html");

            }else if(value.equals("সূরা হাশরের শেষ তিন আয়াতের ফযীলত")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/94.html");

            }else if(value.equals("সূরা ইখলাসের ফযিলত")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/96.html");

            }else if(value.equals("সূরা ফালাকের ফযিলত")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/96.html");

            }else if(value.equals("সূরা নাস-এর ফযিলত")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/qurandoya/97.html");

            }

        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}