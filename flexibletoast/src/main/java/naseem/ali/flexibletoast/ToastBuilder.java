package naseem.ali.flexibletoast;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.annotation.ColorInt;

/**
 * Created by Naseem on 02-03-2018.
 */

public class ToastBuilder {

    private String leftIcon=FA.FA_ANDROID;
    private String topIcon=FA.FA_ANDROID;
    private int imgLeftIcon;
    private int imgTopIcon;
    private String text=null;
    private int toastType= EasyToast.INFO;
    private int duration= EasyToast.LENGTH_SHORT;
    private boolean showTopIcon=true;
    private Context context;
    private int whichLeft=0;//even For FA, Odd For Drawable
    private int whichTop=0;//even For FA, Odd For Drawable
    private int textColor= Color.parseColor("#FFFFFF");
    private float textSize=14;
    private int leftIconColor=Color.parseColor("#FFFFFF");
    private Typeface typeface;

    public ToastBuilder(Context context,String text,int duration,int toastType,String topIcon,String leftIcon,boolean showTopIcon){
        this.context=context;
        this.text=text;
        this.duration=duration;
        this.toastType=toastType;
        this.topIcon=topIcon;
        this.leftIcon=leftIcon;
        this.showTopIcon=showTopIcon;
    }

    public ToastBuilder(Context context){
        this.context=context;
    }

    public ToastBuilder text(String text){
        this.text=text;
        return this;
    }

    public ToastBuilder type(int toastType){
        this.toastType=toastType;
        switch (toastType){
            case EasyToast.WARNING:
                leftIcon=FA.FA_BELL;
                break;
            case EasyToast.INFO:
                leftIcon=FA.FA_INFO_CIRCLE;
                break;
            case EasyToast.CONFUSING:
                leftIcon=FA.FA_BULLSEYE;
                break;
            case EasyToast.ERROR:
                leftIcon=FA.FA_EXCLAMATION_CIRCLE;
                break;
            case EasyToast.SUCCESS:
                leftIcon=FA.FA_CHECK;
                break;
            default:
                leftIcon=FA.FA_ANDROID;
        }
        return this;
    }

    public ToastBuilder duration(int duration){
        this.duration=duration;
        return this;
    }

    public ToastBuilder leftIcon(String leftIcon){
        this.leftIcon=leftIcon;
        whichLeft=0;
        return this;
    }

    public ToastBuilder topIcon(String topIcon){
        this.topIcon=topIcon;
        whichTop=0;
        return this;
    }

    public ToastBuilder showTopIcon(boolean showTopIcon){
        this.showTopIcon=showTopIcon;
        return this;
    }

    public ToastBuilder leftIcon(int drawableLeft){
        this.imgLeftIcon=drawableLeft;
        whichLeft=1;
        return this;
    }

    public ToastBuilder topIcon(int drawableRight){
        this.imgTopIcon=drawableRight;
        whichTop=1;
        return this;
    }

    public ToastBuilder textSize(int size){
        this.textSize=size;
        return this;
    }

    public ToastBuilder textColor(@ColorInt int textColor){
        this.textColor=textColor;
        return this;
    }

    public ToastBuilder leftIconColor(@ColorInt int leftIconColor){
        this.leftIconColor=leftIconColor;
        return this;
    }

    public ToastBuilder typeface(Typeface typeface){
        this.typeface=typeface;
        return this;
    }

    public EasyToast build(){
        if(whichLeft==0&&whichTop==0)
            return new EasyToast(context,text,duration,toastType,leftIcon,topIcon,showTopIcon,textSize,textColor,leftIconColor,typeface);
        else if(whichLeft==1&&whichTop==0)
            return new EasyToast(context,text,duration,toastType,imgLeftIcon,topIcon,showTopIcon,textSize,textColor,leftIconColor,typeface);
        else if(whichLeft==0&&whichTop==1)
            return new EasyToast(context,text,duration,toastType,leftIcon,imgTopIcon,showTopIcon,textSize,textColor,leftIconColor,typeface);
        else
            return new EasyToast(context,text,duration,toastType,imgLeftIcon,imgTopIcon,showTopIcon,textSize,textColor,leftIconColor,typeface);

    }

}
