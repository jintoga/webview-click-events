package com.example.dat.twodscrollviewtest;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

/**
 * Created by DAT on 10-Jan-16.
 */
public class WebAppInterface {
    Context mContext;

    /**
     * Instantiate the interface and set the context
     */
    WebAppInterface(Context c) {
        mContext = c;
    }

    /**
     * Show a toast from the web page
     */
    @JavascriptInterface
    public void clickedCage14() {
        Toast.makeText(mContext, "Сибирская косуля", Toast.LENGTH_SHORT).show();
    }

    @JavascriptInterface
    public void clickedCage32() {
        Toast.makeText(mContext, "Гималайский медведь", Toast.LENGTH_SHORT).show();
    }

    @JavascriptInterface
    public void clickedCage44() {
        Toast.makeText(mContext, "Кенгуру", Toast.LENGTH_SHORT).show();
    }

    @JavascriptInterface
    public void clickedCage48() {
        Toast.makeText(mContext, "Детская площадка", Toast.LENGTH_SHORT).show();
    }

}
