cmake_minimum_required(VERSION 3.4.1) # CMake版本
#次文件为手动配置
add_library(
             hello_jni # 动态库的名称

             SHARED # 作为共享库（动态引入）

             src/main/jni/hello_jni.cpp # cpp源文件路径
            )

find_library(
                log-lib
                log
            )

# 被链接的目标库的名称
target_link_libraries(
                       hello_jni
                       ${log-lib})