package com.kitesoft.ex105alternativeresourcestest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Alternative Resource document [대체 리소스 제공]
        //https://developer.android.com/guide/topics/resources/providing-resources

        //앱이 구동되는 디바이스의 특성에 따라 res 리소스파일이 자동 선택되어 적용되는 기술
        // 앱의 해상도 밀도에 따른 아이콘 이미지 적용으로 이미 확인 - mipmap-hdpi, -mdpi, -xhdpi, xxhdpi ...

        //1. 현지화 앱 - 언어별 strings.xml >>   res/values-ko에 string.xml 추가
        //  [ New Resource File ] 에서 Available qualifier 메뉴에서 [Locale] >> 메뉴로 언어와 나라 선택가능

        //2. layout 방향 land(가로), port(세로) 에 따른 레이아웃 구조 변경 Imageview 를 아래 배치와 오른쪽 배치
        //  [ New Resource File ] 에서 Available qualifier 메뉴에서 [Orientation] >> 메뉴로 가로방향선택

        //3. themes 에 (night) 모드에 따라 텍스트 색상정보 대체 colors.xml 리소스  [res/values-night]
        //  [ New Resource File ] 에서 Available qualifier 메뉴에서 [Night Mode] >> Night 선택


        // * AndroidManifest.xml 에서 <activity> 속성에 android:configChanges="orientation|screenSize|uiMode"를 적용하면
        //   액티비티가 새로 만들어져서 기존 데이터가 모두 사라지는 문제는 발생하지 않지만 대체 리소스도 적용되지 않음. ***********************

    }
}