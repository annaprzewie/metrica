package pl.edu.agh.benchmark.locator.client.a8.ui.home;

import android.content.Intent;
import android.widget.Button;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import pl.edu.agh.benchmark.locator.client.a8.ItemListActivity;
import pl.edu.agh.benchmark.locator.client.a8.R;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}