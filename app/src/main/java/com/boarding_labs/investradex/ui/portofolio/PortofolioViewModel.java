package com.boarding_labs.investradex.ui.portofolio;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PortofolioViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PortofolioViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}