include gbx-common.inc 

DESCRIPTION = "Gearbox (shared files)"
DEPENDS = ""
PN = "gbx-share"
PR = "r0"

EXTRA_OECMAKE += "-DGBX_INSTALL_CMAKE_SCRIPTS=ON"

FILES_${PN} = ${datadir}/gearbox ${libdir}/gearbox
