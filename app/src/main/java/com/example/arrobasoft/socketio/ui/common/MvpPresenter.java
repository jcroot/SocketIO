package com.example.arrobasoft.socketio.ui.common;

/**
 * Created by arrobasoft on 1/25/17.
 */

public interface MvpPresenter<V> {
    void attachView(V view);
    void detachView();
}
