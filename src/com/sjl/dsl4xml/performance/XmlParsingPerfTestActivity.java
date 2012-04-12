package com.sjl.dsl4xml.performance;

import java.io.*;

import android.app.*;
import android.os.*;

public class XmlParsingPerfTestActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        ComparisonRunner _cr = new ComparisonRunner();
        try {
        	File _f = new File(Environment.getExternalStorageDirectory(), "results.html");
        	_f.createNewFile();
	        _cr.comparePerformance(4, 10, _f);
        } catch (Exception anExc) {
anExc.printStackTrace();
        	throw new RuntimeException(anExc);
        }
    }
}