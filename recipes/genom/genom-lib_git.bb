DESCRIPTION = "OpenRobots module generation tool"
LICENSE = "BSD"

PV = "0.0+git${SRCDATE}"
PR = "r1"

inherit autotools pkgconfig

DEPENDS = mkdep-native pocolibs tcl

EXTRA_OECONF = "--with-libsonly"
EXTRA_OECONF += "--with-tcl=${STAGING_BINDIR_CROSS}"
EXTRA_OECONF += "MKDEP=${STAGING_DIR}/${BUILD_SYS}/usr/bin/mkdep"

S = "${WORKDIR}/git"

SRC_URI = "git://trac.laas.fr/git/robots/genom.git;protocol=ssh;tag=master"

do_stage() {
        autotools_stage_all
}
