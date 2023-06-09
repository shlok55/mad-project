// Generated by view binder compiler. Do not edit!
package com.example.greenrise_sgp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.greenrise_sgp.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySellerHomeBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText Pabout;

  @NonNull
  public final EditText Pname;

  @NonNull
  public final EditText Pprice;

  @NonNull
  public final EditText Pquantity;

  @NonNull
  public final Button add;

  @NonNull
  public final BottomNavigationView bottomnav;

  @NonNull
  public final ImageView pimage;

  @NonNull
  public final TextView textView7;

  @NonNull
  public final Button upload;

  @NonNull
  public final Button view;

  private ActivitySellerHomeBinding(@NonNull LinearLayout rootView, @NonNull EditText Pabout,
      @NonNull EditText Pname, @NonNull EditText Pprice, @NonNull EditText Pquantity,
      @NonNull Button add, @NonNull BottomNavigationView bottomnav, @NonNull ImageView pimage,
      @NonNull TextView textView7, @NonNull Button upload, @NonNull Button view) {
    this.rootView = rootView;
    this.Pabout = Pabout;
    this.Pname = Pname;
    this.Pprice = Pprice;
    this.Pquantity = Pquantity;
    this.add = add;
    this.bottomnav = bottomnav;
    this.pimage = pimage;
    this.textView7 = textView7;
    this.upload = upload;
    this.view = view;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySellerHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySellerHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_seller_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySellerHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Pabout;
      EditText Pabout = ViewBindings.findChildViewById(rootView, id);
      if (Pabout == null) {
        break missingId;
      }

      id = R.id.Pname;
      EditText Pname = ViewBindings.findChildViewById(rootView, id);
      if (Pname == null) {
        break missingId;
      }

      id = R.id.Pprice;
      EditText Pprice = ViewBindings.findChildViewById(rootView, id);
      if (Pprice == null) {
        break missingId;
      }

      id = R.id.Pquantity;
      EditText Pquantity = ViewBindings.findChildViewById(rootView, id);
      if (Pquantity == null) {
        break missingId;
      }

      id = R.id.add;
      Button add = ViewBindings.findChildViewById(rootView, id);
      if (add == null) {
        break missingId;
      }

      id = R.id.bottomnav;
      BottomNavigationView bottomnav = ViewBindings.findChildViewById(rootView, id);
      if (bottomnav == null) {
        break missingId;
      }

      id = R.id.pimage;
      ImageView pimage = ViewBindings.findChildViewById(rootView, id);
      if (pimage == null) {
        break missingId;
      }

      id = R.id.textView7;
      TextView textView7 = ViewBindings.findChildViewById(rootView, id);
      if (textView7 == null) {
        break missingId;
      }

      id = R.id.upload;
      Button upload = ViewBindings.findChildViewById(rootView, id);
      if (upload == null) {
        break missingId;
      }

      id = R.id.view;
      Button view = ViewBindings.findChildViewById(rootView, id);
      if (view == null) {
        break missingId;
      }

      return new ActivitySellerHomeBinding((LinearLayout) rootView, Pabout, Pname, Pprice,
          Pquantity, add, bottomnav, pimage, textView7, upload, view);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
