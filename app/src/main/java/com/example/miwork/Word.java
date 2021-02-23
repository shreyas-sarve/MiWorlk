package com.example.miwork;
//Contains English And MiWork data
public class Word {
    //For English Translation

    private String mDefaultTranslation;
    //For Miwork Translation

    private String mMiworkTranslation;

    private static  final int NO_IMAGE_ID=-1;
    private int mImageResourceId=NO_IMAGE_ID; //Initializing to counter the phrases part
    //id is and integer <----
public Word(String defaultTranslation,String miworkTranslation)
  {
      mDefaultTranslation=defaultTranslation;
      mMiworkTranslation=miworkTranslation;
  }
    public Word(String defaultTranslation,String miworkTranslation,int imageId)
    {
        mDefaultTranslation=defaultTranslation;
        mMiworkTranslation=miworkTranslation;
        mImageResourceId=imageId;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiworkTranslation() {
        return mMiworkTranslation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }
    public  boolean hasImage(){
    return mImageResourceId!=NO_IMAGE_ID;
    }
}

