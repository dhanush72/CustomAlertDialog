package com.codeelit.customdialog;

import android.app.ActionBar;
import android.app.Dialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button yes, no, smile, laugh, cool;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        smile = findViewById(R.id.smile);
        laugh = findViewById(R.id.laugh);
        cool = findViewById(R.id.cool);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowDialog("yes", "Happy !!", "Code Elit");
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowDialog1("no", "Angry !!", "Code Elit");
            }
        });

        smile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowDialogSmile("smile", "Smile !!", "Code Elit");
            }
        });

        laugh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowDialogLaugh("laugh", "Laugh !!", "Code Elit");
            }
        });

        cool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowDialogCool("cool", "Cool !!", "Code Elit");
            }
        });
    }

    /// cool dialog
    private void ShowDialogCool(String cool, String ctv1, String ctv2) {
        Button back;
        TextView tv1, tv2;
        ImageView status;

        Context context;
        dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.cool);
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        Window window = dialog.getWindow();
        window.setGravity(Gravity.CENTER);
        window.getAttributes().windowAnimations = R.style.DialogAimation;

        back = dialog.findViewById(R.id.back);
        tv1 = dialog.findViewById(R.id.ctv1);
        tv2 = dialog.findViewById(R.id.ctv2);
        status = dialog.findViewById(R.id.status);

        tv1.setText(ctv1);
        tv2.setText(ctv2);

        if (yes.equals("laugh")){
            status.setImageResource(R.drawable.cool);
            tv1.setTextColor(getResources().getColor(R.color.red));
            back.setBackgroundResource(R.drawable.red);
        }

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.setCancelable(true);
        window.setLayout(ActionBar.LayoutParams.WRAP_CONTENT, ActionBar.LayoutParams.WRAP_CONTENT);
        dialog.show();
    }

    /// laugh dialog
    private void ShowDialogLaugh(String laugh, String ltv1, String ltv2) {
        Button back;
        TextView tv1, tv2;
        ImageView status;

        Context context;
        dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.laugh);
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        Window window = dialog.getWindow();
        window.setGravity(Gravity.CENTER);
        window.getAttributes().windowAnimations = R.style.DialogAimation;

        back = dialog.findViewById(R.id.back);
        tv1 = dialog.findViewById(R.id.ltv1);
        tv2 = dialog.findViewById(R.id.ltv2);
        status = dialog.findViewById(R.id.status);

        tv1.setText(ltv1);
        tv2.setText(ltv2);

        if (yes.equals("laugh")){
            status.setImageResource(R.drawable.laugh);
            tv1.setTextColor(getResources().getColor(R.color.green));
            back.setBackgroundResource(R.drawable.green);
        }

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.setCancelable(true);
        window.setLayout(ActionBar.LayoutParams.WRAP_CONTENT, ActionBar.LayoutParams.WRAP_CONTENT);
        dialog.show();
    }
    /// smile dialog
    private void ShowDialogSmile(String smile, String stv1, String stv2) {
        Button back;
        TextView tv1, tv2;
        ImageView status;

        Context context;
        dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.smile);
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        Window window = dialog.getWindow();
        window.setGravity(Gravity.CENTER);
        window.getAttributes().windowAnimations = R.style.DialogAimation;

        back = dialog.findViewById(R.id.back);
        tv1 = dialog.findViewById(R.id.stv1);
        tv2 = dialog.findViewById(R.id.stv2);
        status = dialog.findViewById(R.id.status);

        tv1.setText(stv1);
        tv2.setText(stv2);

        if (yes.equals("smile")){
            status.setImageResource(R.drawable.smile);
            tv1.setTextColor(getResources().getColor(R.color.orange));
            back.setBackgroundResource(R.drawable.orange);
        }

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.setCancelable(true);
        window.setLayout(ActionBar.LayoutParams.WRAP_CONTENT, ActionBar.LayoutParams.WRAP_CONTENT);
        dialog.show();
    }

    /// yes dialog
    private void ShowDialog(String yes, String t1, String t2) {
        Button back;
        TextView tv1, tv2;
        ImageView status;

        Context context;
        dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.yes);
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        Window window = dialog.getWindow();
        window.setGravity(Gravity.CENTER);
        window.getAttributes().windowAnimations = R.style.DialogAimation;

        back = dialog.findViewById(R.id.back);
        tv1 = dialog.findViewById(R.id.tv1);
        tv2 = dialog.findViewById(R.id.tv2);
        status = dialog.findViewById(R.id.status);

        tv1.setText(t1);
        tv2.setText(t2);

        if (yes.equals("yes")){
            status.setImageResource(R.drawable.happy);
            tv1.setTextColor(getResources().getColor(R.color.green));
            back.setBackgroundResource(R.drawable.green);
        }else if (yes.equals("no")){
            status.setImageResource(R.drawable.angry);
            tv1.setTextColor(getResources().getColor(R.color.red));
            back.setBackgroundResource(R.drawable.red);
        }

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.setCancelable(true);
        window.setLayout(ActionBar.LayoutParams.WRAP_CONTENT, ActionBar.LayoutParams.WRAP_CONTENT);
        dialog.show();
    }

    /// no dialog
    private void ShowDialog1(String no, String t1, String t2) {
        Button back;
        TextView tv1, tv2;
        ImageView status;

        Context context;
        dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.no);
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        Window window = dialog.getWindow();
        window.setGravity(Gravity.CENTER);
        window.getAttributes().windowAnimations = R.style.DialogAimation;

        back = dialog.findViewById(R.id.back);
        tv1 = dialog.findViewById(R.id.tv1);
        tv2 = dialog.findViewById(R.id.tv2);
        status = dialog.findViewById(R.id.status);

        tv1.setText(t1);
        tv2.setText(t2);

        if (yes.equals("no")){
            status.setImageResource(R.drawable.angry);
            tv1.setTextColor(getResources().getColor(R.color.red));
            back.setBackgroundResource(R.drawable.red);
        }

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.setCancelable(true);
        window.setLayout(ActionBar.LayoutParams.WRAP_CONTENT, ActionBar.LayoutParams.WRAP_CONTENT);
        dialog.show();
    }

}
