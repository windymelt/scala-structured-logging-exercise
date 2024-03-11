package io.github.windymelt.structuredloggingexample

class Example extends Loggable {
  def run(s: String): Unit = {
    logger.info(s"Hello, $s !")
  }
}
