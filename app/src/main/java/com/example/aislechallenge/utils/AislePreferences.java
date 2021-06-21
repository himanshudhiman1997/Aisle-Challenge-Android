package com.example.aislechallenge.utils;

import android.content.Context;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.rxjava2.RxPreferenceDataStoreBuilder;
import androidx.datastore.rxjava2.RxDataStore;

import io.reactivex.Flowable;
import io.reactivex.Single;

//public class AislePreferences(Context context) {
//    RxDataStore<Preferences> dataStore =
//            new RxPreferenceDataStoreBuilder(context, /*name=*/ "aisle").build();
//
//    Preferences.Key<String> TOKEN = PreferencesKeys.stringKey("token");
//
//
//    Flowable<String> flow = dataStore.data().map(prefs -> prefs.get(TOKEN));
//
//    public Flowable<String> getFlow() {
//        return flow;
//    }
//
//    Single<Preferences> updateResult =  dataStore.updateDataAsync(prefsIn -> {
//        MutablePreferences mutablePreferences = prefsIn.toMutablePreferences();
//        String currentToken = prefsIn.get(TOKEN);
//        mutablePreferences.set(TOKEN, currentToken != null ? currentToken : "");
//        return Single.just(mutablePreferences);
//    });
//
//}
