package pl.edu.agh.benchmark.locator.client.a8.ui.point;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import pl.edu.agh.benchmark.locator.client.a8.R;

public class pointFragment extends Fragment {

    private PointViewModel pointViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        pointViewModel =
                ViewModelProviders.of(this).get(PointViewModel.class);
        View root = inflater.inflate(R.layout.activity_item_list, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        pointViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
