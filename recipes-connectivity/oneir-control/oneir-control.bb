SUMMARY = "oneir control"
SECTION = "libs"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "git://github.com/fvanderwerf/oneir-control.git;protocol=git;rev=master"

S = "${WORKDIR}/git"

DEPENDS = "json-c"

RDEPENDS_${pn} = "socat rabbitmq-c"

inherit autotools pkgconfig
