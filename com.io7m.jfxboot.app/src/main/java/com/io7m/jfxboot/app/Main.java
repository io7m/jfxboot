/*
 * Copyright © 2022 Mark Raynsford <code@io7m.com> https://www.io7m.com
 *
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY
 * SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR
 * IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */

package com.io7m.jfxboot.app;

import com.io7m.jfxboot.app.internal.MainApplication;
import javafx.application.Platform;
import javafx.stage.Stage;

/**
 * The main entry point.
 */

public final class Main
{
  private Main()
  {

  }

  /**
   * The main entry point.
   * @param args Command-line arguments
   */

  public static void main(
    final String[] args)
  {
    /*
     * Start up JavaFX and create the main application. Create a window
     * and tell the application to populate it with a scene. If anything
     * fails, complain about it and then quit.
     */

    Platform.startup(() -> {
      try {
        final var stage = new Stage();
        final var app = new MainApplication();
        app.start(stage);
      } catch (final Exception e) {
        e.printStackTrace();
        Platform.exit();
      }
    });
  }
}
