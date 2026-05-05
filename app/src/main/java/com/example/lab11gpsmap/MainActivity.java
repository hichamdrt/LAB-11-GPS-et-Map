package com.example.lab11gpsmap;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import org.osmdroid.config.Configuration;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.Marker;

public class MainActivity extends AppCompatActivity {

    private MapView map;
    private Marker marker;
    private LocationManager locationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Configuration.getInstance().load(
                getApplicationContext(),
                getPreferences(MODE_PRIVATE)
        );

        setContentView(R.layout.activity_main);

        map = findViewById(R.id.map);
        map.setMultiTouchControls(true);
        map.getController().setZoom(15.0);

        locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);

        if (ActivityCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                    1);
            return;
        }

        locationManager.requestLocationUpdates(
                LocationManager.GPS_PROVIDER,
                5000,
                5,
                new LocationListener() {

                    @Override
                    public void onLocationChanged(@NonNull Location location) {

                        GeoPoint userLocation =
                                new GeoPoint(location.getLatitude(),
                                        location.getLongitude());

                        map.getController().setCenter(userLocation);

                        if (marker != null) {
                            map.getOverlays().remove(marker);
                        }

                        marker = new Marker(map);
                        marker.setPosition(userLocation);
                        marker.setTitle("Ma position");

                        map.getOverlays().add(marker);
                        map.invalidate();
                    }

                    @Override public void onStatusChanged(String provider, int status, Bundle extras) {}
                    @Override public void onProviderEnabled(@NonNull String provider) {}
                    @Override public void onProviderDisabled(@NonNull String provider) {}
                }
        );
    }

    @Override
    protected void onResume() {
        super.onResume();
        map.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        map.onPause();
    }
}