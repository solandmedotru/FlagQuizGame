package ru.solandme.flagquizgame;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    public void updateGuessRows(SharedPreferences defaultSharedPreferences) {
    }

    public void updateRegions(SharedPreferences defaultSharedPreferences) {
    }

    public void resetQuiz() {
    }
}
