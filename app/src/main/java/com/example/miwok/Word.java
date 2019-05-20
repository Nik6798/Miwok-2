package com.example.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    private int mImageResourceId=NO_Image;
    private static final int NO_Image=-1;

    private int maudio;
    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation,int audiofile) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        maudio=audiofile;
    }

    public Word(String defalutTranslation,String MiwokTranslation,int ResourceId,int audiofile){
        mDefaultTranslation=defalutTranslation;
        mMiwokTranslation=MiwokTranslation;
        mImageResourceId=ResourceId;
        maudio=audiofile;
    }
    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public  int getImageResourceId()
    {
        return mImageResourceId;

    }

    public boolean hasImage(){
        return mImageResourceId!=NO_Image;
    }

    public int getaudio(){
        return maudio;
    }
} 