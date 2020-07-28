package com.boarding_labs.investradex.ui.indicate;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class IndicateViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public IndicateViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is send fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}