# EasyToast
[![platform](https://img.shields.io/badge/platform-Android-yellow.svg)](https://www.android.com)
[![API](https://img.shields.io/badge/API-16%2B-brightgreen.svg?style=plastic)](https://android-arsenal.com/api?level=16)
[![](https://jitpack.io/v/naseemali925/EasyToast.svg)](https://jitpack.io/#naseemali925/EasyToast)

An Android library that takes the standard Android Toast to the next level with built-in icons from font-awesome and many styling options that gives your app and user experience an extra awesome feeling!


<table>
  <tr>
    <td>
      <center>
	      <b>Success Toast</b></br>
      <img src="https://raw.githubusercontent.com/naseemali925/EasyToast/master/images/success.png" width="250">
      </center>
    </td>
    <td>
      <center>
	      <b>Info Toast</b></br>
      <img src="https://raw.githubusercontent.com/naseemali925/EasyToast/master/images/info.png" width="250">
      </center>
    </td>
    <td>
      <center>
	      <b>Error Toast</b></br>
      <img src="https://raw.githubusercontent.com/naseemali925/EasyToast/master/images/error.png" width="250">
      </center>
    </td>
  </tr>
  <tr>
    <td>
      <center>
	      <b>Warning Toast</b></br>
      <img src="https://raw.githubusercontent.com/naseemali925/EasyToast/master/images/warning.png" width="250">
      </center>
    </td>
    <td>
      <center>
	      <b>Default Toast</b></br>
      <img src="https://raw.githubusercontent.com/naseemali925/EasyToast/master/images/default.png" width="250">
      </center>
    </td>
    <td>
      <center>
	      <b>Confusing Toast</b></br>
      <img src="https://raw.githubusercontent.com/naseemali925/EasyToast/master/images/confuse.png" width="250">
      </center>
    </td>
  </tr>
 </table>

## Prerequisites

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

## Dependency

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
dependencies {
	...
	compile 'com.github.naseemali925:EasyToast:0.0.1'
```
## Usage

Each method always returns a `Toast` object, so you can customize the Toast much more. **DON'T FORGET THE `show()` METHOD!**

**To display the default Toast:**

``` java
EasyToast.makeText(this,"Hello World !",EasyToast.LENGTH_LONG,EasyToast.DEFAULT,true);
```
**To display a success Toast:**

``` java
EasyToast.makeText(this,"Hello World !",EasyToast.LENGTH_LONG,EasyToast.SUCCESS,true);
```
**To display an info Toast:**

``` java
EasyToast.makeText(this,"Hello World !",EasyToast.LENGTH_LONG,EasyToast.INFO,true);
```
**To display a warning Toast:**

``` java
EasyToast.makeText(this,"Hello World !",EasyToast.LENGTH_LONG,EasyToast.WARNING,true);
```
**To display the error Toast:**

``` java
EasyToast.makeText(this,"Hello World !",EasyToast.LENGTH_LONG,EasyToast.ERROR,true);
```
**To display the confusing Toast:**

``` java
EasyToast.makeText(this,"Hello World !",EasyToast.LENGTH_LONG,EasyToast.CONFUSING,true);
```
**You can also remove the android icon on top-right corner by passing last parameter false.**
``` java
EasyToast.makeText(yourContext, "I'm a Toast", duration, type, boolen value).show();
```

## With The Builder Pattern

```java
	EasyToast easyToast=new ToastBuilder(this)
                .textSize(16)
                .textColor(Color.WHITE)
                .showTopIcon(true)
                .leftIcon(FA.FA_CHECK)
                .typeface(someTypeface)
                .topIcon(FA.FA_ANGELLIST)
                .text("That's An Easy Toast")
                .type(EasyToast.SUCCESS)
                .build();
        easyToast.show();
```

## Use Icons From Font Awesome

Use The **FA** Class To Access And Use The Icon
```java
  FA.FA_CHECK
  FA.FA_BELL
  .
  .
  .
  //Choose Any From 900+ Icons
  
  //Or Use A Drawable
  EasyToast easyToast=new ToastBuilder(this)
                .textColor(Color.WHITE)
                .leftIcon(R.drawable.some_drawable)
                .topIcon(R.drawable.some_drawable)
                .text("That's An Easy Toast")
                .type(EasyToast.SUCCESS)
                .build();
        easyToast.show();
```

## Use Font Awesome With Other Views
```java
  FA.with(context).initialize();
  LinearLayout vGroup=(LinearLayout)findViewById(...);
  FA.addTo(vGroup);// It Will Add Font Awesome To All ChildViews That Supports Text(TextView,EditText,Button)
  FA.addTo(SomeTextView);// Adds Font Awesome To This TextView
  FA.addTo(SomeButton);// Adds Font Awesome To This Button
  FA.addTo(SomeEditText);// Adds Font Awesome To This EditText
  //Wanna Use Font-Awesome Icons Along Text
  someTextViewWithFA.setText("This Is A BUS "+FA.FA_BUS);

```

## Contributing

Please fork this repository and contribute back using
[pull requests](https://github.com/naseemali925/EasyToast/pulls).

Any contributions, large or small, major features, bug fixes, are welcomed and appreciated
but will be thoroughly reviewed .

### Contact - Let's become friend
- [Twitter](https://twitter.com/thisismenaseem)
- [Github](https://github.com/naseemali925)
- [Linkedin](https://www.linkedin.com/in/naseem-ali-86842b144/)
- [Facebook](https://www.facebook.com/naseem.ali.1466)

# License

MIT License

Copyright (c) 2017 Naseem Ali

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the license conditions.
