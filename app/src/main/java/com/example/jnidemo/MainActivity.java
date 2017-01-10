package com.example.jnidemo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * 这是手动配置C++ support
 * 1. 声明native方法
 * 2. 生成native方法所在类的头文件 example:在文件路径下执行 javah com.example.jnidemo.MainActivity 不用带后缀
 * 3.实现头文件的  拷贝头文件内容并实现native方法
 * 4.在app module的build文件中配置 externalNativeBuild {cmake {path "CMakeLists.txt"}}
 * 5.make project，观察到build/intermedicates文件下家自动生成cmake下生成了支持各种架构的so库
 * 6.调用你的本地方法前，请先加载so库，lib前缀为默认得
 * 7.运行程序，继续各种操作
 */
public class MainActivity extends AppCompatActivity {
    static {
        // 加载动态库
        System.loadLibrary("hello_jni");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView = (TextView) findViewById(R.id.tv);
        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(getHelloWordText());
            }
        });
    }

    public native String getHelloWordText();
}
