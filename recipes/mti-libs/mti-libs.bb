DESCRIPTION = "xSense/MTI IMU drivers and test program"
LICENSE = "BSD"
HOMEPAGE = "http://softs.laas.fr/openrobots/"
DEPENDS = "mkdep-native"
PN = "mti-libs"
PV = "0.4"
PR = "r0"

MASTER_SITE_OPENROBOTS = "http://softs.laas.fr/openrobots/distfiles"
SRC_URI = "${MASTER_SITE_OPENROBOTS}/MTI-0.4.tar.gz;name=archive"

SRC_URI[archive.md5sum] = "f34705b3680050bbd66f56436a893001"
SRC_URI[archive.sha256sum] = "09336629907990a395a4c0ac9cd60483cccd27f96e04f68ad7270acb973b80ac"

S = "${WORKDIR}/MTI-0.4"

inherit pkgconfig autotools

EXTRA_OECONF += "MKDEP=${STAGING_DIR}/${BUILD_SYS}/usr/bin/mkdep"

FILES_${PN} = "\
	    bin/MTIHardTest \
	    include/MTI-clients/MTComm.h \
	    include/MTI-clients/MTI.h \
	    include/MTI-clients/structMTI.h \
	    lib/libMTI.la \
	    lib/pkgconfig/MTI-clients.pc \
	    "

	   

