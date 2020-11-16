package com.example.tabs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class SecondActivity extends Fragment

{ @NonNull
    @Override
    public View onCreateView (@NonNull LayoutInflater inflater, @NonNull ViewGroup container,
                              @NonNull Bundle savedIntanceState) {
    return inflater.inflate(R.layout.second_main, container, false);
}
}
