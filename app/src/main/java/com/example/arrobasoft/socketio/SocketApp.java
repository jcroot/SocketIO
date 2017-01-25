package com.example.arrobasoft.socketio;

import android.app.Application;

import java.net.URISyntaxException;

import io.socket.client.IO;
import io.socket.client.Socket;

/**
 * Created by arrobasoft on 1/25/17.
 */

public class SocketApp extends Application {

    private static SocketApp app;

    private Socket mSocket;
    {
        try{
            mSocket = IO.socket(BuildConfig.SERVER_URL);
        }catch (URISyntaxException e){
            throw  new RuntimeException(e);
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;

        mSocket.connect();
    }

    public static SocketApp getApp(){
        return app;
    }

    public Socket getSocket(){
        return mSocket;
    }
}
