# SDP/SSP  unit kotlin extension

![](https://jitpack.io/v/Mathias-Boulay/sdp-ssp-kotlin-extension.svg)

This library brings the universal scaling units from those 2 libraries: [sdp unit lib](https://github.com/intuit/sdp)/[ssp unit lib](https://github.com/intuit/ssp) as kotlin extension functions to use a bit like you would with Jetpack Compose.

## Example usage:
`myTextview.textSize = 16.ssp` is equals to `android:textSize="@dimen/_16ssp"`

`myTextView.layoutParams.width = 60.sdp` is equals to `android:layout_width="@dimen/_60sdp"`

**Important note:** While `Number.sdp` returns a size in **pixels**, `Number.sdp` returns the size as **sp** units.  This is because the `textSize` property of `TextView` expects **sp** units.

If you want the **ssp** size as **pixels**, simply do `Number.ssp.sp` !

For a live example, you compile the demo app by cloning the repo. Or take my word for it and look at the screenshot below:

<img src="https://i.ibb.co/YTxvLvG/library-preview.png" alt="library-preview" border="0"/>


# Quick start
## Step 1 - Install
If not done so already, you need to add the Jitpack repository to the root `build.gradle` file:
```css
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

In your app `build.gradle` file, add the following lines:
```css
implementation 'com.github.Mathias-Boulay:sdp-ssp-kotlin-extension:1.0.0' // The kotlin extension

// The original librairies 
implementation 'com.intuit.sdp:sdp-android:1.1.0'  
implementation 'com.intuit.ssp:ssp-android:1.1.0'
```

## Step 2 - Initialize the app
You need to either:
- Extend the `DimensionAwareApplication` if you have a custom `Application` class, then add it to the manifest file.
- Add `android:name="fr.spse.sdp_ssp_kotlin.DimensionAwareApplication"` to the manifest file if you don't have a custom app class.

After that, you can enjoy universally scaled units everywhere !


## License
This library is under the MIT license, the same as both original libraries
