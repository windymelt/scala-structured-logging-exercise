#!/bin/sh

set -exu

cd "$(dirname $0)" || exit

sbt pack
./target/pack/bin/hello