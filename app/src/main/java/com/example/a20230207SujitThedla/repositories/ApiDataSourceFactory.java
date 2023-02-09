package com.example.a20230207SujitThedla.repositories;

import androidx.lifecycle.MutableLiveData;
import androidx.paging.DataSource;
import androidx.paging.PageKeyedDataSource;

import com.example.a20230207SujitThedla.models.SchoolDetails;

import javax.inject.Inject;

public class ApiDataSourceFactory extends DataSource.Factory {
    private ApiDataSource mApiDataSource;
    private MutableLiveData<PageKeyedDataSource<Integer, SchoolDetails>> dataSourceMutableLiveData = new MutableLiveData<>();

    @Inject
    public ApiDataSourceFactory(ApiDataSource apiDataSource) {
        this.mApiDataSource = apiDataSource;
    }

    @Override
    public DataSource create() {
        dataSourceMutableLiveData.postValue(mApiDataSource);
        return mApiDataSource;
    }
}
