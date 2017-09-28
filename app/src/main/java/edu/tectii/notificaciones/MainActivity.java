package edu.tectii.notificaciones;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.media.RingtoneManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    RadioButton rbt1, rbt2, rbt3, rbt4;
    NotificationManager manager;
    NotificationCompat.Builder notificacion1;
    Button btn;
    int radioselect = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        rbt1 = (RadioButton) findViewById(R.id.rbt1);
        rbt2 = (RadioButton) findViewById(R.id.rbt2);
        rbt3 = (RadioButton) findViewById(R.id.rbt3);
        rbt4 = (RadioButton) findViewById(R.id.rbt4);
        btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRadioButtonClicked(rbt1);
                metodonotificacion();
            }


        });
    }

    public void metodonotificacion() {
        switch (radioselect) {
            case 0: {
                Toast.makeText(getApplicationContext(), "selecciona un radio button", Toast.LENGTH_LONG).show();
            }
            break;
            case 1: {
                Timer timer = new Timer();

                TimerTask tt = new TimerTask() {
                    @Override
                    public void run() {
                        notificacion1 = new NotificationCompat.Builder(getApplicationContext());
                        notificacion1.setContentTitle("Titulo de notificacion");
                        notificacion1.setContentText("Hola mundo");
                        notificacion1.setSmallIcon(R.mipmap.ic_launcher);
                        notificacion1.setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION));
                        notificacion1.setPriority(NotificationCompat.PRIORITY_DEFAULT);
                        notificacion1.setTicker("texto 1");

                        Intent mismaActivity = new Intent(MainActivity.this, MainActivity.class);
                        PendingIntent intent = PendingIntent.getActivity(getApplicationContext(), 1, mismaActivity,
                                PendingIntent.FLAG_ONE_SHOT);
                        notificacion1.setContentIntent(intent);
                        manager.notify(10, notificacion1.build());
                    }
                };

                timer.schedule(tt, 5000);

            }
            break;
            case 2: {
                Timer timer = new Timer();

                TimerTask tt = new TimerTask() {
                    @Override
                    public void run() {
                        notificacion1 = new NotificationCompat.Builder(getApplicationContext());
                        notificacion1.setContentTitle("Titulo de notificacion");
                        notificacion1.setContentText("Hola mundo");
                        notificacion1.setSmallIcon(R.mipmap.ic_launcher);
                        notificacion1.setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION));
                        notificacion1.setPriority(NotificationCompat.PRIORITY_DEFAULT);
                        notificacion1.setTicker("texto 2");

                        Intent mismaActivity = new Intent(MainActivity.this, MainActivity.class);
                        PendingIntent intent = PendingIntent.getActivity(getApplicationContext(), 1, mismaActivity,
                                PendingIntent.FLAG_ONE_SHOT);
                        notificacion1.setContentIntent(intent);
                        manager.notify(20, notificacion1.build());
                    }
                };

                timer.schedule(tt, 15000);
            }
            break;
            case 3: {
                Timer timer = new Timer();

                TimerTask tt = new TimerTask() {
                    @Override
                    public void run() {
                        notificacion1 = new NotificationCompat.Builder(getApplicationContext());
                        notificacion1.setContentTitle("Titulo de notificacion");
                        notificacion1.setContentText("Hola mundo");
                        notificacion1.setSmallIcon(R.mipmap.ic_launcher);
                        notificacion1.setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION));
                        notificacion1.setPriority(NotificationCompat.PRIORITY_DEFAULT);
                        notificacion1.setTicker("texto 3");

                        Intent mismaActivity = new Intent(MainActivity.this, MainActivity.class);
                        PendingIntent intent = PendingIntent.getActivity(getApplicationContext(), 1, mismaActivity,
                                PendingIntent.FLAG_ONE_SHOT);
                        notificacion1.setContentIntent(intent);
                        manager.notify(30, notificacion1.build());
                    }
                };

                timer.schedule(tt, 30000);
            }
            break;
            case 4: {
                Timer timer = new Timer();

                TimerTask tt = new TimerTask() {
                    @Override
                    public void run() {
                        notificacion1 = new NotificationCompat.Builder(getApplicationContext());
                        notificacion1.setContentTitle("Titulo de notificacion");
                        notificacion1.setContentText("Hola mundo");
                        notificacion1.setSmallIcon(R.mipmap.ic_launcher);
                        notificacion1.setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION));
                        notificacion1.setPriority(NotificationCompat.PRIORITY_DEFAULT);
                        notificacion1.setTicker("texto 4");

                        Intent mismaActivity = new Intent(MainActivity.this, MainActivity.class);
                        PendingIntent intent = PendingIntent.getActivity(getApplicationContext(), 1, mismaActivity,
                                PendingIntent.FLAG_ONE_SHOT);
                        notificacion1.setContentIntent(intent);
                        manager.notify(40, notificacion1.build());
                    }
                };

                timer.schedule(tt, 60000);
            }
            break;
        }

    }

    public void onRadioButtonClicked(View view) {
        boolean estado = ((RadioButton) view).isChecked();
        if (view.getId() == R.id.rbt1) {
            radioselect = 1;
            rbt2.setChecked(false);
            rbt3.setChecked(false);
            rbt4.setChecked(false);

        } else if (view.getId() == R.id.rbt2) {
            radioselect = 1;
            rbt1.setChecked(false);
            rbt3.setChecked(false);
            rbt4.setChecked(false);

        } else if (view.getId() == R.id.rbt3) {
            radioselect = 1;
            rbt1.setChecked(false);
            rbt2.setChecked(false);
            rbt4.setChecked(false);

        } else if (view.getId() == R.id.rbt4) {
            radioselect = 1;
            rbt1.setChecked(false);
            rbt2.setChecked(false);
            rbt3.setChecked(false);
        }
    }
}


