# svg-application
 SVG(Scalable Vector Graphics) 可縮放向量圖形<br />
 SVG格式是XML的一種，SVG檔案其實只是普通的文字檔案，<br />
 用一般的文字編輯器便可檢視或修改。<br /><br /><br />
<img src="https://github.com/tzutzu858/svg-application/blob/master/svgtest.gif"  ><br /><br /><br />
## 使用[shapeshifter](https://shapeshifter.design/)這個網站來編輯svg動畫
編輯好後export一個有寫動畫的xml檔<br />
<img src="https://github.com/tzutzu858/svg-application/blob/master/picture/5.png" width="300"  ><br /><br /><br />


## 將SVG的XML檔放在drawable
<br /><br /><img src="https://github.com/tzutzu858/svg-application/blob/master/picture/1.png" width="700"  ><br />
<img src="https://github.com/tzutzu858/svg-application/blob/master/picture/2.png" width="500"  ><br />
## 主程式
```java
public void animate2(View view) {
        final ImageView v = (ImageView) view;
        Drawable d = v.getDrawable();
        if (d instanceof AnimatedVectorDrawableCompat){
            AnimatedVectorDrawableCompat avd = (AnimatedVectorDrawableCompat) d;
            avd.start();

        }
        else if (d instanceof AnimatedVectorDrawable) {
            AnimatedVectorDrawable avd = (AnimatedVectorDrawable) d;
            avd.start();

        }
    }
```
<br /><br /><br />
## SVG轉成XML
單純放靜態SVG的方法<br /><br />
<img src="https://github.com/tzutzu858/svg-application/blob/master/picture/7.png" width="700"  ><br />
<img src="https://github.com/tzutzu858/svg-application/blob/master/picture/6.png" width="600"  ><br />

