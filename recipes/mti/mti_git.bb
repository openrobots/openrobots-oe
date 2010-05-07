#DEFAULT_PREFERENCE = "-1"

DESCRIPTION = "xSens/MTI IMU drivers and test program"
LICENSE = "BSD"
HOMEPAGE = "http://softs.laas.fr/openrobots/"
DEPENDS = "mkdep-native"
SRCREV = "63d1948"
PN = "mti"
PV = "0.4+git${SRCREV}"
PR = "r0"

SRC_URI = "git://softs.laas.fr/git/robots/MTI-libs;protocol=ssh"

S = "${WORKDIR}/git"

inherit pkgconfig autotools

EXTRA_OECONF += "MKDEP=${STAGING_DIR}/${BUILD_SYS}/usr/bin/mkdep"
