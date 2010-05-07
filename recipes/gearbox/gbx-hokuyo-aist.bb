include gbx-common.inc

DESCRIPTION = "Gearbox Hokuyo AIST driver for gearbox"
DEPENDS = "gbx-share gbx-flexiport"
RDEPENDS = "gbx-flexiport"
PN = "gbx-hokuyo-aist"
PR = "r0"

EXTRA_OECMAKE += "-DENABLE_LIB_HOKUYO_AIST=ON"

FILES_${PN} = "${bindir} ${libdir}/gearbox/lib*${SOLIBS}"
FILES_${PN}-dev = "${includedir} ${libdir}/gearbox/lib*${SOLIBDEV} \
		${libdir}/gearbox/*.cmake \
		${libdir}/pkgconfig/ ${datadir}/gearbox/hokuyo_aist/"
