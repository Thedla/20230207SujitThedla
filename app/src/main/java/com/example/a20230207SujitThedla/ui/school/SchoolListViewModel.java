package com.example.a20230207SujitThedla.ui.school;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.paging.PagedList;

import com.example.a20230207SujitThedla.NYCApplication;
import com.example.a20230207SujitThedla.models.SchoolDetails;
import com.example.a20230207SujitThedla.repositories.AppRepository;

import javax.inject.Inject;

public class SchoolListViewModel extends ViewModel {

    @Inject
    AppRepository appRepository;

    public SchoolListViewModel() {
        NYCApplication.getApplication().getAppComponent().inject(this);
    }

    public LiveData<PagedList<SchoolDetails>> getSchoolDetailsList() {
        return appRepository.getSchoolDetailsList();
    }
}
