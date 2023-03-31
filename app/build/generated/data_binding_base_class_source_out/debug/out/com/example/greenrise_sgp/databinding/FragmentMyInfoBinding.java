// Generated by view binder compiler. Do not edit!
package com.example.greenrise_sgp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.greenrise_sgp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentMyInfoBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final TextView Contact;

  @NonNull
  public final TextView Email;

  @NonNull
  public final TextView SQuote;

  @NonNull
  public final TextView UserInfo;

  @NonNull
  public final TextView Username;

  @NonNull
  public final ImageView imageView;

  private FragmentMyInfoBinding(@NonNull FrameLayout rootView, @NonNull TextView Contact,
      @NonNull TextView Email, @NonNull TextView SQuote, @NonNull TextView UserInfo,
      @NonNull TextView Username, @NonNull ImageView imageView) {
    this.rootView = rootView;
    this.Contact = Contact;
    this.Email = Email;
    this.SQuote = SQuote;
    this.UserInfo = UserInfo;
    this.Username = Username;
    this.imageView = imageView;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMyInfoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMyInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_my_info, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMyInfoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Contact;
      TextView Contact = ViewBindings.findChildViewById(rootView, id);
      if (Contact == null) {
        break missingId;
      }

      id = R.id.Email;
      TextView Email = ViewBindings.findChildViewById(rootView, id);
      if (Email == null) {
        break missingId;
      }

      id = R.id.SQuote;
      TextView SQuote = ViewBindings.findChildViewById(rootView, id);
      if (SQuote == null) {
        break missingId;
      }

      id = R.id.UserInfo;
      TextView UserInfo = ViewBindings.findChildViewById(rootView, id);
      if (UserInfo == null) {
        break missingId;
      }

      id = R.id.Username;
      TextView Username = ViewBindings.findChildViewById(rootView, id);
      if (Username == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      return new FragmentMyInfoBinding((FrameLayout) rootView, Contact, Email, SQuote, UserInfo,
          Username, imageView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}