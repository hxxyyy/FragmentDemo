package com.edu.niit.fragmentdemo;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class AnotherRightFragment extends Fragment {
    private static final  String TAG = AnotherRightFragment.class.getSimpleName();


    public AnotherRightFragment() {
        // Required empty public constructor
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG,"AnotherRightFragment is onResume");
        MainActivity activity = (MainActivity) getActivity();

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i(TAG,"AnotherRightFragment is onAttach");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG,"AnotherRightFragment is onStop");
    }


    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG,"AnotherRightFragment is onStart");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i(TAG,"AnotherRightFragment is onActivityCreated");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG,"AnotherRightFragment is onPause");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"AnotherRightFragment is onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(TAG,"AnotherRightFragment is onDetach");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(TAG,"AnotherRightFragment is onDestroyView");
    }

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}

