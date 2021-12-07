package com.dizcoding.sample

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.dizcoding.showcase.ShowCaseBuilder
import com.dizcoding.showcase.ShowCaseContentPosition
import com.dizcoding.showcase.ShowCaseObject

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val showCaseDialog = ShowCaseBuilder()
            .titleTextColorRes(R.color.blue)
            .titleTextSizeRes(R.dimen.text_title)
            .shadowColorRes(R.color.shadow)
            .textColorRes(R.color.dark_gray)
            .textSizeRes(R.dimen.text_normal)
            .spacingRes(R.dimen.spacing_normal)
            .backgroundContentColorRes(R.color.white)
            .circleIndicatorBackgroundDrawableRes(R.drawable.selector_circle_blue)
            .useSkipWord(true)
            .setLineColorRes(R.color.blue)
            .useCircleIndicator(true)
            .clickable(false)
            .build()
        val textView = findViewById<TextView>(R.id.tv)
        val tvOne = findViewById<TextView>(R.id.tvOne)
        val tvTwo = findViewById<TextView>(R.id.tvTwo)
        val showCaseList = arrayListOf(
            ShowCaseObject(
                textView,
                "Akun Anda",
                "Lengkapi profil anda dan lihat nomor VA dan e-sertifikat kepesertaan disini.",
                ShowCaseContentPosition.TOP
            ),
            ShowCaseObject(
                tvOne,
                "Akun Anda",
                "Lengkapi profil anda dan lihat nomor VA dan e-sertifikat kepesertaan disini.",
                ShowCaseContentPosition.BOTTOM
            ),ShowCaseObject(
                tvTwo,
                "Akun Anda",
                "Lengkapi profil anda dan lihat nomor VA dan e-sertifikat kepesertaan disini.",
                ShowCaseContentPosition.TOP
            )
        )

        showCaseDialog.show(this, "", showCaseList)

    }
}