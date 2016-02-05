/*
 * Copyright (c) 2015-present, Parse, LLC.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package com.Beye.BeyeApp.onStart;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseFacebookUtils;
import com.parse.ParseInstallation;
import com.parse.ParseUser;


public class StarterApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
      // Enable Local Datastore.
      Parse.enableLocalDatastore(this);
      // Add your initialization code here
    //Parse.initialize(this, "hQZZmu2UGiwr2QTHXrPSjG3ywAkFZccKQu12fD1S", "GrfOhItS94I63EmV0MkKzx8m97mm0Gm0pft2SyZr");
    Parse.initialize(this, Keys.applicationId, Keys.clientKey);
    //ParseFacebookUtils.initialize(this);
    ParseUser.enableAutomaticUser();
//
    //ParseACL defaultACL = new ParseACL();
    // Optionally enable public read access.
    // defaultACL.setPublicReadAccess(true);
    //ParseACL.setDefaultACL(defaultACL, true);

    ParseInstallation.getCurrentInstallation().saveInBackground();


  }
}
