package cd.sixty.Fsixty;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class Asixty extends AppCompatActivity {


    private static final int BASE = 60;
    private Integer images[] = {R.drawable.a0, R.drawable.a1, R.drawable.a2};
    private int currImage = 0;

    private static final String ANSWER_STRING = "Result: %s %s %s equals %s which is %s,%s";
    private int a = 0;
    private int b = 0;
    private EditText inputBox1;
    private EditText inputBox2;
    private TextView answerView;
    private int resultingNumberOfSixtys;
    private int resultingRemainderOfSixtys;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asixty);

        setInitialImage();
        setImageRotateListener();
    }
    private void setImageRotateListener() {
        final Button rotatebutton = (Button) findViewById(R.id.btnChangeImage);
        rotatebutton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                currImage++;
                if (currImage == 3) {
                    currImage = 0;
                }
                setCurrentImage();
            }
        });
    }

    private void setInitialImage() {
        setCurrentImage();
    }

    private void setCurrentImage() {

        final ImageView imageView = (ImageView) findViewById(R.id.imageView1);
        imageView.setImageResource(images[currImage]);

    }

{
        setContentView(R.layout.activity_asixty);

        initializeElements();

        enableMultiply();
        enableDivide();
        enableAdd();
        enableSubtract();
    }

    public void initializeElements() {
        inputBox1 = findViewById(R.id.int1);
        inputBox2 = findViewById(R.id.int2);
        answerView = findViewById(R.id.answer);
    }

    public void enableMultiply() {

        findViewById(R.id.multiplyButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getInputValues();
                final int sum = a * b;
                sixtyify(sum);
                getAnswer("X", sum, resultingNumberOfSixtys, resultingRemainderOfSixtys);
            }
        });
    }

    public void enableDivide() {

        findViewById(R.id.divideButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getInputValues();
                final int sum = a / b;
                sixtyify(sum);
                getAnswer("/", sum, resultingNumberOfSixtys, resultingRemainderOfSixtys);
            }
        });
    }

    public void enableAdd() {

        findViewById(R.id.addButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getInputValues();
                final int sum = a + b;
                sixtyify(sum);
                getAnswer("+", sum, resultingNumberOfSixtys, resultingRemainderOfSixtys);
            }
        });
    }

    public void enableSubtract() {

        findViewById(R.id.subtractButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getInputValues();
                final int sum = a - b;
                sixtyify(sum);
                getAnswer("-", sum, resultingNumberOfSixtys, resultingRemainderOfSixtys);
            }
        });
    }

    public void getAnswer(final String sign,
                          final int product,
                          final int numOfSixtys,
                          final int remOfSixtys) {

        final String answer = String.format(ANSWER_STRING, a, sign, b, product, numOfSixtys, remOfSixtys);
        Log.d("Base60", answer);
        answerView.setText(answer);
    }

    public void getInputValues() {
        a = Integer.parseInt(String.valueOf(inputBox1.getText()));
        b = Integer.parseInt(String.valueOf(inputBox2.getText()));
    }

    public void sixtyify(int decimalToBeConverted) {
        resultingNumberOfSixtys = (int) Math.floor(decimalToBeConverted / BASE);
        resultingRemainderOfSixtys = decimalToBeConverted % BASE;
    }
}
