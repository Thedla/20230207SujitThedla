package com.example.a20230207SujitThedla.di;


import com.example.a20230207SujitThedla.NYCApplication;
import com.example.a20230207SujitThedla.repositories.ApiDataSourceFactory;
import com.example.a20230207SujitThedla.ui.details.SchoolDetailsViewModel;
import com.example.a20230207SujitThedla.ui.school.SchoolListViewModel;
import com.example.a20230207SujitThedla.ui.school.adapter.SchoolViewModel;


import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(NYCApplication application);

    void inject(ApiDataSourceFactory apiDataSourceFactory);

    void inject(SchoolListViewModel schoolListViewModel);

    void inject(SchoolViewModel schoolViewModel);

    void inject(SchoolDetailsViewModel schoolDetailsViewModel);

}
