SUMMARY = "oneir control"
SECTION = "libs"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"
PR="1"

SRC_URI = " \
            git://github.com/fvanderwerf/oneir-control.git;protocol=git;rev=master \
            file://init_oneird \
            file://init_oneir_amqp"

S = "${WORKDIR}/git"

DEPENDS = "json-c"

RDEPENDS_${PN} = "socat rabbitmq-c"

inherit autotools pkgconfig

do_install_append() {
    install -d ${D}${sysconfdir}/init.d
    install -d ${D}${sysconfdir}/rcS.d
    install -d ${D}${sysconfdir}/rc1.d
    install -d ${D}${sysconfdir}/rc2.d
    install -d ${D}${sysconfdir}/rc3.d
    install -d ${D}${sysconfdir}/rc4.d
    install -d ${D}${sysconfdir}/rc5.d

    install -m 0755 ${WORKDIR}/init_oneird      ${D}${sysconfdir}/init.d/oneird
    install -m 0755 ${WORKDIR}/init_oneir_amqp  ${D}${sysconfdir}/init.d/oneir_amqp

    ln -sf ../init.d/oneird ${D}${sysconfdir}/rc1.d/K90oneird
    ln -sf ../init.d/oneird ${D}${sysconfdir}/rc2.d/S90oneird
    ln -sf ../init.d/oneird ${D}${sysconfdir}/rc3.d/S90oneird
    ln -sf ../init.d/oneird ${D}${sysconfdir}/rc4.d/S90oneird
    ln -sf ../init.d/oneird ${D}${sysconfdir}/rc5.d/S90oneird

    ln -sf ../init.d/oneir_amqp ${D}${sysconfdir}/rc1.d/K91oneir_amqp
    ln -sf ../init.d/oneir_amqp ${D}${sysconfdir}/rc2.d/S91oneir_amqp
    ln -sf ../init.d/oneir_amqp ${D}${sysconfdir}/rc3.d/S91oneir_amqp
    ln -sf ../init.d/oneir_amqp ${D}${sysconfdir}/rc4.d/S91oneir_amqp
    ln -sf ../init.d/oneir_amqp ${D}${sysconfdir}/rc5.d/S91oneir_amqp
}
