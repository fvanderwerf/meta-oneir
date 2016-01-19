SUMMARY = "A C-language AMQP client library"
DESCRIPTION = "A C-language AMQP client library for use with v2.0+ of the RabbitMQ broker"
SECTION = "console/network"
HOMEPAGE = "https://github.com/alanxz/rabbitmq-c"
BUGTRACKER = "https://github.com/alanxz/rabbitmq-c/issues"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=6b7424f9db80cfb11fdd5c980b583f53"

SRC_URI = "https://github.com/alanxz/rabbitmq-c/releases/download/v${PV}/rabbitmq-c-${PV}.tar.gz"

SRC_URI[md5sum] = "6216c8876299a5efc4ff5ff84dc636d8"
SRC_URI[sha256sum] = "23df349a7d157543e756acc67e47b217843ecbdafaefe3e4974073bb99d8a26d"

DEPENDS = "openssl"

EXTRA_OECONF = "--enable-tools"

inherit autotools-brokensep pkgconfig
