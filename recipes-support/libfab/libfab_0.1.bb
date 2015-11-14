SUMMARY = "Fab library"
SECTION = "libs"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "git://github.com/fvanderwerf/fab.git;protocol=git;tag=v0.1"

S = "${WORKDIR}/git"

inherit autotools
