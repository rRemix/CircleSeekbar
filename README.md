# CircleSeekbar
带阴影的圆形Seekbar

## Screenshots

<img src="/screenshot/with_shadow.jpg" alt="screenshot" title="screenshot" width="270" height="486" /><img src="/screenshot/without_shadow.jpg" alt="screenshot" title="screenshot" width="270" height="486" />


## Usage

Glide添加引用
``
compile 'com.remix:circleseekbar:1.0.1'
``

xml中引用
```java
com.remix.circleseekbar.CircleSeekBar
        android:layout_width="200dp"
        android:layout_height="200dp"
        android:id="@+id/circleSeekbar"
        app:progress_color="#698cf6"
        app:progress_thumb="@drawable/bg_circleseekbar_thumb_default"
        app:progress_max="1000"
        app:progress_width="4dp"
        app:track_color="#b7b7b7"
        app:enable_shadow="false"
        app:shadow_radius="4dp"
        app:shadow_color="#b7b7b7"/>
```

#### 自定义属性
```java
<attr name="progress_thumb"/>  <!--指示器-->
<attr name="progress_width"/>  <!--已完成轨道的宽度-->
<attr name="progress_color"/>  <!--已完成轨道的颜色-->
<attr name="progress_max"/>  <!--最大值-->
<attr name="track_color"/> <!--轨道背景颜色-->
<attr name="enable_shadow"/> <!--是否启用阴影-->
<attr name="shadow_radius"/> <!--阴影大小-->
<attr name="shadow_color"/> <!--阴影颜色-->
```



如果有任何问题 可以发送邮件至rRemix.me@gmail.com
