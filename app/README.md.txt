Iran Image Map
============
Iran Image Map is ImageView with customizable provinces on map

![](media/screen.png)

## Usage

```xml
    <com.salehi.iranimagemap.lib.IranImageMap
            android:id="@+id/map"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"/>
```

## Code

```java
        IranImageMap imageMap = findViewById(R.id.map);
        imageMap.clearAllProvince();
        imageMap.setActiveProvince(ProvinceList.Tehran);
```

## Credits
Thanks to [Ariana](https://github.com/akshay2211/Ariana) for transition in sample

## IOS

Similar library [BubbleTabBar](https://github.com/Cuberto/bubble-icon-tabbar) by [Cuberto](https://github.com/Cuberto)

## Download

[ ![Download](https://api.bintray.com/packages/fxn769/android_projects/BubbleTabBar/images/download.svg?version=1.0.1) ](https://bintray.com/fxn769/android_projects/BubbleTabBar/1.0.1/link)


 include in app level build.gradle
 ```groovy
        repositories {
           maven { url 'https://jitpack.io' }
        }
 ```
```groovy
        implementation  'com.fxn769:bubbletabbar:1.0.1'
```

## License
Licensed under the Apache License, Version 2.0, [click here for the full license](/LICENSE).