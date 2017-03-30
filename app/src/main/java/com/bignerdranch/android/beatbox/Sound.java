package com.bignerdranch.android.beatbox;

/**
 * Created by Administrator on 2017/2/26.
 */
public class Sound {
    private String mAssetPath;
    private String mName;
    public Sound(String assetPath){
        mAssetPath = assetPath;
        String [] components = assetPath.split("/");
        String filename = components[components.length - 1];
        mName = filename.replace(".wav","");
    }
    public String getmAssetPath(){
        return mAssetPath;
    }
    public String getmName(){
        return mName;
    }

}
