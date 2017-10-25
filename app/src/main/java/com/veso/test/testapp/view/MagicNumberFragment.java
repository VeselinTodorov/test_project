package com.veso.test.testapp.view;

import android.arch.lifecycle.LifecycleFragment;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.veso.test.testapp.R;
import com.veso.test.testapp.controller.MagicNumberViewModel;
import com.veso.test.testapp.model.MagicNumber;
import com.veso.test.testapp.model.Prediction;

import org.w3c.dom.Text;

/**
 * Created by Veso on 5.10.2017 г..
 */

public class MagicNumberFragment extends LifecycleFragment {


	MagicNumberViewModel viewModel;

	TextView currentValueText;
	Button plusButton;
	Button minusButton;
	Button rollButton;

	@Override
	public void onActivityCreated(@Nullable Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		// Get views from layout
		currentValueText = (TextView) this.getView().findViewById(R.id.current_value_text);
		minusButton = (Button) this.getView().findViewById(R.id.minus_button);
		plusButton = (Button) this.getView().findViewById(R.id.plus_button);
		rollButton = (Button) this.getView().findViewById(R.id.roll_button);

		viewModel = ViewModelProviders.of(this).get(MagicNumberViewModel.class);
		viewModel.getNumber().observe(this, (number) -> {
			Log.d("Veso", "Number changed bro!");
			currentValueText.setText(String.valueOf(number));
		});

		minusButton.setOnClickListener((view) ->
				viewModel.setPrediction(new Prediction(Prediction.PREDICTION_SMALLER))
		);


		plusButton.setOnClickListener((view) ->
				viewModel.setPrediction(new Prediction(Prediction.PREDICTION_BIGGER))
		);

		rollButton.setOnClickListener((view) ->{
					viewModel.rollNumber();
				}
		);
	}

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		return inflater.inflate(R.layout.magic_number_fragment, container);
	}
}
