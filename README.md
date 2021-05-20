## What is the Adaptive Icons ?
Android 8.0 (API level 26) introduces adaptive launcher icons, which can display a variety of shapes across different device models. For example, an adaptive launcher icon can display a circular shape on one OEM device, and display a squircle on another device. Each device OEM provides a mask, which the system then uses to render all adaptive icons with the same shape. Adaptive launcher icons are also used in shortcuts, the Settings app, sharing dialogs, and the overview screen.

![A variety of masks applied to an adaptive icon wireframe](https://developer.android.com/guide/practices/ui_guidelines/images/NB_Icon_Mask_Shapes_Ext_01.gif)  ![A variety of masks applied to an adaptive icon](https://developer.android.com/guide/practices/ui_guidelines/images/NB_Icon_Mask_Shapes_Ext_02.gif)

**Figure 1.**  Adaptive icons support a variety of masks which vary from one device to another.

You can control the look of your adaptive launcher icon by defining 2 layers, consisting of a background and a foreground. You must provide icon layers as drawables without masks or background shadows around the outline of the icon.


## Supported Launchers:

 - Rootless Pixel Launcher
 - Lawnchair Launcher (v2)
 - Hyperion Launcher
 - Lean Launcher
 - Nova Launcher
 
 ## **FAQs:**
**Q: Why it says Device Unsupported?**  
**A:** Adaptive icons are introduced in Android 8.0. So, The Icon Pack only works on Android 8.0+ Devices.  
  
**Q: Why it is not working on my device?**  
**A:** It mainly works on AOSP Android 8.0 Based Firmware (Lineage OS, Resurrection Remix, AEX etc.). It's not guaranteed that the icon pack will work on Devices with Custom Shell. It's not the problem of Icon Pack, It's the Problem of OEM. By the way, you can get refund.

## How to Use:

 - Rootless Pixel Launcher: Go to Launcher's Home Settings. Then Choose the Icon Pack. Change the Shape as you want. 
 - Lawnchair Launcher v2: Go to Launcher's Home Settings. Open "Theme", Then Choose The Icon Pack. Change the Shape as you want.  
 - Hyperion Launcher: Go to Launcher's Home Settings. Open "Iconography", Then Choose Icon Pack. Change the shape as you want.  
 - Nova Launcher: Go to Launcher's Settings. Open "Look & Feel", Then open "Icon Style", Choose Icon Pack. Change shape as you want.



## **License**
Papirus icon theme is free and open source project distributed under the terms of the GNU General Public License, version 3. See the [`LICENSE`](LICENSE) file for details.

Every logo in this icon theme is owned by the respective trademark holder. We have not received approval to create these logos from any of the trademark owners, and the existence of an icon in this repository is in no way supported by the trademark owner.

Where possible, we stayed true to the branding and official guidelines.

If you are a trademark holder or application owner for one of these applications and disapprove of the icons we've created for your application, please submit an issue to this repository.




 
  
