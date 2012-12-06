package com.eventivities.android;

import com.eventivities.android.R;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
	// Prueba
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        /*
        final Button b=(Button) findViewById(R.id.buttonProductos);
        b.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				Intent i = new Intent(MainActivity.this, EjemploActivity.class);
				startActivity(i);				
			}
		});
        */
    }

    public void accion1(View v){
    	TnUtil.vibrar(this);
    	Toast.makeText(this,"Esto NO ESTA IMPLEMENTADO",Toast.LENGTH_SHORT).show();
    }

    public void accion2(View v){
    	TnUtil.vibrar(this);
    	/*
    	 * AQUI FALTA poner lo de poner el parametro para que solo salgan los teatros 
    	 *  es eso de pasar parametros a las activities
    	 * 
    	 * */
    	startActivity(new Intent(MainActivity.this, TodosLocales.class));
    	overridePendingTransition(R.anim.zoom_enter, R.anim.zoom_exit);
    }
    

    public void accion3(View v){
    	TnUtil.vibrar(this);
    	startActivity(new Intent(MainActivity.this, QueTengoCerca.class));
    	overridePendingTransition(R.anim.zoom_enter, R.anim.zoom_exit);
    }

    public void accion4(View v){
    	TnUtil.vibrar(this);
    	Toast.makeText(this,"Esto NO ESTA IMPLEMENTADO",Toast.LENGTH_SHORT).show();
    }
    
    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
   	 switch (item.getItemId()){
         case R.id.opcion_menu_ejemplo:
        	 	//startActivity(new Intent(MainActivity.this,Creditos.class));
        	 	//overridePendingTransition(R.anim.zoom_enter, R.anim.zoom_exit);
        	TnUtil.vibrar(this);
        	startActivity(new Intent(MainActivity.this, EjemploActivity.class));
        	overridePendingTransition(R.anim.zoom_enter, R.anim.zoom_exit);
        	break;
         case R.id.opcion_menu_prueba1:
 	    	try{
 	    	  TnUtil.vibrar(this);
  	      	  finish();
  	      	}catch (Exception e){
  	      		TnUtil.escribe("EXCEPCION :"+e.toString());
  	      	}
 	    	//showDialog(2);
        	//return super.onOptionsItemSelected(item);
   	 }
	return false;       
    }
    
}
