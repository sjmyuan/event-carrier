package com.carrier.domain.ports

trait Receiver[M[_]] {

  def receive[A](event: A): M[Unit]
}
