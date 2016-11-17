# Android MVP学习笔记
>我的学习笔记

```java
public class PaintCanvas extends View {    private Paint mPaint;    // 省略构造方法
    private void init() {       
        mPaint = new Paint();
        mPaint.setAntiAlias(true);        
    }    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawCircle(500, 550, 500, mPaint);
    }

}
```