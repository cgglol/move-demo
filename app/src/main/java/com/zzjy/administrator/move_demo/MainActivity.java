package com.zzjy.administrator.move_demo;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    private Button bt,btn;
    private String str,key,path,info,asst;
    private TextView result;
    private File file;
    private VideoView  videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            bt = (Button) findViewById(R.id.bt);
            btn = (Button) findViewById(R.id.btn);
       // videoView = (VideoView) findViewById(R.id.sv);

        asst = "http://www.zhizaojiayuan.cn/phpinfo/1.mp4";

       // Environment.getExternalStorageDirectory().getPath()+"/Test_Movie.m4v"
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   BrowserFile(file);
                Uri uri = Uri.parse(asst);
                //调用系统自带的播放器
                Log.v("URI:::::::::", uri.toString());
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(uri, "video/mp4");
                startActivity(intent);
            }
        });


     //   str = Environment.getExternalStorageDirectory().getPath()+"/VID_20160131_120748.mp4";
        // "http://125.39.142.86/data2/video09/2016/03/01/3871799-102-1615.mp4";

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.zhizaojiayuan.cn/phpinfo/2.mp4");
                //调用系统自带的播放器
                Log.v("URI:::::::::", uri.toString());
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(uri, "video/mp4");
                startActivity(intent);
            }
        });
    }

//    public void BrowserFile(File fileold) {
//            search(fileold);
//    }
//
//    private void search(File fileold)
//    {
//        try{
//            File[] files=fileold.listFiles();
//            if(files.length>0)
//            {
//                for(int j=0;j<files.length;j++)
//                {
//                    if(!files[j].isDirectory())
//                    {
//                        if(files[j].getName().indexOf(key)> -1)
//                        {
//                            path += "\n" + files[j].getPath();
//                            result.setText(info+path);
//
//                            //shuju.putString(files[j].getName().toString(),files[j].getPath().toString());
//                        }
//                    }
//                    else{
//                        this.search(files[j]);
//                    }
//                }
//            }
//        }
//        catch(Exception e)
//        {
//
//        }
//    }

}
