package edu.cnm.deepdive.nicklocicero.prodev;

public class Page {

  private int mTitleResId;
  private int mDateResId;
  private int mTextResId;
  private int mImageId;

  public Page(int TitleResId, int DateResId, int TextResId, int imageId) {
    mTitleResId = TitleResId;
    mDateResId = DateResId;
    mTextResId = TextResId;
    mImageId = imageId;
  }

  public int getTextResId() {
    return mTextResId;
  }

  public void setTextResId(int textResId) {
    mTextResId = textResId;
  }

  public int getImageId() {
    return mImageId;
  }

  public void setImageId(int imageId) {
    mImageId = imageId;
  }

  public int getTitleResId() {
    return mTitleResId;
  }

  public void setTitleResId(int titleResId) {
    mTitleResId = titleResId;
  }

  public int getDateResId() {
    return mDateResId;
  }

  public void setDateResId(int dateResId) {
    mDateResId = dateResId;
  }

}
