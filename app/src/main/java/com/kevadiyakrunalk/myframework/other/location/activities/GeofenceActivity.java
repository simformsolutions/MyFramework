package com.kevadiyakrunalk.myframework.other.location.activities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.kevadiyakrunalk.mvvmarchitecture.MvvmActivity;
import com.kevadiyakrunalk.mvvmarchitecture.common.BindingConfig;
import com.kevadiyakrunalk.myframework.R;
import com.kevadiyakrunalk.myframework.databinding.ActivityGeofenceBinding;
import com.kevadiyakrunalk.myframework.other.location.viewmodels.GeofenceViewModel;

public class GeofenceActivity extends MvvmActivity<ActivityGeofenceBinding, GeofenceViewModel> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Toolbar toolbar = getBinding().toolbar;
        setSupportActionBar(toolbar);
        if(getSupportActionBar() != null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @NonNull
    @Override
    public BindingConfig getBindingConfig() {
        return new BindingConfig(R.layout.activity_geofence);
    }

    @NonNull
    @Override
    public GeofenceViewModel createViewModel() {
        return new GeofenceViewModel(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home)
            onBackPressed();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
