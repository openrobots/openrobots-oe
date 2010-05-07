require gbx-common.inc

DESCRIPTION = "Flexiport (interface for a range of data port types)"
DEPENDS = "gbx-share"
RDEPENDS = ""
PN = "gbx-flexiport"
PR = "r1"

EXTRA_OECMAKE += "-DENABLE_LIB_FLEXIPORT=ON"

FILES_${PN} = "${bindir} ${libdir}/gearbox/lib*${SOLIBS}"
FILES_${PN}-dev = "${includedir} ${libdir}/gearbox/lib*${SOLIBDEV} \
		${libdir}/gearbox/*.cmake \
		${libdir}/pkgconfig ${datadir}/gearbox/flexiport"
