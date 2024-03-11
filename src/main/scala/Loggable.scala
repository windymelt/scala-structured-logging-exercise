package io.github.windymelt.structuredloggingexample

import java.lang.System.Logger.Level

/** 継承することでロガーを利用できるようにする。
  */
trait Loggable {
  self =>
  lazy val logger: java.lang.System.Logger =
    java.lang.System.getLogger(self.getClass().getName())

  extension (l: java.lang.System.Logger) {
    inline def info(msg: String)  = logger.log(Level.INFO, msg)
    inline def warn(msg: String)  = logger.log(Level.WARNING, msg)
    inline def error(msg: String) = logger.log(Level.ERROR, msg)
    inline def debug(msg: String) = logger.log(Level.DEBUG, msg)
  }
}