package android.guide.fragmentmanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mFBtnA,mFBtnB;

    public MainActivity(){
        super(R.layout.activity_main);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        if(savedInstanceState==null){
//            this cause problem when the device rotate
//        }

//          todo 6 : create fragment manager to manipulate the fragments

            FragmentManager fragmentManager = getSupportFragmentManager();

            mFBtnA = findViewById(R.id.fABtn);
            mFBtnB = findViewById(R.id.fBBtn);

            mFBtnA.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
//                    todo 7: when button a clicked : set the fragment A inside the container
//                     using beginTransaction() method
                    fragmentManager.beginTransaction()
                            .replace(R.id.fragment_container_view, FragmentA.class, null)
                            .setReorderingAllowed(true)
                            .addToBackStack("name") // name can be null
                            .commit();
                }
            });

            mFBtnB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
//                    todo 7.1: when button b clicked : set the fragment B inside the container
//                     using beginTransaction() method
                    fragmentManager.beginTransaction()
                            .replace(R.id.fragment_container_view, FragmenetB.class, null)
                            .setReorderingAllowed(true)
                            .addToBackStack("name") // name can be null
                            .commit();
                }
            });

        }


}