DESCRIPTION = "Genom demo module"
LICENSE = "BSD"

PV = "0.0+git${SRCDATE}"

inherit autotools pkgconfig

DEPENDS = mkdep-native genom-lib pocolibs tcl

S = "${WORKDIR}/git"

EXTRA_OECONF = "MKDEP=${STAGING_DIR}/${BUILD_SYS}/usr/bin/mkdep"

SRC_URI = "git://trac.laas.fr/git/robots/demo-genom.git;protocol=ssh;tag=master"

do_generate () {
	echo "generating module..."
	cd ${S}; genom demo.gen
}

addtask generate before do_configure after do_patch
