package com.veso.test.testapp.controller;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.veso.test.testapp.model.Prediction;
import com.veso.test.testapp.util.OneToFiftyRandomizer;
import com.veso.test.testapp.util.Randomizer;

import java.util.ArrayList;
import java.util.List;

public class MagicNumberViewModel extends ViewModel {
	MutableLiveData<Integer> number;

	Randomizer randomizer;

	Prediction prediction;

	MutableLiveData<List<Prediction>> predictionLog;

	public MagicNumberViewModel() {
		number = new MutableLiveData<>();
		number.setValue(25);
		randomizer = new OneToFiftyRandomizer();
		predictionLog = new MutableLiveData<>();
		predictionLog.setValue(new ArrayList<>());
	}

	public void rollNumber() {
		// Roll if prediction is set
		if (prediction != null) {
			// Roll a new number

			int newNumnber = randomizer.getRandomNumber(number.getValue());
			prediction.setResultNumber(newNumnber);
			number.setValue(newNumnber);

			// If correct prediction add prediction to log
			if (prediction.isCorrect()) {
				predictionLog.getValue().add(prediction);
			} else {
				predictionLog.getValue().clear();
			}
			prediction = null;


		}
	}

	public LiveData<Integer> getNumber() {
		if (number == null) {
			number = new MutableLiveData<>();
		}
		return number;
	}

	public void setPrediction(Prediction prediction) {
		this.prediction = prediction;
		prediction.setCurrentNumber(number.getValue());
	}
}
