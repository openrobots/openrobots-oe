DESCRIPTION = "OpenRobots low-level os abstraction and communication library"
LICENSE = "BSD"

PV = "0.0+git${SRCDATE}"
S = "${WORKDIR}/git"
SRC_URI = "git://trac.laas.fr/git/robots/pocolibs.git;protocol=ssh;tag=master"

inherit autotools pkgconfig

DEPENDS = "mkdep-native"

EXTRA_OECONF = "MKDEP=${STAGING_DIR}/${BUILD_SYS}/usr/bin/mkdep"

do_stage() {
        autotools_stage_all
}
