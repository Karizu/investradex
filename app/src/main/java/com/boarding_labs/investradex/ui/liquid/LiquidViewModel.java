package com.boarding_labs.investradex.ui.liquid;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LiquidViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public LiquidViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}