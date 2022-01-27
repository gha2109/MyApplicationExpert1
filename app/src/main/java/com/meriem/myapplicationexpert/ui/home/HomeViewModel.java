package com.meriem.myapplicationexpert.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {
    private static LiveData<String> mText;
    private static LiveData<String> text;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
    }

    public static LiveData<String> getInterventions() {
        return mText;
    }

    public static LiveData<String> getText() {
        return text;
    }

    public static void setText(LiveData<String> text) {
        HomeViewModel.text = text;
    }
}

