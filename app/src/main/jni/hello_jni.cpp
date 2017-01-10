//
// Created by lilin on 2017/1/10.
//
#include "com_example_jnidemo_MainActivity.h"
#include <jni.h>

/*
 * Class:     com_jay_ndkdemo_JniDemo
 * Method:    getHelloWordText
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_example_jnidemo_MainActivity_getHelloWordText(JNIEnv * env, jobject){
 return (env)->NewStringUTF("Hello World From Jni");
}

