package naseem.ali.atoast;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import naseem.ali.flexibletoast.EasyToast;
import naseem.ali.flexibletoast.FA;
import naseem.ali.flexibletoast.ToastBuilder;

public class MainActivity extends AppCompatActivity {

    private int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast((i++)%6);
            }
        });
    }

    public void showToast(int number){
        String text="Just Some Text";
        EasyToast.makeText(this,text,EasyToast.LENGTH_SHORT,number,false).show();
        EasyToast.makeText(this,text,EasyToast.LENGTH_SHORT,number).show();
        EasyToast easyToast=new ToastBuilder(this)
                .textSize(16)
                .leftIcon(R.drawable.confusing_shape)
                .textColor(Color.WHITE)
                .showTopIcon(true)
                .topIcon(FA.FA_ANGELLIST)
                .text("That's An Easy Toast")
                .type(EasyToast.SUCCESS)
                .build();
        easyToast.show();
    }
}
