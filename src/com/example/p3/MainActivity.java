package com.example.p3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener{
	//Números
	private Button btn1;
	private Button btn2;
	private Button btn3;
	private Button btn4;
	private Button btn5;
	private Button btn6;
	private Button btn7;
	private Button btn8;
	private Button btn9;
	private Button btn0;
	
	//Operaciones
	private Button btnSumar;
	private Button btnRestar;
	private Button btnMultiplicar;
	private Button btnDividir;
	private Button btnIgual;
	private Button btnLimpiar;
	
	//EditText donde se introduce el número
	private EditText resultado;
	
	//Variables donde guardar el resultado
	private int temporal;
	
	//Bandera para indicar opereacion
	private int operacion;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btn0 	= (Button) findViewById(R.id.btn0);
		btn1 	= (Button) findViewById(R.id.btn1);
		btn2  	= (Button) findViewById(R.id.btn2);
		btn3 	= (Button) findViewById(R.id.btn3);
		btn4 	= (Button) findViewById(R.id.btn4);
		btn5	= (Button) findViewById(R.id.btn5);
		btn6	= (Button) findViewById(R.id.btn6);
		btn7 	= (Button) findViewById(R.id.btn7);
		btn8 	= (Button) findViewById(R.id.btn8);
		btn9	= (Button) findViewById(R.id.btn9);
		
		btnSumar = (Button) findViewById(R.id.btnSuma);
		btnRestar = (Button) findViewById(R.id.btnResta);
		btnMultiplicar = (Button) findViewById(R.id.btnMultiplicacion);
		btnDividir = (Button) findViewById(R.id.btnDivision);
		btnLimpiar = (Button) findViewById(R.id.btnClear);
		btnIgual = (Button) findViewById(R.id.btnIgual);
		
		resultado = (EditText) findViewById(R.id.txtResultado);
		
		btn0.setOnClickListener(this);
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
		btn3.setOnClickListener(this);
		btn4.setOnClickListener(this);
		btn5.setOnClickListener(this);
		btn6.setOnClickListener(this);
		btn7.setOnClickListener(this);
		btn8.setOnClickListener(this);
		btn9.setOnClickListener(this);
		btnSumar.setOnClickListener(this);
		btnRestar.setOnClickListener(this);
		btnMultiplicar.setOnClickListener(this);
		btnDividir.setOnClickListener(this);
		btnIgual.setOnClickListener(this);
		btnLimpiar.setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		switch(view.getId())
		{
			//Números
			case R.id.btn0: resultado.append(btn0.getText().toString());break;
			case R.id.btn1: resultado.append(btn1.getText().toString());break;
			case R.id.btn2: resultado.append(btn2.getText().toString());break;
			case R.id.btn3: resultado.append(btn3.getText().toString());break;
			case R.id.btn4: resultado.append(btn4.getText().toString());break;
			case R.id.btn5: resultado.append(btn5.getText().toString());break;
			case R.id.btn6: resultado.append(btn6.getText().toString());break;
			case R.id.btn7: resultado.append(btn7.getText().toString());break;
			case R.id.btn8: resultado.append(btn8.getText().toString());break;
			case R.id.btn9: resultado.append(btn9.getText().toString());break;
			
			//Operaciones;
			case R.id.btnClear:
				resultado.setText("");
				temporal = 0;
				operacion = 0;
				break;
			case R.id.btnSuma:
				temporal = temporal + Integer.parseInt(resultado.getText().toString());
				operacion = 1;
				resultado.setText("");
				break;
			case R.id.btnResta:
				temporal = temporal - Integer.parseInt(resultado.getText().toString());
				operacion = 2;
				resultado.setText("");
				break;
			case R.id.btnMultiplicacion:
				temporal = temporal * Integer.parseInt(resultado.getText().toString());
				operacion = 3;
				resultado.setText("");
				break;
			case R.id.btnDivision:
				temporal = temporal / Integer.parseInt(resultado.getText().toString());
				operacion = 4;
				resultado.setText("");
				break;
			case R.id.btnIgual:
				hacerOperacion();
				resultado.setText(Integer.toString(temporal));
				break;
		}
	}


	public void hacerOperacion(){
		switch(operacion)
		{
			case 1:temporal += Integer.parseInt(resultado.getText().toString());
				break;
			case 2:temporal -= Integer.parseInt(resultado.getText().toString());;
				break;
			case 3:temporal *= Integer.parseInt(resultado.getText().toString());
				break;
			case 4:temporal /= Integer.parseInt(resultado.getText().toString());
				break;
			default: 
				temporal = 0;
				break;
		}
	}
}
