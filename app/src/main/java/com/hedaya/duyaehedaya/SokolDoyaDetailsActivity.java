package com.hedaya.duyaehedaya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class SokolDoyaDetailsActivity extends AppCompatActivity {

    private TextView textView;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sokol_doya_details);

        getSupportActionBar().setTitle("বিস্তারিত বর্ণনা");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textView = findViewById(R.id.sokolDoyaDetailsId);
        webView = findViewById(R.id.sokolDoyaDetailsWebViewId);

        Bundle bundle = getIntent().getExtras();

        if(bundle!=null){

            String value = bundle.getString("sokolDoyaTitle");

            if(value.equals("সকাল সন্ধ্যায় পঠিতব্য দোয়া সমূহ")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/1.html");
            }else if(value.equals("শােয়ার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/2.html");
            }else if(value.equals("পার্শ্ব পরিবর্তনের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/3.html");
            }else if(value.equals("দ্রিাবস্থায় ভয় পেয়ে অস্থির হলে দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/4.html");
            }else if(value.equals("নিদ্রাবস্থায় ভাল বা মন্দ স্বপ্ন দেখলে করণীয়")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/5.html");
            }else if(value.equals("শয্যা ত্যাগের দোয়া সমূহ")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/6.html");
            }else if(value.equals("মােরগ, গাধা ও কুকুরের ডাক শুনে দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/7.html");
            }else if(value.equals("কাপড় পরিধানের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/8.html");
            }else if(value.equals("নতুন কাপড় পরিধানের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/9.html");
            }else if(value.equals("পায়খানায় প্রবেশের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/10.html");
            }else if(value.equals("পায়খানা হতে বের হওয়ার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/11.html");
            }else if(value.equals("ওযু করার পূর্বের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/12.html");
            }else if(value.equals("ওযুর পরের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/13.html");
            }else if(value.equals("বাড়ী থেকে বের হওয়ার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/14.html");
            }else if(value.equals("মসজিদে প্রবেশ করা ও বের হওয়ার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/15.html");
            }else if(value.equals("আযানের জওয়াব এবং আযান শেষের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/16.html");
            }else if(value.equals("ইক্বামতের জবাব")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/17.html");
            }else if(value.equals("তাকবীরে তাহরীমার পর পঠিত দোয়া সমূহ")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/18.html");
            }else if(value.equals("রুকূর দোয়া সমূহ")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/19.html");
            }else if(value.equals("রুকূ হতে উঠার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/20.html");
            }else if(value.equals("সিজদার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/21.html");
            }else if(value.equals("দুই সিজদার মাঝের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/22.html");
            }else if(value.equals("তাশাহ্হুদ")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/23.html");
            }else if(value.equals("রাসূল (ছাঃ)-এর প্রতি দরূদ পাঠ")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/24.html");
            }else if(value.equals("সালাম ফিরানাের পূর্বের দোয়া সমূহ")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/25.html");
            }else if(value.equals("সালাম ফিরানাের পর পঠিত দোয়া সমূহ")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/26.html");
            }else if(value.equals("কেউ দোয়া চাইলে কি বলতে হবে?")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/27.html");
            }else if(value.equals("বাসর রাতে স্বামী-স্ত্রী এক সঙ্গে ছালাত আদায়ের পর দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/28.html");
            }else if(value.equals("বাড়ীতে প্রবেশের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/29.html");
            }else if(value.equals("চিন্তা দূর করার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/30.html");
            }else if(value.equals("বিপদাপদের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/31.html");
            }else if(value.equals("শত্রু এবং শক্তিধর ব্যক্তির সাক্ষাতকালে দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/32.html");
            }else if(value.equals("ঋণমুক্ত হওয়ার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/33.html");
            }else if(value.equals("বাচ্চাদের জন্য পরিত্রাণ চাওয়ার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/34.html");
            }else if(value.equals("রােগী দেখার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/35.html");
            }else if(value.equals("বিভিন্ন রােগে ঝাড়-ফুঁকের কয়েকটি দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/36.html");
            }else if(value.equals("জীবনের নিরাশার সময় বলবে")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/37.html");
            }else if(value.equals("যে কোন বিপদে পতিত ব্যক্তির দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/38.html");
            }else if(value.equals("মৃত ব্যক্তির চোখ বন্ধ করার সময় পঠিত দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/39.html");
            }else if(value.equals("জানাযার ছালাতে মৃত ব্যক্তির জন্য দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/40.html");
            }else if(value.equals("কবরে লাশ রাখার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/41.html");
            }else if(value.equals("মৃত ব্যক্তিকে দাফন করার পর দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/42.html");
            }else if(value.equals("কবর যিয়ারতের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/43.html");
            }else if(value.equals("ঝড় তুফানের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/44.html");
            }else if(value.equals("মেঘের গর্জন শুনলে পঠিত দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/45.html");
            }else if(value.equals("বৃষ্টি প্রার্থনার দোয়া সমূহ")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/46.html");
            }else if(value.equals("বৃষ্টি বন্ধের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/47.html");
            }else if(value.equals("নতুন চাঁদ দেখে দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/48.html");
            }else if(value.equals("ইফতারের সময় পঠিত দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/49.html");
            }else if(value.equals("খানা খাওয়ার পূর্বের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/50.html");
            }else if(value.equals("খাওয়ার পরের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/51.html");
            }else if(value.equals("দুধ পান করার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/52.html");
            }else if(value.equals("মেযবানের জন্য মেহমানের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/53.html");
            }else if(value.equals("যে পানাহার করাল তার জন্য দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/54.html");
            }else if(value.equals("নতুন ফল দেখার পর পঠিত দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/55.html");
            }else if(value.equals("নব দম্পতির জন্য দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/56.html");
            }else if(value.equals("নতুন স্ত্রী গ্রহণ অথবা চতুষ্পদ জন্তু ক্রয়ের সময় কপালে হাত রেখে পঠিতব্য দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/57.html");
            }else if(value.equals("স্ত্রী সহবাসের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/58.html");
            }else if(value.equals("ক্রোধ দমনের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/59.html");
            }else if(value.equals("বিপন্ন লােককে দেখে দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/60.html");
            }else if(value.equals("মজলিসের মধ্যে পঠিতব্য দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/61.html");
            }else if(value.equals("মজলিসের কাফফারা")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/62.html");
            }else if(value.equals("কুরআন তেলাওয়াত ও মজলিস শেষের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/63.html");
            }else if(value.equals("কেউ সম্পদ দান করার জন্য পেশ করলে তার জন্য দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/64.html");
            }else if(value.equals("ঋণ পরিশােধের সময় ঋণদাতার জন্য দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/65.html");
            }else if(value.equals("শিরক থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/66.html");
            }else if(value.equals("অশুভ লক্ষণ বা কোন জিনিস অপসন্দ হলে দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/67.html");
            }else if(value.equals("পশুর পিঠে অথবা যানবাহনে আরােহণের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/68.html");
            }else if(value.equals("সফরের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/69.html");
            }else if(value.equals("নৌকা ও ভাসমান যানে আরােহণের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/70.html");
            }else if(value.equals("গ্রামে বা শহরে প্রবেশের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/71.html");
            }else if(value.equals("বাজারে প্রবেশের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/72.html");
            }else if(value.equals("সফরকারীর জন্য গৃহে অবস্থানকারীদের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/73.html");
            }else if(value.equals("উপরে আরােহনকালে এবং নীচে নামার সময় দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/74.html");
            }else if(value.equals("আনন্দদায়ক অথবা ক্ষতিকারক কিছু দেখলে পঠিত দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/75.html");
            }else if(value.equals("কেউ প্রশংসা করলে কি বলবে")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/76.html");
            }else if(value.equals("আশ্চর্যজনক অবস্থায় ও আনন্দের সময় পঠিতব্য দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/77.html");
            }else if(value.equals("হাঁচিদাতা ও শ্রোতার জন্য পঠিতব্য দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/78.html");
            }else if(value.equals("অমুসলিমদের হাঁচির জবাব অমুসলিমদের হাঁচি আসলে বলবে")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/79.html");
            }else if(value.equals("অমুসলিমদের সালামের জবাব")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/80.html");
            }else if(value.equals("অন্তরকে পাপ কাজ থেকে বাঁচিয়ে রাখার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/81.html");
            }else if(value.equals("অন্তরকে সব সময় আল্লাহর আনুগত্যে রাখার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/82.html");
            }else if(value.equals("দরজা-জানালা বন্ধ করা এবং যে কোন খাদ্যদ্রব্য ঢাকার সময় দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/83.html");
            }else if(value.equals("তিলাওয়াতকারী ও শ্রোতাদের আয়াতের জবাব (ছালাতে বা বাইরে)")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/84.html");
            }else if(value.equals("কতিপয় গুরুত্বপূর্ণ সূরা ও আয়াতের ফযীলত")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/85.html");
            }else if(value.equals("মুমূর্ষ ব্যক্তির নিকট পঠিতব্য দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/86.html");
            }else if(value.equals("পিতা-মাতার জন্য দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/87.html");
            }else if(value.equals("দুঃখ-কষ্টের সময় পঠিতব্য দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/88.html");
            }else if(value.equals("সন্তান ও পরিবারের জন্য দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/89.html");
            }else if(value.equals("সুসন্তান প্রার্থনার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/90.html");
            }else if(value.equals("কারাে বিদ্যা-বুদ্ধির জন্য দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/91.html");
            }else if(value.equals("অন্যের মাধ্যমে সালাম পাঠালে তার উত্তর")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/92.html");
            }else if(value.equals("আল্লাহর গুণবাচক নাম সমূহ")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/93.html");
            }else if(value.equals("তাহাজ্জুদ ছলাতের পূর্বে তেলাওয়াত ও তাসবীহ")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/94.html");
            }else if(value.equals("জান্নাত চাওয়া ও জাহান্নাম হতে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/95.html");
            }else if(value.equals("ইদায়নের তাকবীর বা দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/96.html");
            }else if(value.equals("হজ্জ ও ওমরাহ পালনকারী মুহরিম ব্যক্তির তালবিয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/97.html");
            }else if(value.equals("রুকনে ইয়ামনী এবং হাজারে আসওয়াদের মাঝে দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/98.html");
            }else if(value.equals("ছাফা ও মারওয়া পাহাড়ের উপর দাঁড়িয়ে পঠিতব্য দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/99.html");
            }else if(value.equals("আরাফার মাঠে দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/100.html");
            }else if(value.equals("মাশআরে হারামের নিকট যিকির")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/101.html");
            }else if(value.equals("পাথর নিক্ষেপের সময় তাকবীর")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/102.html");
            }else if(value.equals("কুরবানীর দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/103.html");
            }else if(value.equals("কোন ব্যক্তি কোন উপকার বা ভাল আচরণ করলে তার জন্য")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/104.html");
            }else if(value.equals("আয়না দেখার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/105.html");
            }else if(value.equals("রাসূল (ছাঃ)-এর প্রতি দরূদ পাঠের ফযীলত")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/106.html");
            }else if(value.equals("কোন প্রাণী বা যানবাহনে আরােহণ কালে পা পিছলে গেলে পঠিতব্য দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/107.html");
            }else if(value.equals("ছালাতের মাঝে শয়তানের কুমন্ত্রণা হতে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/sokoldoya/108.html");
            }

        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}