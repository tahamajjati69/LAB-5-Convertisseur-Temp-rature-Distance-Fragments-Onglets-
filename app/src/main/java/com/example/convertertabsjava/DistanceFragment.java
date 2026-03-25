package com.example.convertertabsjava;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class DistanceFragment extends Fragment {
    RadioGroup rgDist;
    RadioButton rbKToM, rbMtoK;
    EditText etDistInput;
    Button btnConvertDist;
    TextView tvDistRes;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_distance,container, false);

        rgDist = view.findViewById(R.id.rgDist);
        rbKToM = view.findViewById(R.id.rbKmToMiles);
        rbMtoK = view.findViewById(R.id.rbMilesToKm);
        etDistInput = view.findViewById(R.id.etDistInput);
        btnConvertDist = view.findViewById(R.id.btnConvertDist);
        tvDistRes = view.findViewById(R.id.tvDistRes);

        btnConvertDist.setOnClickListener(v -> {
            String txt = etDistInput.getText().toString();
            if (TextUtils.isEmpty(txt)){
                Toast.makeText(getContext(), "Veuillez entrer une valeur", Toast.LENGTH_SHORT).show();
                return;
            }

            double val = Double.parseDouble(txt);
            double res;

            if (rbKToM.isChecked()){
                res = val * 0.6214;
            }else {
                res = val / 0.6214;
            }
            tvDistRes.setText("Résultat : " + String.format("%.2f", res));
        });
        return view;
    }
}
