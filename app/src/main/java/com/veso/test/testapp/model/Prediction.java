package com.veso.test.testapp.model;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Veso on 5.10.2017 г..
 */

public class Prediction {

	@Retention(RetentionPolicy.SOURCE)
	@IntDef({PREDICTION_BIGGER, PREDICTION_SMALLER})
	public @interface PredictionType {
	}

	public static final int PREDICTION_BIGGER = 1;
	public static final int PREDICTION_SMALLER = 2;

	int currentNumber;
	int resultNumber;
	int prediction;

	public Prediction(@PredictionType int predictionType) {

	}

	public int getCurrentNumber() {
		return currentNumber;
	}

	public void setCurrentNumber(int currentNumber) {
		this.currentNumber = currentNumber;
	}

	public int getResultNumber() {
		return resultNumber;
	}

	public void setResultNumber(int resultNumber) {
		this.resultNumber = resultNumber;
	}

	public int getPrediction() {
		return prediction;
	}


	public void setPrediction(@PredictionType int prediction) {
		this.prediction = prediction;
	}

	public boolean isCorrect() {
		return (currentNumber < resultNumber && prediction == PREDICTION_BIGGER) ||
				(currentNumber > resultNumber && prediction == PREDICTION_SMALLER);
	}
}
