HOMEPAGE = "http://gearbox.sourceforge.net/"
LICENSE = "LGPLv3 and LGPLv2+ and GPLv2+"
PV = 9.11

inherit cmake pkgconfig 

SRC_URI = "${SOURCEFORGE_MIRROR}/gearbox/gearbox-9.11.tar.gz;name=archive" 
SRC_URI[archive.md5sum] = "726480f8322596c404dfd71468329761"
SRC_URI[archive.sha256sum] = "12170be6b6c477926eb4e274574d877b4ccd7230978088a61b892e6f1dbb6e08"
SRC_URI += file://DependencyUtils-cmake.patch;patch=1
SRC_URI += file://UseBasicRules-cmake.patch;patch=1
SRC_URI += file://WritePackageConfig-cmake.patch;patch=1

S="${WORKDIR}/gearbox-9.11"

# disable everything by default, let individual packages re-enable the bits
# they are interested in

EXTRA_OECMAKE = "\
	-DBUILD_TESTING=OFF \
	-DENABLE_LIB_BASICEXAMPLE=OFF \
	-DENABLE_LIB_FLEXIPORT=OFF \
	-DENABLE_LIB_GBXADVANCEDEXAMPLE=OFF \
	-DENABLE_LIB_GBXGARMINACFR=OFF \
	-DENABLE_LIB_GBXICEUTILACFR=OFF \
	-DENABLE_LIB_GBXNOVATELACFR=OFF \
	-DENABLE_LIB_GBXSERIALACFR=OFF \
	-DENABLE_LIB_GBXSICKACFR=OFF \
	-DENABLE_LIB_GBXSMARTBATTERYACFR=OFF \
	-DENABLE_LIB_GBXUTILACFR=OFF \
	-DENABLE_LIB_HOKUYO_AIST=OFF \
	\
	-DFLEXIPORT_BUILD_BINDINGS=OFF \
	-DHOKUYO_AIST_BUILD_BINDINGS=OFF \
	\
	-DGBX_INSTALL_CMAKE_SCRIPTS=OFF \
	\
	-DCMAKE_SYSTEM_PROCESSOR="x86" \
	"
