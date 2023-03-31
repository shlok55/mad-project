// Generated by view binder compiler. Do not edit!
package com.example.greenrise_sgp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.greenrise_sgp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySellerRegisterBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final EditText ConfRegPasswd;

  @NonNull
  public final EditText Email;

  @NonNull
  public final EditText Name;

  @NonNull
  public final EditText Phone;

  @NonNull
  public final EditText RegPasswd;

  @NonNull
  public final Spinner SellerType;

  @NonNull
  public final EditText UPIid;

  @NonNull
  public final TextView googlesignin;

  @NonNull
  public final TextView logtv;

  @NonNull
  public final Button passbtn;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView textView6;

  private ActivitySellerRegisterBinding(@NonNull RelativeLayout rootView,
      @NonNull EditText ConfRegPasswd, @NonNull EditText Email, @NonNull EditText Name,
      @NonNull EditText Phone, @NonNull EditText RegPasswd, @NonNull Spinner SellerType,
      @NonNull EditText UPIid, @NonNull TextView googlesignin, @NonNull TextView logtv,
      @NonNull Button passbtn, @NonNull TextView textView5, @NonNull TextView textView6) {
    this.rootView = rootView;
    this.ConfRegPasswd = ConfRegPasswd;
    this.Email = Email;
    this.Name = Name;
    this.Phone = Phone;
    this.RegPasswd = RegPasswd;
    this.SellerType = SellerType;
    this.UPIid = UPIid;
    this.googlesignin = googlesignin;
    this.logtv = logtv;
    this.passbtn = passbtn;
    this.textView5 = textView5;
    this.textView6 = textView6;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySellerRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySellerRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_seller_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySellerRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ConfRegPasswd;
      EditText ConfRegPasswd = ViewBindings.findChildViewById(rootView, id);
      if (ConfRegPasswd == null) {
        break missingId;
      }

      id = R.id.Email;
      EditText Email = ViewBindings.findChildViewById(rootView, id);
      if (Email == null) {
        break missingId;
      }

      id = R.id.Name;
      EditText Name = ViewBindings.findChildViewById(rootView, id);
      if (Name == null) {
        break missingId;
      }

      id = R.id.Phone;
      EditText Phone = ViewBindings.findChildViewById(rootView, id);
      if (Phone == null) {
        break missingId;
      }

      id = R.id.RegPasswd;
      EditText RegPasswd = ViewBindings.findChildViewById(rootView, id);
      if (RegPasswd == null) {
        break missingId;
      }

      id = R.id.SellerType;
      Spinner SellerType = ViewBindings.findChildViewById(rootView, id);
      if (SellerType == null) {
        break missingId;
      }

      id = R.id.UPIid;
      EditText UPIid = ViewBindings.findChildViewById(rootView, id);
      if (UPIid == null) {
        break missingId;
      }

      id = R.id.googlesignin;
      TextView googlesignin = ViewBindings.findChildViewById(rootView, id);
      if (googlesignin == null) {
        break missingId;
      }

      id = R.id.logtv;
      TextView logtv = ViewBindings.findChildViewById(rootView, id);
      if (logtv == null) {
        break missingId;
      }

      id = R.id.passbtn;
      Button passbtn = ViewBindings.findChildViewById(rootView, id);
      if (passbtn == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = ViewBindings.findChildViewById(rootView, id);
      if (textView6 == null) {
        break missingId;
      }

      return new ActivitySellerRegisterBinding((RelativeLayout) rootView, ConfRegPasswd, Email,
          Name, Phone, RegPasswd, SellerType, UPIid, googlesignin, logtv, passbtn, textView5,
          textView6);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}