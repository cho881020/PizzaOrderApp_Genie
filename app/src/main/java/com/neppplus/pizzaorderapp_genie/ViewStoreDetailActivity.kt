package com.neppplus.pizzaorderapp_genie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.neppplus.pizzaorderapp_genie.datas.Store
import kotlinx.android.synthetic.main.activity_view_store_detail.*

class ViewStoreDetailActivity : BaseActivity() {

    lateinit var mStoreData : Store

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store_detail)
        setupEvents()
        setValues()

    }

    override fun setupEvents() {

    }

    override fun setValues() {

        mStoreData = intent.getSerializableExtra("storeData") as Store

        Glide.with(mContext).load(mStoreData.logoURL).into(storeLogoImg)

        storePhoneNumTxt.text = mStoreData.phoneNum
        storeNameTxt.text = mStoreData.name

    }


}