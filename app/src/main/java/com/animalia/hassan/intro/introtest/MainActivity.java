package com.animalia.hassan.intro.introtest;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.TypefaceSpan;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

public class MainActivity extends IntroActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//         /* Enable/disable fullscreen */
//        setFullscreen(true);
        super.onCreate(savedInstanceState);



        setButtonBackVisible(false);
        setButtonNextVisible(false);
        setButtonCtaVisible(true);
        setButtonCtaTintMode(BUTTON_CTA_TINT_MODE_BACKGROUND);
        TypefaceSpan labelSpan = new TypefaceSpan(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP ? "sans-serif-medium" : "sans serif");
        SpannableString label = SpannableString.valueOf(getString(R.string.intro_button_content));
        label.setSpan(labelSpan, 0, label.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        setButtonCtaLabel(label);

        setPageScrollDuration(500);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            setPageScrollInterpolator(android.R.interpolator.fast_out_slow_in);
        }
        addSlide(new SimpleSlide.Builder()
                .title(R.string.intro_slide_title_1)
                .description(R.string.intro_slide_description_1)
                .image(R.drawable.intro_one_part)
                .background(R.color.gooAndBackone)
                .backgroundDark(R.color.gooAndBackoneDark)
                .layout(R.layout.intro_slide_content)
                .build());
        addSlide(new SimpleSlide.Builder()
                .title(R.string.intro_slide_title_2)
                .description(R.string.intro_slide_description_2)
                .image(R.drawable.intro_two_part)
                .background(R.color.gooAndBacktfour)
                .backgroundDark(R.color.gooAndBackfourDark)
                .layout(R.layout.intro_slide_content)
                .build());
        addSlide(new SimpleSlide.Builder()
                .title(R.string.intro_slide_title_3)
                .description(R.string.intro_slide_description_3)
                .image(R.drawable.intro_three_part)
                .background(R.color.gooAndBackthree)
                .backgroundDark(R.color.gooAndBackthreeDark)
                .layout(R.layout.intro_slide_content)
                .build());
        addSlide(new SimpleSlide.Builder()
                .title(R.string.intro_slide_title_4)
                .description(R.string.intro_slide_description_4)
                .image(R.drawable.intro_four_part)
                .background(R.color.gooAndBacktwo)
                .backgroundDark(R.color.gooAndBacktwoDark)
                .layout(R.layout.intro_slide_content)
                .build());
        addSlide(new SimpleSlide.Builder()
                .title(R.string.intro_slide_title_5)
                .description(R.string.intro_slide_description_5)
                .image(R.drawable.intro_one_part)
                .background(R.color.gooAndBacktfive)
                .backgroundDark(R.color.gooAndBackfiveDark)
                .layout(R.layout.intro_slide_content)
                .build());


        autoplay(2500, INFINITE);
    }
//        /**
//         * Standard slide (like Google's intros)
//         */
////           /* Enable/disable skip button */
////
////        setSkipEnabled(true);
////
////        /* Enable/disable finish button */
////        setFinishEnabled(true);


}
