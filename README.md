  Android Studio 2.2.3  JDK8
  以下是手动配置C++ support
  1. 声明native方法
  2. 生成native方法所在类的头文件 example:在文件路径下执行 javah com.example.jnidemo.MainActivity 不用带后缀
  3.实现头文件的  拷贝头文件内容并实现native方法
  4.在app module的build文件中配置 externalNativeBuild {cmake {path "CMakeLists.txt"}}
  5.make project，观察到build/intermedicates文件下家自动生成cmake下生成了支持各种架构的so库
  6.调用你的本地方法前，请先加载so库，lib前缀为默认的不需要手动添加
  7.运行程序，继续各种操作
