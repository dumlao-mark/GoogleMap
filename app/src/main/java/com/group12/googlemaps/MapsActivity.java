package com.group12.googlemaps;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);

        //UCU
        LatLng ucu = new LatLng(15.98063, 120.56061);

        //Secondary Schools
        //Dumlao
        LatLng Toboy = new LatLng(16.02727,120.63525);
        //Malqued
        LatLng Artacho = new LatLng(15.97450, 120.57182);
        //Dulay
        LatLng Rosario = new LatLng(16.22946, 120.48826);

        //Dumlao's House to UCU
        LatLng bes = new LatLng(16.03756, 120.63523);
        LatLng toboy = new LatLng(16.02683, 120.63294);
        LatLng palaris = new LatLng(16.02821, 120.62941);
        LatLng calepaan = new LatLng(16.01473, 120.61689);
        LatLng nancalobasaan = new LatLng(16.00857, 120.60238);
        LatLng Kurbaan = new LatLng(16.00890, 120.61295);
        LatLng HolyTrinityChurch = new LatLng(16.00844, 120.60178);
        LatLng cayambanancurve = new LatLng(16.00640, 120.59882);
        LatLng cayambanan = new LatLng(15.99877, 120.59169);
        LatLng underTPLEX = new LatLng(15.99358, 120.58697);
        LatLng markHotel = new LatLng(15.98733, 120.58203);
        LatLng malapitsaHungerBuster =new LatLng(15.98196, 120.57966);
        LatLng san_vicente = new LatLng(15.97924, 120.57100);
        LatLng JcGasHouse = new LatLng(15.97886, 120.56605);
        LatLng medyoKurbaan = new LatLng(15.97898, 120.56532);
        LatLng ucuGate = new LatLng(15.98180, 120.56014);

        //Dulay's House to UCU
        LatLng first = new LatLng(16.25759, 120.48069);
        LatLng cleanFuel = new LatLng(16.22521, 120.49834);
        LatLng saitan = new LatLng(16.22352, 120.50379);
        LatLng CDO = new LatLng(16.20979, 120.50388);
        LatLng klainFurniture = new LatLng(16.20766, 120.51158);
        LatLng INC = new LatLng(16.20047, 120.51477);
        LatLng Buyagao = new LatLng(16.17756, 120.51524);
        LatLng mjBalasa = new LatLng(16.16510, 120.52088);
        LatLng mayForever = new LatLng(16.13704, 120.52499);
        LatLng GasStation = new LatLng(16.13168, 120.52931);
        LatLng Tplex = new LatLng(16.12869, 120.52141);
        LatLng TplexPaikot1 = new LatLng(16.12915, 120.52085);
        LatLng TplexPaikot2 = new LatLng(16.12947, 120.52110);
        LatLng TplexPaikot3 = new LatLng(16.12949, 120.52173);
        LatLng E1MilkTea = new LatLng(16.02897, 120.56536);
        LatLng urdKurba = new LatLng(16.00512, 120.58264);
        LatLng TPLEXUrdExit = new LatLng(16.00208, 120.57980);
        LatLng TPLEX1stSegment = new LatLng(16.00157, 120.57603);
        LatLng DZPS = new LatLng(15.99096, 120.57363);
        LatLng camilla = new LatLng(15.99400, 120.55784);
        LatLng camilla2 = new LatLng(15.98450, 120.55569);

        //Dumlao Home
        LatLng DumlaoHome = new LatLng(16.037259,120.634477);
        //Dulay Home
        LatLng DulayHome = new LatLng(16.25753, 120.48049);

        //Malqued House to UCU
        LatLng Andoks = new LatLng(15.97439, 120.57170);
        LatLng crossing1 = new LatLng(15.97580, 120.57078);
        LatLng crossing2 = new LatLng(15.97596, 120.57072);

        //Secondary Schools
        //Dumlao School
        mMap.addMarker(new MarkerOptions().position(Toboy).title("Toboy National High School").snippet("Dumlao's School"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Toboy));
        mMap.addCircle(new CircleOptions()
                .center(Toboy)
                .radius(50)
                .strokeWidth(5)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(128,255,0,0)));

        //Malqued School
        mMap.addMarker(new MarkerOptions().position(Artacho).title("Artacho National High School").snippet("Malqued's School"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Artacho));
        mMap.addCircle(new CircleOptions()
                .center(Artacho)
                .radius(50)
                .strokeWidth(5)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(128,255,0,0)));

        //Dulay School
        mMap.addMarker(new MarkerOptions().position(Rosario).title("Rosario Integrated School").snippet("Dulay's School"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Rosario));
        mMap.addCircle(new CircleOptions()
                .center(Rosario)
                .radius(50)
                .strokeWidth(5)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(128,255,0,0)));

        //Houses of Members
        //Dumlao House
        mMap.addMarker(new MarkerOptions().position(DumlaoHome).title("Mark Dumlao House"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(DumlaoHome));
        mMap.addCircle(new CircleOptions()
                .center(DumlaoHome)
                .radius(50)
                .strokeWidth(5)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(128,255,0,0)));

        //Dulay House
        mMap.addMarker(new MarkerOptions().position(DulayHome).title("Mark Oliver Dulay House"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(DulayHome));
        mMap.addCircle(new CircleOptions()
                .center(DulayHome)
                .radius(50)
                .strokeWidth(5)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(128,255,0,0)));

        //Malqued House to UCU Polyline
        /*mMap.addPolyline(new PolylineOptions()
                .add(Artacho, Andoks, crossing1, crossing2, san_vicente, JcGasHouse, medyoKurbaan, ucuGate, ucu)
                .width(10)
                .color(Color.RED));*/

        //Dumlao House TO UCU Polyline
        mMap.addPolyline(new PolylineOptions()
                .add(DumlaoHome, bes, toboy, palaris, calepaan, Kurbaan, nancalobasaan, HolyTrinityChurch, cayambanancurve, cayambanan, underTPLEX, markHotel, malapitsaHungerBuster, san_vicente, JcGasHouse, medyoKurbaan, ucuGate, ucu)
                .width(5)
                .color(Color.BLUE));

        //Dulay House TO UCU Polyline
        mMap.addPolyline(new PolylineOptions()
                .add(first, cleanFuel, saitan, CDO, klainFurniture, INC, Buyagao, mjBalasa, mayForever, GasStation, Tplex, TplexPaikot1, TplexPaikot2, TplexPaikot3, E1MilkTea, urdKurba, TPLEXUrdExit, TPLEX1stSegment, DZPS, camilla, camilla2,  ucuGate, ucu)
                .width(5)
                .color(Color.WHITE));
        // UCU
        mMap.addMarker(new MarkerOptions().position(ucu).title("Urdaneta City University"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ucu));
        mMap.addCircle(new CircleOptions()
                .center(ucu)
                .radius(50)
                .strokeWidth(5)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(128,255,0,0)));
    }
}