package io.groovy.script.lsp.server

import cats.effect.IOApp
import cats.effect.IO

object Main extends IOApp.Simple {

  // This is your new "main"!
  def run: IO[Unit] =
    HelloWorld.say().flatMap(IO.println)
}
