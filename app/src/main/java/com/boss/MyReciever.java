package com.boss;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.boss.duc.myapplication.MainActivity;

/**
 * Created by heroh on 08-Feb-18.
 */

public class MyReciever extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String action=intent.getAction();
        if(action.equals(Intent.ACTION_BOOT_COMPLETED)){
            Toast.makeText(context,"BOOT COMPLETE",Toast.LENGTH_LONG).show();
            Intent intent1=new Intent(context, MainActivity.class);
            context.startActivity(intent1);
        }
        else if(action.equals(Intent.ACTION_SCREEN_ON)){
            Toast.makeText(context,"SCREEN ON",Toast.LENGTH_LONG).show();
        }
    }
}
