package com.lyhoangvinh.appbanhang.View.ManHinhChao;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.lyhoangvinh.appbanhang.R;
import com.lyhoangvinh.appbanhang.View.TrangChu.TrangChuActivity;


public class ManHinhChaoActivity extends AppCompatActivity {

    Toolbar toolbar;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manhinhchao_layout);
//        progressDialog = new ProgressDialog(this);
//        progressDialog.setIndeterminate(true);
//        progressDialog.setCanceledOnTouchOutside(false);
//        progressDialog.setMessage("Đợi síu ..");
        setSupportActionBar(toolbar);

//         Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try{
//                    Thread.sleep(2000);
//                }catch (Exception e){
//
//                }finally {
//                    Intent iTrangChu = new Intent(ManHinhChaoActivity.this, TrangChuActivity.class);
//                    startActivity(iTrangChu);
//                }
//            }
//        });
//
//        thread.start();
//        progressDialog.show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                    startActivity(new Intent(ManHinhChaoActivity.this, TrangChuActivity.class));
//                progressDialog.dismiss();
            }
        }, 1000);
    }
}
