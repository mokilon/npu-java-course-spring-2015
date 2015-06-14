/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.edu.npu.mis;

/**
 *
 * @author STP
 */
public class cantroller {
    Calculator mHoo;
    view mview;
     public cantroller(Calculator mhoo)
    {
        mHoo =mhoo;
    }
     public void setOperator(String ooper)
    {
        mHoo.ss(ooper);
    }
    public void setData(String dder)
    {
        mHoo.appendDigit(Integer.parseInt(dder));
        
    }
     
    
    public void addView(view mview){
		mview = mview;
                mHoo.getDisplay();
   
    }
}
