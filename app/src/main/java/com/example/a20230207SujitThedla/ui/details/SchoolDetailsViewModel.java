package com.example.a20230207SujitThedla.ui.details;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.a20230207SujitThedla.NYCApplication;
import com.example.a20230207SujitThedla.models.SatScores;
import com.example.a20230207SujitThedla.models.SchoolDetails;
import com.example.a20230207SujitThedla.repositories.AppRepository;

import javax.inject.Inject;

public class SchoolDetailsViewModel extends ViewModel {

    @Inject
    AppRepository appRepository;
    private SchoolDetails schoolDetails;

    public SchoolDetailsViewModel() {
        NYCApplication.getApplication().getAppComponent().inject(this);
    }

    public LiveData<SatScores> getSatScore(String dbn) {
        return appRepository.getSatScore(dbn);
    }

    public SchoolDetails getSchoolDetails() {
        return schoolDetails;
    }

    public void setSchoolDetails(SchoolDetails schoolDetails) {
        this.schoolDetails = schoolDetails;
    }

}
