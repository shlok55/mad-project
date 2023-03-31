// Generated by view binder compiler. Do not edit!
package com.example.greenrise_sgp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.greenrise_sgp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class OrderentryBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ImageView orderimage;

  @NonNull
  public final TextView ordername;

  @NonNull
  public final TextView orderprice;

  @NonNull
  public final TextView orderprice1;

  @NonNull
  public final TextView orderquantity;

  @NonNull
  public final TextView orderquantity1;

  private OrderentryBinding(@NonNull CardView rootView, @NonNull ImageView orderimage,
      @NonNull TextView ordername, @NonNull TextView orderprice, @NonNull TextView orderprice1,
      @NonNull TextView orderquantity, @NonNull TextView orderquantity1) {
    this.rootView = rootView;
    this.orderimage = orderimage;
    this.ordername = ordername;
    this.orderprice = orderprice;
    this.orderprice1 = orderprice1;
    this.orderquantity = orderquantity;
    this.orderquantity1 = orderquantity1;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static OrderentryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static OrderentryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.orderentry, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static OrderentryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.orderimage;
      ImageView orderimage = ViewBindings.findChildViewById(rootView, id);
      if (orderimage == null) {
        break missingId;
      }

      id = R.id.ordername;
      TextView ordername = ViewBindings.findChildViewById(rootView, id);
      if (ordername == null) {
        break missingId;
      }

      id = R.id.orderprice;
      TextView orderprice = ViewBindings.findChildViewById(rootView, id);
      if (orderprice == null) {
        break missingId;
      }

      id = R.id.orderprice1;
      TextView orderprice1 = ViewBindings.findChildViewById(rootView, id);
      if (orderprice1 == null) {
        break missingId;
      }

      id = R.id.orderquantity;
      TextView orderquantity = ViewBindings.findChildViewById(rootView, id);
      if (orderquantity == null) {
        break missingId;
      }

      id = R.id.orderquantity1;
      TextView orderquantity1 = ViewBindings.findChildViewById(rootView, id);
      if (orderquantity1 == null) {
        break missingId;
      }

      return new OrderentryBinding((CardView) rootView, orderimage, ordername, orderprice,
          orderprice1, orderquantity, orderquantity1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}