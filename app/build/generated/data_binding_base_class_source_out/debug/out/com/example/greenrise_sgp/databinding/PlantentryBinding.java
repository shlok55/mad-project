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

public final class PlantentryBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ImageView deletelogo;

  @NonNull
  public final TextView plantabout;

  @NonNull
  public final ImageView plantimage;

  @NonNull
  public final TextView plantname;

  @NonNull
  public final TextView plantprice;

  @NonNull
  public final TextView plantprice1;

  @NonNull
  public final TextView plantquantity;

  @NonNull
  public final TextView plantquantity1;

  @NonNull
  public final ImageView updatelogo;

  private PlantentryBinding(@NonNull CardView rootView, @NonNull ImageView deletelogo,
      @NonNull TextView plantabout, @NonNull ImageView plantimage, @NonNull TextView plantname,
      @NonNull TextView plantprice, @NonNull TextView plantprice1, @NonNull TextView plantquantity,
      @NonNull TextView plantquantity1, @NonNull ImageView updatelogo) {
    this.rootView = rootView;
    this.deletelogo = deletelogo;
    this.plantabout = plantabout;
    this.plantimage = plantimage;
    this.plantname = plantname;
    this.plantprice = plantprice;
    this.plantprice1 = plantprice1;
    this.plantquantity = plantquantity;
    this.plantquantity1 = plantquantity1;
    this.updatelogo = updatelogo;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static PlantentryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PlantentryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.plantentry, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PlantentryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.deletelogo;
      ImageView deletelogo = ViewBindings.findChildViewById(rootView, id);
      if (deletelogo == null) {
        break missingId;
      }

      id = R.id.plantabout;
      TextView plantabout = ViewBindings.findChildViewById(rootView, id);
      if (plantabout == null) {
        break missingId;
      }

      id = R.id.plantimage;
      ImageView plantimage = ViewBindings.findChildViewById(rootView, id);
      if (plantimage == null) {
        break missingId;
      }

      id = R.id.plantname;
      TextView plantname = ViewBindings.findChildViewById(rootView, id);
      if (plantname == null) {
        break missingId;
      }

      id = R.id.plantprice;
      TextView plantprice = ViewBindings.findChildViewById(rootView, id);
      if (plantprice == null) {
        break missingId;
      }

      id = R.id.plantprice1;
      TextView plantprice1 = ViewBindings.findChildViewById(rootView, id);
      if (plantprice1 == null) {
        break missingId;
      }

      id = R.id.plantquantity;
      TextView plantquantity = ViewBindings.findChildViewById(rootView, id);
      if (plantquantity == null) {
        break missingId;
      }

      id = R.id.plantquantity1;
      TextView plantquantity1 = ViewBindings.findChildViewById(rootView, id);
      if (plantquantity1 == null) {
        break missingId;
      }

      id = R.id.updatelogo;
      ImageView updatelogo = ViewBindings.findChildViewById(rootView, id);
      if (updatelogo == null) {
        break missingId;
      }

      return new PlantentryBinding((CardView) rootView, deletelogo, plantabout, plantimage,
          plantname, plantprice, plantprice1, plantquantity, plantquantity1, updatelogo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
