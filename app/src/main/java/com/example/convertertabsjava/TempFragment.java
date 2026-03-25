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

public class TempFragment extends Fragment {
    RadioGroup rgTemp;
    RadioButton rbCtoF, rbFtoC;
    EditText etTempInput;
    Button btnConvertTemp;
    TextView tvTempRes;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_temp, container, false);

        rgTemp = view.findViewById(R.id.rgTemp);
        rbCtoF = view.findViewById(R.id.rbCtoF);
        rbFtoC = view.findViewById(R.id.rbFtoC);
        etTempInput = view.findViewById(R.id.etTempInput);
        btnConvertTemp = view.findViewById(R.id.btnConvertTemp);
        tvTempRes = view.findViewById(R.id.tvTempRes);

        btnConvertTemp.setOnClickListener(v -> {
            String txt = etTempInput.getText().toString();

            if (TextUtils.isEmpty(txt)){
                Toast.makeText(getContext(), "Veuillez entrer une valeur", Toast.LENGTH_SHORT).show();
                return;
            }

            double val = Double.parseDouble(txt);
            double res;

            if (rbCtoF.isChecked()){
                res = (1.8 * val) + 32;
            }else {
                res = (val - 32) / 1.8;
            }

            tvTempRes.setText("Résultat : " + String.format("%.2f", res));
        });

        return view;
    }
}
