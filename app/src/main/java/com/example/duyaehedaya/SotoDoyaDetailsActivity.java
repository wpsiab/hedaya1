package com.example.duyaehedaya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;

public class SotoDoyaDetailsActivity extends AppCompatActivity {

    private TextView textView;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soto_doya_details);

        textView = findViewById(R.id.sotoDoyaDetailsId);
        webView = findViewById(R.id.sotoDoyaDetailsWebViewId);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            String value = bundle.getString("SotoDoyaTitle");
            if(value.equals("১। ঋণ থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/1.html");
            }else if(value.equals("২। ব্যবসায় ক্ষতি থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/2.html");
            }else if(value.equals("৩। ধাতুদৌর্বল্য থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/3.html");
            }else if(value.equals("৪। কানের ক্ষতি থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/4.html");
            }else if(value.equals("৫। চোখের অপকারিতা থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/5.html");
            }else if(value.equals("৬। জিহ্বার অপকারিতা থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/6.html");
            }else if(value.equals("৭। মনের অপকারিতা থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/7.html");
            }else if(value.equals("৮। খারাপ চরিত্র থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/8.html");
            }else if(value.equals("৯। খারাপ কাজ থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/9.html");
            }else if(value.equals("১০। মন্দ আকাঙ্খ থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/10.html");
            }else if(value.equals("১১। শ্বেতরােগ থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/11.html");
            }else if(value.equals("১২। কুষ্ঠরােগ থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/12.html");
            }else if(value.equals("১৩। মাতলামী থেকে বাঁচার দোয়া।")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/13.html");
            }else if(value.equals("১৪। সর্বপ্রকার খারাপ ব্যাধি থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/14.html");
            }else if(value.equals("১৫। ক্ষুধার কষ্ট থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/15.html");
            }else if(value.equals("১৬। বিশ্বাসঘাতকতা থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/16.html");
            }else if(value.equals("১৭। সত্যের বিরুদ্ধাচরণ থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/17.html");
            }else if(value.equals("১৮। কপটতা থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/18.html");
            }else if(value.equals("১৯। কাপুরুষতা থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/19.html");
            }else if(value.equals("২০। কৃপণতা থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/20.html");
            }else if(value.equals("২১। বার্ধক্যের কষ্ট থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/21.html");
            }else if(value.equals("২২। অন্তরের কুটিলতা থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/22.html");
            }else if(value.equals("২৩। যে এলেম উপকারে আসে না থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/23.html");
            }else if(value.equals("২৪। যে অন্তর গলে না- তা থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/24.html");
            }else if(value.equals("২৫। যে মন তৃপ্তি লাভ করে না-তা থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/25.html");
            }else if(value.equals("২৬। যে দোয়া কবুল হয় না তা থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/26.html");
            }else if(value.equals("২৭। অভাব থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/27.html");
            }else if(value.equals("২৮। অস্বচ্ছতা থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/28.html");
            }else if(value.equals("২৯। অপমান থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/29.html");
            }else if(value.equals("৩০। অত্যাচারী হওয়া থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/30.html");
            }else if(value.equals("৩১। অত্যাচারীত হওয়া থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/31.html");
            }else if(value.equals("৩২। বিপদের কষ্ট থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/32.html");
            }else if(value.equals("৩৩। দুর্ভাগ্যের আক্রমণ থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/33.html");
            }else if(value.equals("৩৪। তকদীরের মন্দ থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/34.html");
            }else if(value.equals("৩৫। দুশমনের হাসি-উল্লাস থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/35.html");
            }else if(value.equals("৩৬। দুশ্চিন্তা মুক্ত হওয়ার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/36.html");
            }else if(value.equals("৩৭। শােক থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/37.html");
            }else if(value.equals("৩৮। অক্ষমতা থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/38.html");
            }else if(value.equals("৩৯। সংযমী হওয়ার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/39.html");
            }else if(value.equals("৪০। পবিত্র আত্মার জন্য দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/40.html");
            }else if(value.equals("৪১। আল্লাহ্র নেয়ামত যাতে কমে না যায় তজ্জন্য দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/41.html");
            }else if(value.equals("৪২। শান্তির বিবর্তন থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/42.html");
            }else if(value.equals("৪৩। আকস্মিক দুর্ঘটনা থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/43.html");
            }else if(value.equals("৪৪। আল্লাহ্র অসন্তোষ থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/44.html");
            }else if(value.equals("৪৫। কৃতকর্মের অপকারিতা থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/45.html");
            }else if(value.equals("৪৬। যে কাজ করা হয়নি তার ক্ষতি থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/46.html");
            }else if(value.equals("৪৭। উপরে কিছু ধ্বসে পড়া থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/47.html");
            }else if(value.equals("৪৮। উপর হতে পড়ে যাওয়া থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/48.html");
            }else if(value.equals("৪৯। পানিতে ডুবে যাওয়া থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/49.html");
            }else if(value.equals("৫০। আগুনে পুড়ে যাওয়া থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/50.html");
            }else if(value.equals("৫১। বার্ধক্য থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/51.html");
            }else if(value.equals("৫২। পথভ্রষ্ট হয়ে না মরার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/52.html");
            }else if(value.equals("৫৩। দংশিত হতে মৃত্যুবরণ করা থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/53.html");
            }else if(value.equals("৫৪। মওতের সময় শয়তানের গােমরাহী থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/54.html");
            }else if(value.equals("৫৫। মানুষের জবরদস্তি থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/55.html");
            }else if(value.equals("৫৬। পাপ থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/56.html");
            }else if(value.equals("৫৭। রাতের অমঙ্গল হতে থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/57.html");
            }else if(value.equals("৫৮। দুনিয়ার ফেত্না থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/58.html");
            }else if(value.equals("৫৯। কবরের আযাব থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/59.html");
            }else if(value.equals("৬০। দোযখের আযাব থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/60.html");
            }else if(value.equals("৬১। অকর্মন্য বয়স থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/61.html");
            }else if(value.equals("৬২। অহঙ্কার থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/62.html");
            }else if(value.equals("৬৩। উচ্চ পরিষদে স্থান চাওয়ার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/63.html");
            }else if(value.equals("৬৪। লােভ লালসা থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/64.html");
            }else if(value.equals("৬৫। সুস্থ স্বাস্থ্য চাওয়ার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/65.html");
            }else if(value.equals("৬৬। উত্তম চরিত্রে চরিত্রবান হওয়ার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/66.html");
            }else if(value.equals("৬৭। আল্লাহর হুকুমে রাযী থাকার তওফীক চাওয়ার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/67.html");
            }else if(value.equals("৬৮। অন্তরের কপটতা থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/68.html");
            }else if(value.equals("৬৯। লােক দেখানাে কাজ থেকে বাঁচার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/69.html");
            }else if(value.equals("৭০। জবানকে মিথ্যা থেকে পবিত্র করার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/70.html");
            }else if(value.equals("৭১। আল্লাহ্র মহব্বত চাওয়ার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/71.html");
            }else if(value.equals("৭২। আল্লাহর প্রিয় বান্দাদের ভালবাসা চাওয়ার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/72.html");
            }else if(value.equals("৭৩। যে কাজ আল্লাহর দিকে নিয়ে যায় সে কাজের জন্য দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/73.html");
            }else if(value.equals("৭৪। মঙ্গলজনক অবস্থায় বেঁচে থাকার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/74.html");
            }else if(value.equals("৭৫। কল্যাণকর মৃত্যুর জন্য দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/75.html");
            }else if(value.equals("৭৬। সত্য কথা বলার সাহস চাওয়ার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/76.html");
            }else if(value.equals("৭৭। মধ্যপ্রন্থা অবলম্বন করার তওফীক চাওয়ার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/77.html");
            }else if(value.equals("৭৮। রাতে বিছানায় শুয়ে গালের নিচে হাত রেখে পড়ার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/78.html");
            }else if(value.equals("৭৯। ঘুম থেকে জেগে উঠে পড়ার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/79.html");
            }else if(value.equals("৮০। পায়খানায় প্রবেশকালে দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/80.html");
            }else if(value.equals("৮১। পায়খানা হতে বহির্গত হওয়ার সময়ে দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/81.html");
            }else if(value.equals("৮২। মসজিদে প্রবেশকালের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/82.html");
            }else if(value.equals("৮৩। মসজিদ হতে বের হওয়ার সময়ের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/83.html");
            }else if(value.equals("৮৪। রােযা ইফতারের সময়ের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/84.html");
            }else if(value.equals("৮৫। ইফতারের শেষের দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/85.html");
            }else if(value.equals("৮৬। খাওয়া শেষ করার পর এই দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/86.html");
            }else if(value.equals("৮৭। দুধ ছাড়া অন্য কোন খাবার খেয়ে দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/87.html");
            }else if(value.equals("৮৮। দুধ পান করার পর দোয়া।")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/87.html");
            }else if(value.equals("৮৯। কেউ যিয়াফত দিয়ে খাওয়ালে খাওয়ার শেষে যিয়াফতকারীর জন্য এই দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/88.html");
            }else if(value.equals("৯০। অশেষ নেয়ামত চাওয়ার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/89.html");
            }else if(value.equals("৯১। চোখ জুড়াবার জিনিস চাওয়ার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/90.html");
            }else if(value.equals("৯২। ঈমানের ভূষণে ভূষিত হওয়ার দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/91.html");
            }else if(value.equals("৯৩। পথপ্রাপ্ত ও পথ প্রদর্শক হওয়ার দোয়া।")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/92.html");
            }else if(value.equals("৯৪। তওবা কবুল হওয়ার জন্য দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/93.html");
            }else if(value.equals("৯৫। গােনাহ ধুয়ে দেওয়ার জন্য দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/94.html");
            }else if(value.equals("৯৬। ডাকে সাড়া দেওয়ার জন্য দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/95.html");
            }else if(value.equals("৯৭। নব বর-বধুর জন্যে দোয়া")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/96.html");
            }else if(value.equals("৯৮। উপরে উঠার সময় বলতে হয়")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/97.html");
            }else if(value.equals("৯৯। নিচে নামার সময় বলতে হয়।")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/99.html");
            }else if(value.equals("১০০। চিন্তাগ্রস্ত হলে এই দোয়া পড়তে হয়।")){
                textView.setText(value);
                webView.loadUrl("file:///android_asset/smalldoya/100.html");
            }

        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}