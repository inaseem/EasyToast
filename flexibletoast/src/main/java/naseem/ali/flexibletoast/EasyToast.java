package naseem.ali.flexibletoast;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Naseem on 02-03-2018.
 */

public class EasyToast extends Toast {
    /**
     * Construct an empty Toast object.  You must call {@link #setView} before you
     * can call {@link #show}.
     *
     * @param context The context to use.  Usually your {@link Application}
     *                or {@link Activity} object.
     */
    public static final int SUCCESS=0;
    public static final int WARNING=1;
    public static final int ERROR=2;
    public static final int INFO=3;
    public static final int DEFAULT=4;
    public static final int CONFUSING=5;
    private static String defaultSuccess=FA.FA_CHECK;
    private static String defaultWarning=FA.FA_BELL;
    private static String defaultError=FA.FA_EXCLAMATION_CIRCLE;
    private static String defaultDefault=FA.FA_ANDROID;
    private static String defaultConfusing=FA.FA_BULLSEYE;
    private static String defaultInfo=FA.FA_INFO_CIRCLE;

    /**
     * Construct an empty Toast object.  You must call {@link #setView} before you
     * can call {@link #show}.
     *
     * @param context The context to use.  Usually your {@link Application}
     *                or {@link Activity} object.
     */
    public EasyToast(Context context) {
        super(context);
    }

    public EasyToast(Context context, String message, int duration, int type, String leftFAICon, String topFAIcon, boolean showTopIcon, float textSize, int textColor, int leftIconColor, Typeface typeface){
        super(context);
        super.setView(makeView(context,message,type,leftFAICon,topFAIcon,showTopIcon,textSize,textColor,leftIconColor,typeface));
        super.setDuration(duration);
    }

    public EasyToast(Context context, String message, int duration, int type, int leftFAICon, String topFAIcon, boolean showTopIcon, float textSize, int textColor, int leftIconColor, Typeface typeface){
        super(context);
        super.setView(makeView(context,message,type,leftFAICon,topFAIcon,showTopIcon,textSize,textColor,leftIconColor,typeface));
        super.setDuration(duration);
    }
    public EasyToast(Context context, String message, int duration, int type, String leftFAICon, int topFAIcon, boolean showTopIcon, float textSize, int textColor, int leftIconColor, Typeface typeface){
        super(context);
        super.setView(makeView(context,message,type,leftFAICon,topFAIcon,showTopIcon,textSize,textColor,leftIconColor,typeface));
        super.setDuration(duration);
    }

    public EasyToast(Context context, String message, int duration, int type, int leftFAICon, int topFAIcon, boolean showTopIcon, float textSize, int textColor, int leftIconColor, Typeface typeface){
        super(context);
        super.setView(makeView(context,message,type,leftFAICon,topFAIcon,showTopIcon,textSize,textColor,leftIconColor,typeface));
        super.setDuration(duration);
    }

    public EasyToast(Context context, String message, int duration, int type, boolean showIcon){
        super(context);
        super.setView(makeView(context,message,type,showIcon));
        super.setDuration(duration);
    }

    public static Toast makeText(Context context,String message,int duration,int type,boolean showIcon){
        FA.with(context).initialize();
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        View layout = LayoutInflater.from(context).inflate(R.layout.toast_layout, null, false);
        TextView text = (TextView) layout.findViewById(R.id.toast_text);
        RelativeLayout linearLayout=(RelativeLayout) layout.findViewById(R.id.toast_type);
        TextView textImageViewLeft=(TextView)layout.findViewById(R.id.textImageViewLeft);
        ImageView imgImageVewLeft=(ImageView)layout.findViewById(R.id.imgImageViewLeft);
        TextView textImageViewTop=(TextView)layout.findViewById(R.id.textImageViewTop);
        ImageView imgImageViewTop=(ImageView)layout.findViewById(R.id.imgImageViewTop);
        imgImageViewTop.setVisibility(View.GONE);
        imgImageVewLeft.setVisibility(View.GONE);
        FA.addTo(textImageViewTop);
        FA.addTo(linearLayout);
        textImageViewTop.setText(FA.FA_ANDROID);
        text.setText(message);
        String leftIcon=FA.FA_ANDROID;
        int topColor=Color.parseColor("#3d3a3a");
        if(showIcon)
            textImageViewTop.setVisibility(View.VISIBLE);
        else
            textImageViewTop.setVisibility(View.GONE);
        switch (type){
            case SUCCESS:
                linearLayout.setBackgroundResource(R.drawable.success_shape);
                leftIcon=defaultSuccess;
                topColor=Color.parseColor("#4CAF50");
                break;
            case INFO:
                linearLayout.setBackgroundResource(R.drawable.info_shape);
                leftIcon=defaultInfo;
                topColor=Color.parseColor("#3F51B5");
                break;
            case WARNING:
                linearLayout.setBackgroundResource(R.drawable.warning_shape);
                leftIcon=defaultWarning;
                topColor=Color.parseColor("#FF9800");
                break;
            case ERROR:
                linearLayout.setBackgroundResource(R.drawable.error_shape);
                leftIcon=defaultError;
                topColor=Color.parseColor("#F44336");
                break;
            case CONFUSING:
                linearLayout.setBackgroundResource(R.drawable.confusing_shape);
                leftIcon=defaultConfusing;
                topColor=Color.parseColor("#607D8B");
                break;
            default:
                linearLayout.setBackgroundResource(R.drawable.default_shape);
                leftIcon=defaultDefault;
                topColor=Color.parseColor("#3d3a3a");
        }
        textImageViewTop.setTextColor(topColor);
        textImageViewLeft.setText(leftIcon);
        toast.setView(layout);
        return toast;
    }
    public static Toast makeText(Context context,String message,int duration,int type){
        FA.with(context).initialize();
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        View layout = LayoutInflater.from(context).inflate(R.layout.toast_layout, null, false);
        TextView text = (TextView) layout.findViewById(R.id.toast_text);
        RelativeLayout linearLayout=(RelativeLayout) layout.findViewById(R.id.toast_type);
        TextView textImageViewLeft=(TextView)layout.findViewById(R.id.textImageViewLeft);
        ImageView imgImageVewLeft=(ImageView)layout.findViewById(R.id.imgImageViewLeft);
        TextView textImageViewTop=(TextView)layout.findViewById(R.id.textImageViewTop);
        ImageView imgImageViewTop=(ImageView)layout.findViewById(R.id.imgImageViewTop);
        imgImageViewTop.setVisibility(View.GONE);
        imgImageVewLeft.setVisibility(View.GONE);
        FA.addTo(textImageViewTop);
        FA.addTo(linearLayout);
        textImageViewTop.setText(FA.FA_ANDROID);
        text.setText(message);
        String leftIcon=FA.FA_ANDROID;
        int topColor=Color.parseColor("#3d3a3a");
        switch (type){
            case SUCCESS:
                linearLayout.setBackgroundResource(R.drawable.success_shape);
                leftIcon=defaultSuccess;
                topColor=Color.parseColor("#4CAF50");
                break;
            case INFO:
                linearLayout.setBackgroundResource(R.drawable.info_shape);
                leftIcon=defaultInfo;
                topColor=Color.parseColor("#3F51B5");
                break;
            case WARNING:
                linearLayout.setBackgroundResource(R.drawable.warning_shape);
                leftIcon=defaultWarning;
                topColor=Color.parseColor("#FF9800");
                break;
            case ERROR:
                linearLayout.setBackgroundResource(R.drawable.error_shape);
                leftIcon=defaultError;
                topColor=Color.parseColor("#F44336");
                break;
            case CONFUSING:
                linearLayout.setBackgroundResource(R.drawable.confusing_shape);
                leftIcon=defaultConfusing;
                topColor=Color.parseColor("#607D8B");
                break;
            default:
                linearLayout.setBackgroundResource(R.drawable.default_shape);
                leftIcon=defaultDefault;
                topColor=Color.parseColor("#3d3a3a");
        }
        textImageViewTop.setTextColor(topColor);
        textImageViewLeft.setText(leftIcon);
        toast.setView(layout);
        return toast;
    }

    private View makeView(Context context,String message,int type,String leftFAICon,String topFAIcon,boolean showTopIcon,float textSize,int textColor,int leftIconColor, Typeface typeface){
        FA.with(context).initialize();
        View layout = LayoutInflater.from(context).inflate(R.layout.toast_layout, null, false);
        TextView text = (TextView) layout.findViewById(R.id.toast_text);
        RelativeLayout linearLayout=(RelativeLayout) layout.findViewById(R.id.toast_type);
        TextView textImageViewLeft=(TextView)layout.findViewById(R.id.textImageViewLeft);
        ImageView imgImageVewLeft=(ImageView)layout.findViewById(R.id.imgImageViewLeft);
        TextView textImageViewTop=(TextView)layout.findViewById(R.id.textImageViewTop);
        ImageView imgImageViewTop=(ImageView)layout.findViewById(R.id.imgImageViewTop);
        imgImageViewTop.setVisibility(View.GONE);
        imgImageVewLeft.setVisibility(View.GONE);
        FA.addTo(textImageViewTop);
        FA.addTo(linearLayout);
        if(!showTopIcon){
            textImageViewTop.setVisibility(View.GONE);
        }
        int topColor=Color.parseColor("#3d3a3a");
        switch (type){
            case SUCCESS:
                linearLayout.setBackgroundResource(R.drawable.success_shape);
                topColor=Color.parseColor("#4CAF50");
                break;
            case INFO:
                linearLayout.setBackgroundResource(R.drawable.info_shape);
                topColor=Color.parseColor("#3F51B5");
                break;
            case WARNING:
                linearLayout.setBackgroundResource(R.drawable.warning_shape);
                topColor=Color.parseColor("#FF9800");
                break;
            case ERROR:
                linearLayout.setBackgroundResource(R.drawable.error_shape);
                topColor=Color.parseColor("#F44336");
                break;
            case CONFUSING:
                linearLayout.setBackgroundResource(R.drawable.confusing_shape);
                topColor=Color.parseColor("#607D8B");
                break;
            default:
                linearLayout.setBackgroundResource(R.drawable.default_shape);
                topColor=Color.parseColor("#3d3a3a");
        }
        text.setText(message);
        textImageViewTop.setText(topFAIcon);
        textImageViewTop.setTextColor(topColor);
        textImageViewLeft.setText(leftFAICon);
        textImageViewLeft.setTextColor(leftIconColor);
        text.setTextColor(textColor);
        text.setTextSize(textSize);
        text.setTypeface(typeface);
        return layout;
    }

    private View makeView(Context context,String message,int type,int leftFAICon,String topFAIcon,boolean showTopIcon,float textSize,int textColor,int leftImgColor, Typeface typeface){
        FA.with(context).initialize();
        View layout = LayoutInflater.from(context).inflate(R.layout.toast_layout, null, false);
        TextView text = (TextView) layout.findViewById(R.id.toast_text);
        RelativeLayout linearLayout=(RelativeLayout) layout.findViewById(R.id.toast_type);
        TextView textImageViewLeft=(TextView)layout.findViewById(R.id.textImageViewLeft);
        ImageView imgImageVewLeft=(ImageView)layout.findViewById(R.id.imgImageViewLeft);
        TextView textImageViewTop=(TextView)layout.findViewById(R.id.textImageViewTop);
        ImageView imgImageViewTop=(ImageView)layout.findViewById(R.id.imgImageViewTop);
        imgImageViewTop.setVisibility(View.GONE);
        textImageViewLeft.setVisibility(View.GONE);
        FA.addTo(textImageViewTop);
        FA.addTo(linearLayout);
        if(!showTopIcon)
            textImageViewTop.setVisibility(View.GONE);
        int topColor=Color.parseColor("#3d3a3a");
        switch (type){
            case SUCCESS:
                linearLayout.setBackgroundResource(R.drawable.success_shape);
                topColor=Color.parseColor("#4CAF50");
                break;
            case INFO:
                linearLayout.setBackgroundResource(R.drawable.info_shape);
                topColor=Color.parseColor("#3F51B5");
                break;
            case WARNING:
                linearLayout.setBackgroundResource(R.drawable.warning_shape);
                topColor=Color.parseColor("#FF9800");
                break;
            case ERROR:
                linearLayout.setBackgroundResource(R.drawable.error_shape);
                topColor=Color.parseColor("#F44336");
                break;
            case CONFUSING:
                linearLayout.setBackgroundResource(R.drawable.confusing_shape);
                topColor=Color.parseColor("#607D8B");
                break;
            default:
                linearLayout.setBackgroundResource(R.drawable.default_shape);
                topColor=Color.parseColor("#3d3a3a");
        }
        text.setText(message);
        textImageViewTop.setText(topFAIcon);
        textImageViewTop.setTextColor(topColor);
        imgImageVewLeft.setImageResource(leftFAICon);
        textImageViewLeft.setTextColor(leftImgColor);
        text.setTextColor(textColor);
        text.setTextSize(textSize);
        text.setTypeface(typeface);
        return layout;
    }

    private View makeView(Context context,String message,int type,String leftFAICon,int topFAIcon,boolean showTopIcon,float textSize,int textColor,int leftImgColor, Typeface typeface){
        FA.with(context).initialize();
        View layout = LayoutInflater.from(context).inflate(R.layout.toast_layout, null, false);
        TextView text = (TextView) layout.findViewById(R.id.toast_text);
        RelativeLayout linearLayout=(RelativeLayout) layout.findViewById(R.id.toast_type);
        TextView textImageViewLeft=(TextView)layout.findViewById(R.id.textImageViewLeft);
        ImageView imgImageVewLeft=(ImageView)layout.findViewById(R.id.imgImageViewLeft);
        TextView textImageViewTop=(TextView)layout.findViewById(R.id.textImageViewTop);
        ImageView imgImageViewTop=(ImageView)layout.findViewById(R.id.imgImageViewTop);
        textImageViewTop.setVisibility(View.GONE);
        imgImageVewLeft.setVisibility(View.GONE);
        FA.addTo(textImageViewTop);
        FA.addTo(linearLayout);
        if(!showTopIcon)
            imgImageViewTop.setVisibility(View.GONE);
        switch (type){
            case SUCCESS:
                linearLayout.setBackgroundResource(R.drawable.success_shape);
                break;
            case INFO:
                linearLayout.setBackgroundResource(R.drawable.info_shape);
                break;
            case WARNING:
                linearLayout.setBackgroundResource(R.drawable.warning_shape);
                break;
            case ERROR:
                linearLayout.setBackgroundResource(R.drawable.error_shape);
                break;
            case CONFUSING:
                linearLayout.setBackgroundResource(R.drawable.confusing_shape);
                break;
            default:
                linearLayout.setBackgroundResource(R.drawable.default_shape);
        }
        textImageViewLeft.setText(leftFAICon);
        imgImageViewTop.setImageResource(topFAIcon);
        text.setText(message);
        textImageViewLeft.setTextColor(leftImgColor);
        text.setTextColor(textColor);
        text.setTextSize(textSize);
        text.setTypeface(typeface);
        return layout;
    }

    private View makeView(Context context,String message,int type,int leftFAICon,int topFAIcon,boolean showTopIcon,float textSize,int textColor,int leftImgColor, Typeface typeface){
        FA.with(context).initialize();
        View layout = LayoutInflater.from(context).inflate(R.layout.toast_layout, null, false);
        TextView text = (TextView) layout.findViewById(R.id.toast_text);
        RelativeLayout linearLayout=(RelativeLayout) layout.findViewById(R.id.toast_type);
        TextView textImageViewLeft=(TextView)layout.findViewById(R.id.textImageViewLeft);
        ImageView imgImageVewLeft=(ImageView)layout.findViewById(R.id.imgImageViewLeft);
        TextView textImageViewTop=(TextView)layout.findViewById(R.id.textImageViewTop);
        ImageView imgImageViewTop=(ImageView)layout.findViewById(R.id.imgImageViewTop);
        textImageViewTop.setVisibility(View.GONE);
        textImageViewLeft.setVisibility(View.GONE);
        FA.addTo(textImageViewTop);
        FA.addTo(linearLayout);
        if(!showTopIcon)
            imgImageViewTop.setVisibility(View.GONE);
        switch (type){
            case SUCCESS:
                linearLayout.setBackgroundResource(R.drawable.success_shape);
                break;
            case INFO:
                linearLayout.setBackgroundResource(R.drawable.info_shape);
                break;
            case WARNING:
                linearLayout.setBackgroundResource(R.drawable.warning_shape);
                break;
            case ERROR:
                linearLayout.setBackgroundResource(R.drawable.error_shape);
                break;
            case CONFUSING:
                linearLayout.setBackgroundResource(R.drawable.confusing_shape);
                break;
            default:
                linearLayout.setBackgroundResource(R.drawable.default_shape);
        }
        text.setText(message);
        imgImageVewLeft.setImageResource(leftFAICon);
        imgImageViewTop.setImageResource(topFAIcon);
        textImageViewLeft.setTextColor(leftImgColor);
        text.setTextColor(textColor);
        text.setTextSize(textSize);
        text.setTypeface(typeface);
        return layout;
    }

    private View makeView(Context context,String message,int type,boolean showIcon){
        FA.with(context).initialize();
        View layout = LayoutInflater.from(context).inflate(R.layout.toast_layout, null, false);
        TextView text = (TextView) layout.findViewById(R.id.toast_text);
        RelativeLayout linearLayout=(RelativeLayout) layout.findViewById(R.id.toast_type);
        TextView textImageViewLeft=(TextView)layout.findViewById(R.id.textImageViewLeft);
        ImageView imgImageVewLeft=(ImageView)layout.findViewById(R.id.imgImageViewLeft);
        TextView textImageViewTop=(TextView)layout.findViewById(R.id.textImageViewTop);
        ImageView imgImageViewTop=(ImageView)layout.findViewById(R.id.imgImageViewTop);
        imgImageViewTop.setVisibility(View.GONE);
        imgImageVewLeft.setVisibility(View.GONE);
        FA.addTo(textImageViewTop);
        FA.addTo(linearLayout);
        if(!showIcon)
            textImageViewTop.setVisibility(View.GONE);
        String leftIcon=FA.FA_ANDROID;
        int topColor=Color.parseColor("#4CAF50");
        switch (type){
            case SUCCESS:
                linearLayout.setBackgroundResource(R.drawable.success_shape);
                leftIcon=defaultSuccess;
                topColor=Color.parseColor("#4CAF50");
                break;
            case INFO:
                linearLayout.setBackgroundResource(R.drawable.info_shape);
                leftIcon=defaultInfo;
                topColor=Color.parseColor("#3F51B5");
                break;
            case WARNING:
                linearLayout.setBackgroundResource(R.drawable.warning_shape);
                leftIcon=defaultWarning;
                topColor=Color.parseColor("#FF9800");
                break;
            case ERROR:
                linearLayout.setBackgroundResource(R.drawable.error_shape);
                leftIcon=defaultError;
                topColor=Color.parseColor("#F44336");
                break;
            case CONFUSING:
                linearLayout.setBackgroundResource(R.drawable.confusing_shape);
                leftIcon=defaultConfusing;
                topColor=Color.parseColor("#607D8B");
                break;
            default:
                linearLayout.setBackgroundResource(R.drawable.default_shape);
                leftIcon=defaultDefault;
                topColor=Color.parseColor("#3d3a3a");
        }
        text.setText(message);
        textImageViewLeft.setText(leftIcon);
        textImageViewTop.setTextColor(topColor);
        return layout;
    }

}
